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
public class DeliveryMan extends Employee {

    private int TotalPendingDelivery;
    WorkStatus ws = new WorkStatus();

    public DeliveryMan() {
    }

    public DeliveryMan(int TotalPendingDelivery) {
        this.TotalPendingDelivery = TotalPendingDelivery;
    }

    public DeliveryMan(int TotalPendingDelivery, String StaffID, String StaffName, String StaffIC, String StaffPhNo, char StaffGender, String StaffAdds, String StaffEmail, String StaffPosition, double Salary, double TotalPay) {
        super(StaffID, StaffName, StaffIC, StaffPhNo, StaffGender, StaffAdds, StaffEmail, StaffPosition, Salary, TotalPay);
        this.TotalPendingDelivery = TotalPendingDelivery;
    }

    public int getTotalPendingDelivery() {
        return TotalPendingDelivery;
    }

    public void setTotalPendingDelivery(int TotalPendingDelivery) {
        this.TotalPendingDelivery = TotalPendingDelivery;
    }

    @Override
    public void calculateSalary() {
        super.setTotalPay(super.getSalary() + (ws.getTotalDeliveredOrder() * 0.5));
    }

}
