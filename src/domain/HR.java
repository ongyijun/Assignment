/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile;

/**
 *
 * @author MY
 */
public class HR extends Employee{
    private int TotalStaffManaged;
    
    
    public HR() {
    }

    public HR(int TotalStaffManaged) {
        this.TotalStaffManaged = TotalStaffManaged;
    }

    public HR(int TotalStaffManaged, String Name, String IC, String PhNo, char Gender, String Adds, String Email, String Position, double Salary) {
        super(Name, IC, PhNo, Gender, Adds, Email, Position, Salary);
        this.TotalStaffManaged = TotalStaffManaged;
    }

    public int getTotalStaffManaged() {
        return TotalStaffManaged;
    }

    public void setTotalStaffManaged(int TotalStaffManaged) {
        this.TotalStaffManaged = TotalStaffManaged;
    }

    @Override
    public void calculateSalary() {
        super.setSalary(2500 + (TotalStaffManaged * 250));
    }
    
}
