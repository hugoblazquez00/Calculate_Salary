package com.example.demo;

public class Employee {
    private String type;
    private double baseSalary;
    private int monthlySales;
    private int extraHours;
    private double finalSalary;
    private int bonus ;

    public int getBonus() {
        return bonus;
    }


    public void setBonus() {
        if (this.type =="manager") {
            this.bonus = 10;
        }
        else{
            this.bonus = 8;
        }
    }


    public Employee() {

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary() {
        if (this.type =="manager") {
            this.baseSalary = 600;
        }
        else{
            this.baseSalary = 500;
        }
        
    }

    public int getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(int monthlySales) {
        this.monthlySales = monthlySales;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    
    
}
