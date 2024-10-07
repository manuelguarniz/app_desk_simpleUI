/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_wweek8.pojov2;

/**
 *
 * @author manuelguarniz
 */
public interface Payroll {
    static final int TEACHER_PRICE_POR_HOUR = 30;
    static final double TAX = 10;
    double calculateSalary(Worker worker);
    default double salaryWithTax(double salary) {
        return salary - salary * Payroll.TAX / 100;
    }
}
