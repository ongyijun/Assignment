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
public class DeliveryMan extends Employee{
    private double TotalDistance;
    private int TotalPendingDelivery;
    private int TotalDeliveredOrder;
    
    public DeliveryMan() {
    }

    public DeliveryMan(double TotalDistance, int TotalPendingDelivery, int TotalDeliveredOrder) {
        this.TotalDistance = TotalDistance;
        this.TotalPendingDelivery = TotalPendingDelivery;
        this.TotalDeliveredOrder = TotalDeliveredOrder;
    }

    public DeliveryMan(double TotalDistance, int TotalPendingDelivery, int TotalDeliveredOrder, String Name, String IC, String PhNo, char Gender, String Adds, String Email, String Position, double Salary) {
        super(Name, IC, PhNo, Gender, Adds, Email, Position, Salary);
        this.TotalDistance = TotalDistance;
        this.TotalPendingDelivery = TotalPendingDelivery;
        this.TotalDeliveredOrder = TotalDeliveredOrder;
    }

    public double getTotalDistance() {
        return TotalDistance;
    }

    public void setTotalDistance(double TotalDistance) {
        this.TotalDistance = TotalDistance;
    }

    public int getTotalPendingDelivery() {
        return TotalPendingDelivery;
    }

    public void setTotalPendingDelivery(int TotalPendingDelivery) {
        this.TotalPendingDelivery = TotalPendingDelivery;
    }

    public int getTotalDeliveredOrder() {
        return TotalDeliveredOrder;
    }

    public void setTotalDeliveredOrder(int TotalDeliveredOrder) {
        this.TotalDeliveredOrder = TotalDeliveredOrder;
    }

    @Override
    public void calculateSalary() {
        super.setSalary( TotalDeliveredOrder * 0.5 );
    }
    
}
