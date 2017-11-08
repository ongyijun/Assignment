/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author MY
 */
public class Owner extends Employee{
    private int TotalEmployee;
    private double annualSale;

    public Owner() {
    }

    public Owner(int TotalEmployee, double annualSale) {
        this.TotalEmployee = TotalEmployee;
        this.annualSale = annualSale;
    }

    public Owner(int TotalEmployee, double annualSale, String Name, String IC, String PhNo, char Gender, String Adds, String Email, String Position, double Salary) {
        super(Name, IC, PhNo, Gender, Adds, Email, Position, Salary);
        this.TotalEmployee = TotalEmployee;
        this.annualSale = annualSale;
    }

    public int getTotalEmployee() {
        return TotalEmployee;
    }

    public void setTotalEmployee(int TotalEmployee) {
        this.TotalEmployee = TotalEmployee;
    }

    public double getAnnualSale() {
        return annualSale;
    }

    public void setAnnualSale(double annualSale) {
        this.annualSale = annualSale;
    }
    
    @Override
    public void calculateSalary() {
        super.setSalary(annualSale * 0.3);
    }
    
}
