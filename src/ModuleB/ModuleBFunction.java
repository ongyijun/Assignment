/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleB;

import domain.DeliveryMan;
import domain.HR;
import domain.Owner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MY
 */
public class ModuleBFunction {

    private List<DeliveryMan> deliveryMen = new ArrayList<>();
    private List<HR> HRList = new ArrayList<>();
    private List<Owner> ownerList = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public ModuleBFunction() {
    }
    
    public void DisplayOwnerRegistration(int TotalOwner){
        String Position = "Owner";
        double Salary = 0;
        String ID = String.format("OW%06d", TotalOwner + 1);
        System.out.print("Enter New Owner Name: ");
        String Name = s.nextLine();
        System.out.print("Enter New Owner IC: ");
        String IC = s.nextLine();
        System.out.print("Enter New Owner Phone No: ");
        String PhNo = s.nextLine();
        System.out.print("Enter New Owner Gender(M/F): ");
        char Gender = Character.toUpperCase(s.nextLine().charAt(0));
        System.out.print("Enter New Owner Address: ");
        String Adds = s.nextLine();
        System.out.print("Enter New Owner Email: ");
        String Email = s.nextLine();
        System.out.print("Enter Total Annual Sales: ");
        double annualSale = s.nextDouble();
        s.nextLine();
        Owner owner = new Owner(annualSale,ID,Name,IC,PhNo,Gender,Adds,Email,Position,Salary,0);
        owner.calculateSalary();
        AddNewOwner(owner);
    }
    
    public void DisplayHRRegistration(int TotalHR) {
        String Position = "HR";
        double Salary = 0;
        String ID = String.format("HR%06d", TotalHR + 1);
        System.out.print("Enter New Delivery Man Name: ");
        String Name = s.nextLine();
        System.out.print("Enter New Delivery Man IC: ");
        String IC = s.nextLine();
        System.out.print("Enter New Delivery Man Phone No: ");
        String PhNo = s.nextLine();
        System.out.print("Enter New Delivery Man Gender(M/F): ");
        char Gender = Character.toUpperCase(s.nextLine().charAt(0));
        System.out.print("Enter New Delivery Man Address: ");
        String Adds = s.nextLine();
        System.out.print("Enter New Delivery Man Email: ");
        String Email = s.nextLine();
        System.out.print("Enter Total Staff Managed: ");
        int TotalStaffManaged = s.nextInt();
        System.out.print("Enter New Staff Salary: ");
        Salary = s.nextDouble();
        s.nextLine();
        HR hr = new HR(TotalStaffManaged,ID,Name,IC,PhNo,Gender,Adds,Email,Position,Salary,0);
        hr.calculateSalary();
        AddNewHR(hr);
    }

    public void DisplayDeliveryManRegistration(int TotalDeliveryMan) {
        String Position = "Delivery Man";
        double Salary = 0;
        String ID = String.format("DM%06d", TotalDeliveryMan + 1);
        System.out.print("Enter New Delivery Man Name: ");
        String Name = s.nextLine();
        System.out.print("Enter New Delivery Man IC: ");
        String IC = s.nextLine();
        System.out.print("Enter New Delivery Man Phone No: ");
        String PhNo = s.nextLine();
        System.out.print("Enter New Delivery Man Gender(M/F): ");
        char Gender = s.nextLine().charAt(0);
        System.out.print("Enter New Delivery Man Address: ");
        String Adds = s.nextLine();
        System.out.print("Enter New Delivery Man Email: ");
        String Email = s.nextLine();
        Position = "Delivery Man";
        System.out.print("Enter New Delivery Man Basic Salary: ");
        Salary = s.nextDouble();
        s.nextLine();
        DeliveryMan DM = new DeliveryMan(0,ID,Name,IC,PhNo,Gender,Adds,Email,Position,Salary,0);
        DM.calculateSalary();
        AddNewDeliveryMan(DM);
    }
    
    public void AddNewOwner(Owner owner){
        ownerList.add(owner);
        System.out.println("New Owner Added Successfully!");
    }
    
    public void AddNewHR(HR hr){
        HRList.add(hr);
        System.out.println("New HR Added Successfully!");
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

    public List<HR> getHRList() {
        return HRList;
    }

    public void setHRList(List<HR> HRList) {
        this.HRList = HRList;
    }

    public List<Owner> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Owner> ownerList) {
        this.ownerList = ownerList;
    }
}