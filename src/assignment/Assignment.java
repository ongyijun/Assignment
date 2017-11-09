/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import ModuleB.ModuleBFunction;
import ModuleC.ModuleCFunction;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import java.util.Scanner;

/**
 *
 * @author ong
 */
public class Assignment {

    private ModuleBFunction B = new ModuleBFunction();
    private ModuleCFunction C = new ModuleCFunction();
    private List<Restaurant> restaurant = new ArrayList<>();
    private List<Food> food = new ArrayList<>();
    private List<Customer> customer = new ArrayList<>();
    private List<Orders> order = new ArrayList<>();
    private List<OrderDetail> orderdetail = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public void menu() {
        Scanner s = new Scanner(System.in);
        String selection = "0";
        System.out.println("**************************************");
        System.out.println("*Welcome to Faster Deliverymen System*");
        System.out.println("**************************************");
        System.out.println("Please Select The Option Below");
        System.out.println("1. Afficilate Register");
        System.out.println("2. Staff Login");
        System.out.println("3. Customer Login");
        System.out.println("4. Afficilate Login");
        while (!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")) {
            System.out.print("Option: ");
            selection = s.next();
            switch (selection) {
                case "1": {
                    //create class at module A and import the module A at this class and den call the method from here
                    System.out.println("1");
                    break;
                }
                case "2": {
                    System.out.println("2");
                    staffMenu();
                    break;
                }
                case "3": {
                    C.CustomerLogin(restaurant,food,customer,order,orderdetail);
                    break;
                }
                case "4": {
                    System.out.println("4");
                    break;
                }
                default: {
                    System.out.println("Error, Please Key In Again.");
                    break;
                }
            }
        }
    }

    public void staffMenu() {
        Scanner s = new Scanner(System.in);
        String selection = "0";
        System.out.println("Please Select The Option Below");
        System.out.println("1. Login As Owner");
        System.out.println("2. Login As HR");
        System.out.println("3. Login As Delivery Man");
        System.out.println("4. Afficilate Login");
        while (!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")) {
            System.out.print("Option: ");
            selection = s.next();
            switch (selection) {
                case "1": {
                    System.out.println("1");
                    break;
                }
                case "2": {
                    System.out.println("2");
                    HRMenu();
                    break;
                }
                case "3": {
                    System.out.println("3");
                    break;
                }
                case "4": {
                    System.out.println("4");
                    menu();
                    break;
                }
                default: {
                    System.out.println("Error, Please Key In Again.");
                    break;
                }
            }
        }
    }

    public void HRMenu() {
        Scanner s = new Scanner(System.in);
        String selection = "0";
        System.out.println("Please Select The Option Below");
        System.out.println("1. Add New Delivery Man");
        System.out.println("2. Currently None");
        System.out.println("3. Currently None");
        System.out.println("4. Log Out");
        while (!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")) {
            System.out.print("Option: ");
            selection = s.next();
            switch (selection) {
                case "1": {
                    System.out.println("1");
                    B.DisplayRegistration();
                    List<DeliveryMan> DMList = B.getDeliveryMen();
                    System.out.printf("%s\n", DMList.get(0).getName());
                    HRMenu();
                    break;
                }
                case "2": {
                    System.out.println("2");
                    break;
                }
                case "3": {
                    System.out.println("3");
                    break;
                }
                case "4": {
                    System.out.println("4");
                    System.out.println("\n\n\n");
                    menu();
                    break;
                }
                default: {
                    System.out.println("Error, Please Key In Again.");
                    break;
                }
            }
        }
    }

    public void initializeList(){
        restaurant.add(new Restaurant("RE000001","Nandos", "Tneh Chee Wei", "asd", "016-6666666", "Setapak", "100", "1234567890"));
        restaurant.add(new Restaurant("RE000002","KFC", "Tneh Chee Wai", "asd", "016-6666666", "Wangsa Maju", "200", "1234567890"));
        food.add(new Food("FM000001","Chicken Bolognese",11.50,"Noodles",'1',restaurant.get(0)));
        food.add(new Food("FM000002","Fish Bolognese",11.50,"Noodles",'1',restaurant.get(0)));
        food.add(new Food("FM000003","Beef Bolognese",13.50,"Noodles",'1',restaurant.get(0)));
        food.add(new Food("FM000004","Dinner Plate A",11.50,"Set",'1',restaurant.get(1)));
        food.add(new Food("FM000005","Dinner Plate B",12.50,"Set",'1',restaurant.get(1)));
        food.add(new Food("FM000006","Dinner Plate C",13.50,"Set",'1',restaurant.get(1)));
        customer.add(new Customer("CU000001","Miw Jin Li","14,Taman Cantik,53300,Setapak,Kuala Lumpur","Setapak","0167897899","971003355333","1234567890"));
        customer.add(new Customer("CU000001","Miw Jin Le","14,Taman Cantik,53300,Wangsa Maju,Kuala Lumpur","Wangsa Maju","0167897899","970104079999","1234567890"));
        order.add(new Orders(restaurant.get(0),customer.get(0),"OR000001",0.00,0.00,"1",12,45,6,11,2017));
        orderdetail.add(new OrderDetail(order.get(0),food.get(0),1));
        menu();
    }
    
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        assignment.initializeList();
    }

}
