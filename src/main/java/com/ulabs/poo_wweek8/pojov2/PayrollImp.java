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
public class PayrollImp implements Payroll {

    @Override
    public double calculateSalary(Worker worker) {
        return salaryWithTax(worker.getSalary());
    }
    
}
