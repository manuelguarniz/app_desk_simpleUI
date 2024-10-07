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
public class Worker {
    private String name;
    private String documentNumber;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s"
                + "\nDNI: %s"
                + "\nEdad: %s", name, documentNumber, age) ;
    }
    
    
}
