/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_wweek8.ui;

import com.ulabs.poo_wweek8.ui.controller.MenuActionListener;

/**
 *
 * @author manuelguarniz
 */
public class UIMain extends javax.swing.JFrame {
    MenuActionListener menuActionListener;

    /**
     * Creates new form UIMain
     */
    public UIMain() {
        initComponents();
        menuActionListener = new MenuActionListener(dpMain);
        mbiAdmin.addActionListener(menuActionListener);
        mbiTeacher.addActionListener(menuActionListener);
        mbiClose.addActionListener(menuActionListener);
        mbiHelp.addActionListener(menuActionListener);
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
        dpMain = new javax.swing.JDesktopPane();
        mbMain = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mbiAdmin = new javax.swing.JMenuItem();
        mbiTeacher = new javax.swing.JMenuItem();
        mbiClose = new javax.swing.JMenuItem();
        mbiHelp = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        dpMain.setPreferredSize(new java.awt.Dimension(1280, 673));

        jMenu1.setText("Pago de trabajadores");

        mbiAdmin.setText("Admin");
        mbiAdmin.setActionCommand("view_admin");
        jMenu1.add(mbiAdmin);

        mbiTeacher.setText("Profesor");
        mbiTeacher.setActionCommand("view_teacher");
        jMenu1.add(mbiTeacher);

        mbiClose.setText("Salir");
        mbiClose.setActionCommand("view_close");
        jMenu1.add(mbiClose);

        mbMain.add(jMenu1);

        mbiHelp.setText("Ayuda");
        mbiHelp.setActionCommand("view_help");
        mbMain.add(mbiHelp);

        setJMenuBar(mbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpMain;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar mbMain;
    private javax.swing.JMenuItem mbiAdmin;
    private javax.swing.JMenuItem mbiClose;
    private javax.swing.JMenu mbiHelp;
    private javax.swing.JMenuItem mbiTeacher;
    // End of variables declaration//GEN-END:variables

}
