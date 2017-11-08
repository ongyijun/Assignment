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
    private String Name;
    private String IC;
    private String PhNo;
    private char Gender;
    private String Adds;
    private String Email;
    private String Position;
    private double Salary;

    public Employee() {
    }

    public Employee(String Name, String IC, String PhNo, char Gender, String Adds, String Email, String Position, double Salary) {
        this.Name = Name;
        this.IC = IC;
        this.PhNo = PhNo;
        this.Gender = Gender;
        this.Adds = Adds;
        this.Email = Email;
        this.Position = Position;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getPhNo() {
        return PhNo;
    }

    public void setPhNo(String PhNo) {
        this.PhNo = PhNo;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public String getAdds() {
        return Adds;
    }

    public void setAdds(String Adds) {
        this.Adds = Adds;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    public abstract void calculateSalary();
}
