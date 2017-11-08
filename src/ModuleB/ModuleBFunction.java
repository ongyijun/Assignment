/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import domain.DeliveryMan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MY
 */
public class ModuleBFunction {

    private List<DeliveryMan> deliveryMen = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public ModuleBFunction() {
    }

    public void DisplayRegistration() {
        double TotalDistance;
        int TotalPendingDelivery;
        int TotalDeliveredOrder;
        String Name;
        String IC;
        String PhNo;
        char Gender;
        String Adds;
        String Email;
        String Position;
        double Salary;
        System.out.print("Enter New Staff Name: ");
        Name = s.nextLine();
        System.out.print("Enter New Staff IC: ");
        IC = s.nextLine();
        System.out.print("Enter New Staff Phone No: ");
        PhNo = s.nextLine();
        System.out.print("Enter New Staff Gender(M/F): ");
        Gender = s.nextLine().charAt(0);
        System.out.print("Enter New Staff Address: ");
        Adds = s.nextLine();
        System.out.print("Enter New Staff Email: ");
        Email = s.nextLine();
        System.out.print("Enter New Staff Position: ");
        Position = s.nextLine();
        System.out.print("Enter New Staff Salary: ");
        Salary = s.nextDouble();
        DeliveryMan DM = new DeliveryMan(0, 0, 0, Name, IC, PhNo, Gender, Adds, Email, Position, Salary);
        AddNewDeliveryMan(DM);
    }

    public void AddNewDeliveryMan(DeliveryMan DM) {
        deliveryMen.add(DM);
        System.out.println("New Delivery Man Added Successfully!");
    }

    public List<DeliveryMan> getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(List<DeliveryMan> deliveryMen) {
        this.deliveryMen = deliveryMen;
    }

}
