/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_wweek8.pojo;

/**
 *
 * @author manuelguarniz
 */
public class Admin extends Worker {
    
    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
    
    @Override
    public double calculateSalary() {
        return super.getSalary() * 0.9;
    }
    
}
