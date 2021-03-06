package resources;

import DAOs.DepartmentDAO;
import entities.Department;
import entities.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;

public class TableEmployee extends AbstractTableModel {

    private List<Employee> employees = new ArrayList();
    private final Column[] columns
            = {
                new Column("Nome", Object.class),
                new Column("Sobrenome", String.class),
                new Column("RG", String.class),
                new Column("CPF", String.class),
                new Column("Telefone", String.class),
                new Column("Cargo", String.class),
                new Column("Nível", String.class),
                new Column("Departamento", String.class),
                new Column("Salário", Float.class)
            };

    public JComboBox offices = new JComboBox();
    public JComboBox levels = new JComboBox();
    public JComboBox departments = new JComboBox();

    private List<Department> departmentsList = Department.getAll();

    public TableEmployee() {

        offices.addItem("Diretor");
        offices.addItem("Gerente");
        offices.addItem("Analista");
        offices.addItem("Programador");
        offices.addItem("Auxiliar de Limpeza");

        levels.addItem("1");
        levels.addItem("2");
        levels.addItem("3");

        for (Department dep : departmentsList) {
            departments.addItem(dep.getName());
        }
        this.refreshTable();

    }

    @Override
    public int getRowCount() {
        return employees.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column].columnName;

    }

    @Override
    public Class getColumnClass(int column) {
        return columns[column].columnClass;

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        Employee e = employees.get(rowIndex);

        if(columnIndex == 8)
            return false;
            
        if (columnIndex == 6 && e.getSalary().getIdOffice() == 4) {
            e.getSalary().setLevel(0);
            return false;
        }
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (employees.isEmpty()) {
            return false;
        }

        Employee e = employees.get(rowIndex);
        Object[] values
                = {
                    e.getName(),
                    e.getSurname(),
                    e.getRG(),
                    e.getCPF(),
                    e.getPhone(),
                    offices.getItemAt(e.getSalary().getIdOffice()),
                    levels.getItemAt(e.getSalary().getLevel()),
                    e.getDepartment().getName(),
                    e.getSalary().getValue()
                };

        return values[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Employee e = employees.get(rowIndex);

        if (columnIndex == 0 && !Validation.validateEmpty(aValue.toString()) && Validation.validateText(aValue.toString()) ) {
            e.setName(aValue.toString());
        } else if (columnIndex == 1 && !Validation.validateEmpty(aValue.toString()) && Validation.validateText(aValue.toString())) {
            e.setSurname(aValue.toString());
        } else if (columnIndex == 2 && !Validation.validateEmpty(aValue.toString()) && Validation.validateNumber(aValue.toString())) {
            e.setRG(aValue.toString());
        } else if (columnIndex == 3 && !Validation.validateEmpty(aValue.toString()) && Validation.validateNumber(aValue.toString())) {
            e.setCPF(aValue.toString());
        } else if (columnIndex == 4 && !Validation.validateEmpty(aValue.toString()) && Validation.validateNumber(aValue.toString())) {
            e.setPhone(aValue.toString());
        } else if (columnIndex == 5 ) {
            e.getSalary().setIdOffice(offices.getSelectedIndex());

            if (e.getSalary().getIdOffice() == 4) {
                e.getSalary().setLevel(0);
            }
        } else if (columnIndex == 6) {
            e.getSalary().setLevel(levels.getSelectedIndex());
        } else if (columnIndex == 7) {
            Department dep = departmentsList.get(departments.getSelectedIndex());

            e.setDepartment(dep);

        }

        e.update();
        this.refreshTable();
    }

    public void delete(int[] rows) {
        for (int i = 0; i < rows.length; i++) {
            employees.get(rows[i]).delete();
        }
        this.refreshTable();
    }

    public void refreshTable() {

        employees = Employee.getAll();

        departmentsList = Department.getAll();

        boolean aux = true;
        boolean aux2 = true;

        for (Department dep : departmentsList) {
            for (int i = 0; i < departments.getItemCount(); i++) {
                if (dep.getName().equals(departments.getItemAt(i))) {
                    aux = false;
                }
            }
            if (aux) {
                departments.addItem(dep.getName());
            }
            aux = true;
        }

        for (int i = 0; i < departments.getItemCount(); i++) {
            for (Department dep : departmentsList) {
                if (dep.getName().equals(departments.getItemAt(i))) {
                    aux2 = false;
                }
            }
            if (aux2) {
                departments.removeItemAt(i);
            }
            aux2 = true;
        }

        //        for (Department dep : departmentsList) {
//            if (departmentModel.getIndexOf(dep.getName()) == -1) 
//                departmentModel.addElement(dep.getName());
//        }
//
//        for (int i = 0; i < departmentModel.getSize(); i++) {
//            if(departmentsList.contains(departmentModel.getElementAt(i)))
//                departmentModel.removeElement(departmentModel.getElementAt(i));
//        }
        fireTableDataChanged();
    }

    public void setEmployeeList(List<Employee> list) {
        this.employees = list == null ? new ArrayList<>() : list;
        fireTableDataChanged();
    }

    public void orderBy(int filter) {
        switch (filter) {
            case 0:
                Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee arg0, Employee arg1) {
                        return arg0.getName().compareToIgnoreCase(arg1.getName());
                    }
                });
                break;
            case 1:
                Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee arg0, Employee arg1) {
                        return arg0.getSurname().compareToIgnoreCase(arg1.getSurname());
                    }
                });
                break;
            case 2:
                Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee arg0, Employee arg1) {
                        String salary0 = ""+ arg0.getSalary().getValue();
                        String salary1 = ""+ arg1.getSalary().getValue();
                        
                        return salary1.compareToIgnoreCase(salary0);                        
                    }
                });
                break;
        }
        
        fireTableDataChanged();
    }
}
