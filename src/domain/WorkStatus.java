/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Calendar;

/**
 *
 * @author MY
 */
public class WorkStatus {

    private String WorkingID;
    private Calendar CheckIn;
    private Calendar CheckOut;
    private double TotalDistance;
    private int TotalDeliveredOrder;
    private DeliveryMan DM;

    public Calendar getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(Calendar CheckIn) {
        this.CheckIn = CheckIn;
    }

    public Calendar getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Calendar CheckOut) {
        this.CheckOut = CheckOut;
    }

    public double getTotalDistance() {
        return TotalDistance;
    }

    public void setTotalDistance(double TotalDistance) {
        this.TotalDistance = TotalDistance;
    }

    public int getTotalDeliveredOrder() {
        return TotalDeliveredOrder;
    }

    public void setTotalDeliveredOrder(int TotalDeliveredOrder) {
        this.TotalDeliveredOrder = TotalDeliveredOrder;
    }

    public String getWorkingID() {
        return WorkingID;
    }

    public void setWorkingID(String WorkingID) {
        this.WorkingID = WorkingID;
    }

    public DeliveryMan getDM() {
        return DM;
    }

    public void setDM(DeliveryMan DM) {
        this.DM = DM;
    }

}
