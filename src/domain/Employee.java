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
public abstract class Employee {

    private String StaffID;
    private String StaffName;
    private String StaffIC;
    private String StaffPhNo;
    private char StaffGender;
    private String StaffAdds;
    private String StaffEmail;
    private String StaffPosition;
    private double Salary;
    private double TotalPay;

    public Employee() {
    }

    public Employee(String StaffID, String StaffName, String StaffIC, String StaffPhNo, char StaffGender, String StaffAdds, String StaffEmail, String StaffPosition, double Salary, double TotalPay) {
        this.StaffID = StaffID;
        this.StaffName = StaffName;
        this.StaffIC = StaffIC;
        this.StaffPhNo = StaffPhNo;
        this.StaffGender = StaffGender;
        this.StaffAdds = StaffAdds;
        this.StaffEmail = StaffEmail;
        this.StaffPosition = StaffPosition;
        this.Salary = Salary;
        this.TotalPay = TotalPay;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String StaffID) {
        this.StaffID = StaffID;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String StaffName) {
        this.StaffName = StaffName;
    }

    public String getStaffIC() {
        return StaffIC;
    }

    public void setStaffIC(String StaffIC) {
        this.StaffIC = StaffIC;
    }

    public String getStaffPhNo() {
        return StaffPhNo;
    }

    public void setStaffPhNo(String StaffPhNo) {
        this.StaffPhNo = StaffPhNo;
    }

    public char getStaffGender() {
        return StaffGender;
    }

    public void setStaffGender(char StaffGender) {
        this.StaffGender = StaffGender;
    }

    public String getStaffAdds() {
        return StaffAdds;
    }

    public void setStaffAdds(String StaffAdds) {
        this.StaffAdds = StaffAdds;
    }

    public String getStaffEmail() {
        return StaffEmail;
    }

    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    public String getStaffPosition() {
        return StaffPosition;
    }

    public void setStaffPosition(String StaffPosition) {
        this.StaffPosition = StaffPosition;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getTotalPay() {
        return TotalPay;
    }

    public void setTotalPay(double TotalPay) {
        this.TotalPay = TotalPay;
    }

    public abstract void calculateSalary();
}
