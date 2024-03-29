/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package tutorial02;

/**
 *
 * @author Jascha Pfäfflin
 */
public class ExampleApplication extends javax.swing.JFrame {

    /**
     * Creates new form ExampleApplication
     */
    public ExampleApplication() {
        initComponents(); // Create every Component of the generated Code
        secondPanel.setVisible(false); // Set the second panel to be invisible
        this.setLocationRelativeTo(null); //  Set the location of the Application in the middle of the screen
    }

    /**
     * Switch the visibility of the two Panels.
     */
    private void switchPanels() {
        if (firstPanel.isVisible()) { // if the firstpanel is visible
            firstPanel.setVisible(false); // set it as invisible
            secondPanel.setVisible(true); // and set the second visible
        } else {
            secondPanel.setVisible(false); // otherwise vice versa
            firstPanel.setVisible(true);
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

        exampleDialog = new javax.swing.JDialog();
        helloWorldLabel = new javax.swing.JLabel();
        firstPanel = new javax.swing.JPanel();
        firstLabel = new javax.swing.JLabel();
        switchButton = new javax.swing.JButton();
        openDialogButton = new javax.swing.JButton();
        openSecondDialogButton = new javax.swing.JButton();
        secondPanel = new javax.swing.JPanel();
        secondLabel = new javax.swing.JLabel();
        switchBackButton = new javax.swing.JButton();
        printTextField = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        printLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        helloWorldLabel.setText("Hello World!");

        javax.swing.GroupLayout exampleDialogLayout = new javax.swing.GroupLayout(exampleDialog.getContentPane());
        exampleDialog.getContentPane().setLayout(exampleDialogLayout);
        exampleDialogLayout.setHorizontalGroup(
            exampleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exampleDialogLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(helloWorldLabel)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        exampleDialogLayout.setVerticalGroup(
            exampleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exampleDialogLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(helloWorldLabel)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstLabel.setText("First Panel");

        switchButton.setText("Switch");
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        openDialogButton.setText("Open Dialog");
        openDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDialogButtonActionPerformed(evt);
            }
        });

        openSecondDialogButton.setText("Open 2nd Dialog");
        openSecondDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSecondDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(firstLabel))
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(switchButton))
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(openDialogButton))
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(openSecondDialogButton)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(firstLabel)
                .addGap(63, 63, 63)
                .addComponent(switchButton)
                .addGap(53, 53, 53)
                .addComponent(openDialogButton)
                .addGap(18, 18, 18)
                .addComponent(openSecondDialogButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        secondLabel.setText("Second Panel");

        switchBackButton.setText("Switch Back");
        switchBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchBackButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(switchBackButton)
                .addGap(154, 154, 154))
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(secondLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(printTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(printButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(printLabel)
                .addGap(65, 65, 65))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(secondLabel)
                .addGap(79, 79, 79)
                .addComponent(switchBackButton)
                .addGap(48, 48, 48)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton)
                    .addComponent(printLabel))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(firstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(secondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(secondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        switchPanels();
    }//GEN-LAST:event_switchButtonActionPerformed

    private void switchBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchBackButtonActionPerformed
        switchPanels();
    }//GEN-LAST:event_switchBackButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        printLabel.setText(printTextField.getText()); // Get the Text from the TextField and replace the Text from our Label
    }//GEN-LAST:event_printButtonActionPerformed

    private void openDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDialogButtonActionPerformed
        exampleDialog.pack(); // Set the Window to the preffered size
        exampleDialog.setLocationRelativeTo(this); // Set the location in the middle of the main Application
        exampleDialog.setVisible(true); // set is as visible
    }//GEN-LAST:event_openDialogButtonActionPerformed

    private void openSecondDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSecondDialogButtonActionPerformed
        ExampleJDialog dlg = new ExampleJDialog(this, true); // Create an instance of our ExampleJDialog, which has this as a parent and has modal set to true
        dlg.pack();
        dlg.setLocationRelativeTo(this);
        dlg.setVisible(true);
    }//GEN-LAST:event_openSecondDialogButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ExampleApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExampleApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExampleApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExampleApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExampleApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDialog exampleDialog;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel helloWorldLabel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton openDialogButton;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton openSecondDialogButton;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel printLabel;
    private javax.swing.JTextField printTextField;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JButton switchBackButton;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables

}
