package views;

import entities.Department;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import resources.TableDepartments;
import resources.TableSystems;

public class SystemHR extends javax.swing.JFrame {

    private TableDepartments tbDepartment = new TableDepartments();

    public SystemHR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDepTitle1 = new javax.swing.JLabel();
        lbNewDepartment1 = new javax.swing.JLabel();
        tfNewDepartment1 = new javax.swing.JTextField();
        btNewDepartment1 = new javax.swing.JButton();
        btDeleteDep1 = new javax.swing.JButton();
        lbSystemTitle = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jpEmployee = new javax.swing.JPanel();
        lbDepTitle2 = new javax.swing.JLabel();
        lbNewDepartment2 = new javax.swing.JLabel();
        tfNewDepartment2 = new javax.swing.JTextField();
        btNewDepartment2 = new javax.swing.JButton();
        btDeleteDep2 = new javax.swing.JButton();
        btNewDepartment3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpDepartments = new javax.swing.JPanel();
        lbDepTitle = new javax.swing.JLabel();
        tfNewDepartment = new javax.swing.JTextField();
        btDeleteDep = new javax.swing.JButton();
        btNewDepartment = new javax.swing.JButton();
        lbNewDepartment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDepartments = new javax.swing.JTable();
        jpSystems = new javax.swing.JPanel();
        lbSysTitle = new javax.swing.JLabel();
        tfNewSystem = new javax.swing.JTextField();
        btDeleteSystem = new javax.swing.JButton();
        btNewSystem = new javax.swing.JButton();
        lbNewSystem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSystems = new javax.swing.JTable();
        lbInstitution = new javax.swing.JLabel();
        lbCredits = new javax.swing.JLabel();

        lbDepTitle1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDepTitle1.setText("Departamentos");

        lbNewDepartment1.setText("Nome do Departamento");

