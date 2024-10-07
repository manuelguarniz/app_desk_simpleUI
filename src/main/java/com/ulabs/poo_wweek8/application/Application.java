/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_wweek8.application;

import com.ulabs.poo_wweek8.pojo.Admin;
import com.ulabs.poo_wweek8.pojo.Teacher;

/**
 *
 * @author manuelguarniz
 */
public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Manuel");
        teacher.setDocumentNumber("71854508");
        teacher.setTotalHourWorked(40 * 4);
        
        Admin admin = new Admin();
        admin.setName("Jose");
        admin.setDocumentNumber("71854400");
        admin.setSalary(7000);
     
        System.out.println("El sueldo del profesor es: " + teacher.calculateSalary());
        System.out.println("El sueldo del admin es: " + admin.calculateSalary());
    }
}
