/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_wweek8.application;

import com.ulabs.poo_wweek8.pojov2.Admin;
import com.ulabs.poo_wweek8.pojov2.Payroll;
import com.ulabs.poo_wweek8.pojov2.PayrollImp;
import com.ulabs.poo_wweek8.pojov2.Teacher;

/**
 *
 * @author manuelguarniz
 */
public class ApplicationV2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Manuel");
        teacher.setDocumentNumber("71854508");
        teacher.setPricePerHour(Payroll.TEACHER_PRICE_POR_HOUR);
        teacher.setTotalHourWorked(120);
        
        
        Admin admin = new Admin();
        admin.setName("Jose");
        admin.setDocumentNumber("71854400");
        admin.setSalary(7000);
     
        Payroll payrollAdmin = new PayrollImp();
        
        System.out.println("El sueldo del profesor es: " + payrollAdmin.calculateSalary(teacher));
        System.out.println("El sueldo del admin es: " + payrollAdmin.calculateSalary(admin));
    }
}