        btNewDepartment1.setText("Adicionar");
        btNewDepartment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewDepartment1ActionPerformed(evt);
            }
        });

        btDeleteDep1.setText("Excluir Selecionados");
        btDeleteDep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteDep1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 600));

        lbSystemTitle.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lbSystemTitle.setText("Sistema de Recursos Humanos");

        lbDepTitle2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDepTitle2.setText("Funcionários");

        lbNewDepartment2.setText("Nome do Funcionário");

        btNewDepartment2.setText("Novo");
        btNewDepartment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewDepartment2ActionPerformed(evt);
            }
        });

        btDeleteDep2.setText("Excluir Selecionados");

        btNewDepartment3.setText("Buscar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jpEmployeeLayout = new javax.swing.GroupLayout(jpEmployee);
        jpEmployee.setLayout(jpEmployeeLayout);
        jpEmployeeLayout.setHorizontalGroup(
            jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addComponent(lbDepTitle2)
                        .addGap(103, 103, 103)
                        .addComponent(lbNewDepartment2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNewDepartment2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNewDepartment3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNewDepartment2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteDep2)))
                .addContainerGap())
        );
        jpEmployeeLayout.setVerticalGroup(
            jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDepTitle2)
                    .addComponent(lbNewDepartment2)
                    .addComponent(tfNewDepartment2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteDep2)
                    .addComponent(btNewDepartment2)
                    .addComponent(btNewDepartment3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabs.addTab("Funcionários", jpEmployee);

        lbDepTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDepTitle.setText("Departamentos");

        btDeleteDep.setText("Excluir Selecionados");
        btDeleteDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteDepActionPerformed(evt);
            }
        });

        btNewDepartment.setText("Adicionar");
        btNewDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewDepartmentActionPerformed(evt);
            }
        });

        lbNewDepartment.setText("Nome do Departamento");

        tbDepartments.setModel(new TableDepartments());
        tbDepartments.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tbDepartments);

        javax.swing.GroupLayout jpDepartmentsLayout = new javax.swing.GroupLayout(jpDepartments);
        jpDepartments.setLayout(jpDepartmentsLayout);
        jpDepartmentsLayout.setHorizontalGroup(
            jpDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDepartmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpDepartmentsLayout.createSequentialGroup()
                        .addComponent(lbDepTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(lbNewDepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNewDepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteDep, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpDepartmentsLayout.setVerticalGroup(
            jpDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDepartmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDepartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDepTitle)
                    .addComponent(tfNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteDep)
                    .addComponent(btNewDepartment)
                    .addComponent(lbNewDepartment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Departamentos", jpDepartments);

        lbSysTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSysTitle.setText("Sistemas");

        btDeleteSystem.setText("Excluir Selecionados");
        btDeleteSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteSystemActionPerformed(evt);
            }
        });

        btNewSystem.setText("Adicionar");
        btNewSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewSystemActionPerformed(evt);
            }
        });

        lbNewSystem.setText("Nome do Sistema");

        tbSystems.setModel(new TableSystems());
        jScrollPane2.setViewportView(tbSystems);

        javax.swing.GroupLayout jpSystemsLayout = new javax.swing.GroupLayout(jpSystems);
        jpSystems.setLayout(jpSystemsLayout);
        jpSystemsLayout.setHorizontalGroup(
            jpSystemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSystemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSystemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jpSystemsLayout.createSequentialGroup()
                        .addComponent(lbSysTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(lbNewSystem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNewSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNewSystem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpSystemsLayout.setVerticalGroup(
            jpSystemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSystemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSystemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSysTitle)
                    .addComponent(tfNewSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteSystem)
                    .addComponent(btNewSystem)
                    .addComponent(lbNewSystem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Sistemas", jpSystems);

        lbInstitution.setText("UFPR - UNIVERSIDADE FEDERAL DO PARANÁ");
        lbInstitution.setEnabled(false);

        lbCredits.setText("Desenvolvido por: Carlos Grispan e Lucas Kindinger");
        lbCredits.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSystemTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbInstitution)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCredits)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystemTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInstitution)
                    .addComponent(lbCredits))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewDepartmentActionPerformed

        ((TableDepartments) tbDepartments.getModel()).add(tfNewDepartment.getText());
        
        tfNewDepartment.setText(null);

    }//GEN-LAST:event_btNewDepartmentActionPerformed

    private void btDeleteDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteDepActionPerformed

        int rows[] = tbDepartments.getSelectedRows();

        ((TableDepartments) tbDepartments.getModel()).delete(rows);

    }//GEN-LAST:event_btDeleteDepActionPerformed

    private void btDeleteSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteSystemActionPerformed
        int rows[] = tbSystems.getSelectedRows();

        ((TableSystems) tbSystems.getModel()).delete(rows);
    }//GEN-LAST:event_btDeleteSystemActionPerformed

    private void btNewSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewSystemActionPerformed
        ((TableSystems) tbSystems.getModel()).add(tfNewSystem.getText());
        
        tfNewSystem.setText(null);
    }//GEN-LAST:event_btNewSystemActionPerformed

    private void btNewDepartment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewDepartment1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNewDepartment1ActionPerformed

    private void btDeleteDep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteDep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeleteDep1ActionPerformed

    private void btNewDepartment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewDepartment2ActionPerformed
        NewEmployee emp = new NewEmployee(this);
        emp.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btNewDepartment2ActionPerformed


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemHR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemHR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemHR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemHR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemHR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeleteDep;
    private javax.swing.JButton btDeleteDep1;
    private javax.swing.JButton btDeleteDep2;
    private javax.swing.JButton btDeleteSystem;
    private javax.swing.JButton btNewDepartment;
    private javax.swing.JButton btNewDepartment1;
    private javax.swing.JButton btNewDepartment2;
    private javax.swing.JButton btNewDepartment3;
    private javax.swing.JButton btNewSystem;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpDepartments;
    private javax.swing.JPanel jpEmployee;
    private javax.swing.JPanel jpSystems;
    private javax.swing.JLabel lbCredits;
    private javax.swing.JLabel lbDepTitle;
    private javax.swing.JLabel lbDepTitle1;
    private javax.swing.JLabel lbDepTitle2;
    private javax.swing.JLabel lbInstitution;
    private javax.swing.JLabel lbNewDepartment;
    private javax.swing.JLabel lbNewDepartment1;
    private javax.swing.JLabel lbNewDepartment2;
    private javax.swing.JLabel lbNewSystem;
    private javax.swing.JLabel lbSysTitle;
    private javax.swing.JLabel lbSystemTitle;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbDepartments;
    private javax.swing.JTable tbSystems;
    private javax.swing.JTextField tfNewDepartment;
    private javax.swing.JTextField tfNewDepartment1;
    private javax.swing.JTextField tfNewDepartment2;
    private javax.swing.JTextField tfNewSystem;
    // End of variables declaration//GEN-END:variables
}
