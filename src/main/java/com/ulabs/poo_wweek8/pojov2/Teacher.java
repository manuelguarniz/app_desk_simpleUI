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
public class Teacher extends Worker {
    private double pricePerHour;
    private int totalHourWorked;
    
    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public int getTotalHourWorked() {
        return totalHourWorked;
    }

    public void setTotalHourWorked(int totalHourWorked) {
        this.totalHourWorked = totalHourWorked;
    }
    
    @Override
    public double getSalary() {
        return pricePerHour * totalHourWorked;
    }
}
