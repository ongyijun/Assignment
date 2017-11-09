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
public class HR extends Employee {
    private int TotalStaffManaged;

    public HR() {
    }

    public HR(int TotalStaffManaged) {
        this.TotalStaffManaged = TotalStaffManaged;
    }

    public HR(int TotalStaffManaged, String StaffID, String StaffName, String StaffIC, String StaffPhNo, char StaffGender, String StaffAdds, String StaffEmail, String StaffPosition, double Salary) {
        super(StaffID, StaffName, StaffIC, StaffPhNo, StaffGender, StaffAdds, StaffEmail, StaffPosition, Salary);
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
        super.setSalary( super.getSalary() + (TotalStaffManaged * 250));
    }

}
