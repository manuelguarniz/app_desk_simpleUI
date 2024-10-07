/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_wweek8.ui.controller;

import com.ulabs.poo_wweek8.ui.UIPayrollAdmin;
import com.ulabs.poo_wweek8.ui.UIPayrollTeacher;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author manuelguarniz
 */
public class MenuActionListener implements ActionListener {
    private final JDesktopPane mainPanel;
    private UIPayrollAdmin payrollAdmin;
    private UIPayrollTeacher payrollTeacher;
    
    public MenuActionListener(JDesktopPane panel) {
        this.mainPanel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("e: " + e);
        switch (e.getActionCommand()) {
            case "view_admin":
//                payrollAdmin = payrollAdmin == null ? new UIPayrollAdmin() : payrollAdmin;
                payrollAdmin = new UIPayrollAdmin();
                mainPanel.add(payrollAdmin).setVisible(true);
                break;
            case "view_teacher":
//                payrollTeacher = payrollTeacher == null ? new UIPayrollTeacher() : payrollTeacher;
                payrollTeacher = new UIPayrollTeacher();
                mainPanel.add(payrollTeacher).setVisible(true);
                break;
            case "view_help":
                JOptionPane.showMessageDialog(null, "Bienbenido !\nTarea semana 8\nPOO\nmguarniz@2024");
                break;
            case "view_close":
                System.exit(0);
                break;
            default:
                System.out.println("No action");
        }
    }
    
}
