/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ong
 */
public class Orders {
    //private Customer customer;
    private double Subtotal;
    private double Total;
    private int OrdersHour;
    private int OrdersMinute;
    private int OrdersDay;
    private int OrdersMonth;
    private int OrdersYear;

    public Orders(double Subtotal, double Total, int OrdersHour, int OrdersMinute, int OrdersDay, int OrdersMonth, int OrdersYear) {
        this.Subtotal = Subtotal;
        this.Total = Total;
        this.OrdersHour = OrdersHour;
        this.OrdersMinute = OrdersMinute;
        this.OrdersDay = OrdersDay;
        this.OrdersMonth = OrdersMonth;
        this.OrdersYear = OrdersYear;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getOrdersHour() {
        return OrdersHour;
    }

    public void setOrdersHour(int OrdersHour) {
        this.OrdersHour = OrdersHour;
    }

    public int getOrdersMinute() {
        return OrdersMinute;
    }

    public void setOrdersMinute(int OrdersMinute) {
        this.OrdersMinute = OrdersMinute;
    }

    public int getOrdersDay() {
        return OrdersDay;
    }

    public void setOrdersDay(int OrdersDay) {
        this.OrdersDay = OrdersDay;
    }

    public int getOrdersMonth() {
        return OrdersMonth;
    }

    public void setOrdersMonth(int OrdersMonth) {
        this.OrdersMonth = OrdersMonth;
    }

    public int getOrdersYear() {
        return OrdersYear;
    }

    public void setOrdersYear(int OrdersYear) {
        this.OrdersYear = OrdersYear;
    }

    @Override
    public String toString() {
        return "Orders{" + "Subtotal=" + Subtotal + ", Total=" + Total + ", OrdersHour=" + OrdersHour + ", OrdersMinute=" + OrdersMinute + ", OrdersDay=" + OrdersDay + ", OrdersMonth=" + OrdersMonth + ", OrdersYear=" + OrdersYear + '}';
    }
    
}
