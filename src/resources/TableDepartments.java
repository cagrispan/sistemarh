package resources;

import entities.Department;
import DAOs.DepartmentDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableDepartments extends AbstractTableModel {

    private List<Department> departments = new ArrayList();
    private String[] columnsNames = {"Nome"};
    private Class[] columnsClass = {Object.class};

    public TableDepartments() {
        this.refreshTable();
    }

    @Override
    public int getRowCount() {
        return departments.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int column) {
        return columnsNames[column];

    }

    @Override
    public Class getColumnClass(int column) {
        return columnsClass[column];

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (departments.size() == 0) {
            return false;
        }

        Department d = departments.get(rowIndex);

        if (columnIndex == 0) {
            return d.getName();
        }

        return false;
    }

    @Override
    public void setValueAt(Object newName, int rowIndex, int columnIndex) {
        Department dep = departments.get(rowIndex);
        dep.setName(newName.toString());
        dep.update();
        this.refreshTable();

    }

    public void delete(int rows[]) {

        for (int i = 0; i < rows.length; i++) {
            Department dep = departments.get(rows[i]);
            dep.delete();
        }
        this.refreshTable();
    }
    
    public void add(String name) {

        Department newDepartment = new Department();
        
        newDepartment.setName(name);
        newDepartment.add();
        
        this.refreshTable();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void refreshTable() {
        departments = Department.getAll();
        this.sort();
        fireTableDataChanged();
    }

    public void sort() {
        Collections.sort(departments, new Comparator<Department>() {
            public int compare(Department arg0, Department arg1) {
                return arg0.getName().compareToIgnoreCase(arg1.getName());
            }
        });
    }
}
