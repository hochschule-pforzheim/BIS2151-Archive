/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tutorial_5.Student;
import tutorial_5.StudentManager;

/**
 *
 * @author Jonathan Hinkel
 */
public class MyFrame extends javax.swing.JFrame {

    StudentManager myManager = StudentManager.getInstance();    // Call the Singleton to use methods of class StudentManager

    /**
     * Creates new form MyFrame
     */
    public MyFrame() {
        initComponents();
        addDialog.setVisible(false);
        myManager.generateStudents();   // Generate some test Students
        fillTable();
        mySecondPanel.setVisible(false);
    }

    private void fillTable() {
        ArrayList<Student> studentList = myManager.getList();
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();

        Object rowData[] = new Object[3];

        for (Student s : studentList) {
            rowData[0] = s.getMatNr();
            rowData[1] = s.getName();
            rowData[2] = s.getSemester();

            model.addRow(rowData);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        addDialog = new javax.swing.JDialog();
        matnrLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        semesterTextField = new javax.swing.JTextField();
        matnrTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        okayButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        myFirstButton = new javax.swing.JButton();
        mySecondPanel = new javax.swing.JPanel();
        buttonPanel2 = new javax.swing.JButton();
        myFirstPanel = new javax.swing.JPanel();
        studentScrollPane = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenuButton = new javax.swing.JMenu();
        closeButton = new javax.swing.JRadioButtonMenuItem();
        openDialog = new javax.swing.JMenuItem();
        editMenuButton = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        matnrLabel.setText("matnr");

        nameLabel.setText("name");

        semesterLabel.setText("semester");

        okayButton.setText("okay");
        okayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semesterLabel)
                    .addComponent(matnrLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okayButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addGap(20, 20, 20))
            .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                    .addContainerGap(151, Short.MAX_VALUE)
                    .addComponent(matnrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)))
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(matnrLabel)
                .addGap(24, 24, 24)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterLabel)
                    .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okayButton)
                    .addComponent(cancelButton))
                .addContainerGap())
            .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addDialogLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(matnrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(252, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myFirstButton.setText("Test");
        myFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myFirstButtonActionPerformed(evt);
            }
        });

        buttonPanel2.setText("Hide");
        buttonPanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPanel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mySecondPanelLayout = new javax.swing.GroupLayout(mySecondPanel);
        mySecondPanel.setLayout(mySecondPanelLayout);
        mySecondPanelLayout.setHorizontalGroup(
            mySecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mySecondPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(buttonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        mySecondPanelLayout.setVerticalGroup(
            mySecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mySecondPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(buttonPanel2)
                .addContainerGap())
        );

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MatNr", "Name", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentScrollPane.setViewportView(studentTable);

        javax.swing.GroupLayout myFirstPanelLayout = new javax.swing.GroupLayout(myFirstPanel);
        myFirstPanel.setLayout(myFirstPanelLayout);
        myFirstPanelLayout.setHorizontalGroup(
            myFirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        myFirstPanelLayout.setVerticalGroup(
            myFirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFirstPanelLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(studentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        fileMenuButton.setText("File");

        closeButton.setSelected(true);
        closeButton.setText("Exit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        fileMenuButton.add(closeButton);

        openDialog.setText("Dialog");
        openDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDialogActionPerformed(evt);
            }
        });
        fileMenuButton.add(openDialog);

        jMenuBar1.add(fileMenuButton);

        editMenuButton.setText("Edit");
        jMenuBar1.add(editMenuButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myFirstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(myFirstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(mySecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(151, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(myFirstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myFirstButton)
                    .addComponent(addButton)
                    .addComponent(deleteButton)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(mySecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(670, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myFirstButtonActionPerformed
        System.out.println("The button was pressed.");
        switchPanels();
    }//GEN-LAST:event_myFirstButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void openDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDialogActionPerformed
        MyDialog dialog = new MyDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_openDialogActionPerformed

    private void buttonPanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPanel2ActionPerformed
        mySecondPanel.setVisible(false);
    }//GEN-LAST:event_buttonPanel2ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addDialog.pack();
        addDialog.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void okayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayButtonActionPerformed
        ArrayList<Student> studentList = myManager.getList();
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();

        try {
            int matNr = Integer.parseInt(matnrTextField.getText());
            String name = nameTextField.getText();
            int semester = Integer.parseInt(semesterTextField.getText());
            Student s = new Student(name, matNr);
            s.setSemester(semester);

            studentList.add(s);

            //adds a new row to the table
            Object[] rowData = new Object[3];
            rowData[0] = s.getMatNr();
            rowData[1] = s.getName();
            rowData[2] = s.getSemester();

            model.addRow(rowData);

            matnrTextField.setText("");
            nameTextField.setText("");
            semesterTextField.setText("");
            addDialog.setVisible(false);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_okayButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Object[] options = {"Ja", "Nein"};
        int selection = JOptionPane.showOptionDialog(this, "Wirklich schließen?", "Bestätigen", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
        if(selection == 0) {
            matnrTextField.setText("");
            nameTextField.setText("");
            semesterTextField.setText("");
            addDialog.setVisible(false);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ArrayList<Student> studentList = myManager.getList();

        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();

        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow < 0) {
            System.out.println("Keine Zeile ausgewählt!");
        } else {
            studentList.remove(selectedRow);
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void switchPanels() {
        myFirstPanel.setVisible(!myFirstPanel.isVisible());
        mySecondPanel.setVisible(!mySecondPanel.isVisible());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton buttonPanel2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButtonMenuItem closeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenu editMenuButton;
    private javax.swing.JMenu fileMenuButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel matnrLabel;
    private javax.swing.JTextField matnrTextField;
    private javax.swing.JButton myFirstButton;
    private javax.swing.JPanel myFirstPanel;
    private javax.swing.JPanel mySecondPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okayButton;
    private javax.swing.JMenuItem openDialog;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JTextField semesterTextField;
    private javax.swing.JScrollPane studentScrollPane;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
