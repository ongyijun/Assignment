/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import ModuleA.ModuleAFunction;
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

    private ModuleAFunction A = new ModuleAFunction();
    private ModuleBFunction B = new ModuleBFunction();
    private ModuleCFunction C = new ModuleCFunction();
    private List<Restaurant> restaurant = new ArrayList<>();
    private List<Food> food = new ArrayList<>();
    private List<Customer> customer = new ArrayList<>();
    private List<Orders> order = new ArrayList<>();
    private List<OrderDetail> orderdetail = new ArrayList<>();
    private List<DeliveryMan> DMList = new ArrayList<>();
    private List<Admin> adminList = new ArrayList<>();
    private List<HR> HRList = new ArrayList<>();
    private Employee loginStaff;

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
        System.out.println("1. Affiliate Register");
        System.out.println("2. Staff Login");
        System.out.println("3. Customer Login");
        System.out.println("4. Affiliate Login");
        while (!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")) {
            System.out.print("Option: ");
            selection = s.next();
            switch (selection) {
                case "1": {
                    //create class at module A and import the module A at this class and den call the method from here
                    A.RestaurantRegistration(restaurant);
                    menu();
                    break;
                }
                case "2": {
                    System.out.println("2");
                    staffMenu();
                    break;
                }
                case "3": {
                    C.CustomerLogin(restaurant, food, customer, order, orderdetail);
                    menu();
                    break;
                }
                case "4": {
                    boolean a = A.RestaurantLogin(restaurant);
                    if (a) {
                        RestaurantMenu(restaurant);
                    }
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
        boolean login = false;
        while (login == false) {
            System.out.print("Please Enter Staff ID: ");
            String username = s.nextLine();
            loginStaff = B.StaffLogin(username.toUpperCase());
            if (loginStaff instanceof DeliveryMan) {
                System.out.println("\n\n\n");
                login = true;
            } else if (loginStaff instanceof HR) {
                login = true;
                System.out.println("\n\n\n");
                HRMenu();
            } else if (loginStaff instanceof Admin) {
                System.out.println("\n\n\n");
                login = true;
            } else {
                System.out.println("Error. Username Not Found!");
            }
        }
    }

    public void RestaurantMenu(List<Restaurant> restaurant) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add New Menu Items");
        System.out.println("2. Update Menu Item Details");
        System.out.println("3. Remove Menu Items");
        System.out.println("0. Log Out");

        System.out.print("Option: ");
        int selection = sc.nextInt();
        sc.nextLine();
        switch (selection) {
            case 1: {
                System.out.println("Stay Tuned. Under Construction.");
                break;
            }
            case 2: {
                System.out.println("Stay Tuned. Under Construction.");
                break;
            }
            case 3: {
                System.out.println("Stay Tuned. Under Construction.");
                break;
            }
            case 0: {
                System.out.println("Successfully Logout");
                menu();
                break;
            }
            default: {
                System.out.println("Error. Please key in again.");
                RestaurantMenu(restaurant);
                break;
            }
        }
    }

    public void HRMenu() {
        Scanner s = new Scanner(System.in);
        String selection = "0";
        java.util.Date date = new java.util.Date();
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Welcome Back, " + loginStaff.getStaffName() + "\nCurrent Date:" + dateFormat.format(date) + "\n");
        System.out.println("Please Select The Option Below");
        System.out.println("1. Add New Delivery Man");
        System.out.println("2. Add New Owner");
        System.out.println("3. Add New HR");
        System.out.println("4. Update Delivery Man Status");
        System.out.println("5. View Staff Details");
        System.out.println("6. Log Out");
        while (!selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")) {
            System.out.print("Option: ");
            selection = s.next();
            switch (selection) {
                case "1": {
                    B.DisplayDeliveryManRegistration(DMList.size());
                    DMList = B.getDeliveryMen();
                    for (int i = 0; i < DMList.size(); i++) {
                        System.out.printf("%s\n", DMList.get(i).getStaffID());
                        System.out.printf("%s\n", DMList.get(i).getStaffPosition());
                    }
                    HRMenu();
                    break;
                }
                case "2": {
                    B.DisplayAdminRegistration(adminList.size());
                    adminList = B.getAdminList();
                    for (int i = 0; i < adminList.size(); i++) {
                        System.out.printf("%s\n", adminList.get(i).getSalary());
                    }
                    HRMenu();
                    break;
                }
                case "3": {
                    B.DisplayHRRegistration(HRList.size());
                    HRList = B.getHRList();
                    HRMenu();
                    break;
                }
                case "4": {
                    s.nextLine();
                    System.out.print("Please Enter A Delivery Man ID: ");
                    String ID = s.nextLine();
                    boolean find = B.DisplayDeliveryManUpdateStatus(ID.toUpperCase());
                    if (find) {
                        DMList = B.getDeliveryMen();
                    }
                    HRMenu();
                    break;
                }
                case "5": {
                    s.nextLine();
                    boolean find = false;
                    while (find == false) {
                        System.out.print("Please Enter A Staff ID: ");
                        String ID = s.nextLine();
                        Employee e = B.DisplayStaffDetails(ID.toUpperCase());
                        if (e == null) {
                            System.out.println("Error. Staff ID Not Found!");
                        } else {
                            find = true;
                            System.out.printf("Staff ID: %s\n"
                                    + "StaffName: %s\n"
                                    + "Staff Phone No: %s\n"
                                    + "Staff Address: %s\n"
                                    + "Staff Position: %s\n"
                                    + "Staff Status: %s\n"
                                    + "Staff Basic Salary: %.2f\n"
                                    + "Press Enter To Continue...", e.getStaffID(), e.getStaffName(), e.getStaffPhNo(), e.getStaffAdds(), e.getStaffPosition(), e.getWorkingStatus(), e.getSalary());
                            s.nextLine();
                        }
                    }
                    HRMenu();
                    break;
                }
                case "6": {
                    System.out.println("\n\n\n\n\n");
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

    public void initializeList() {
        restaurant.add(new Restaurant("RE000001", "Nandos", "Tneh Chee Wei", "asd", "016-6666666", "Setapak", "100", "1234567890"));
        restaurant.add(new Restaurant("RE000002", "KFC", "Tneh Chee Wai", "asd", "016-6666666", "Wangsa Maju", "200", "1234567890"));
        food.add(new Food("FM000001", "Chicken Bolognese", 11.50, "Noodles", '1', restaurant.get(0)));
        food.add(new Food("FM000002", "Fish Bolognese", 11.50, "Noodles", '1', restaurant.get(0)));
        food.add(new Food("FM000003", "Beef Bolognese", 13.50, "Noodles", '1', restaurant.get(0)));
        food.add(new Food("FM000004", "Dinner Plate A", 11.50, "Set", '1', restaurant.get(1)));
        food.add(new Food("FM000005", "Dinner Plate B", 12.50, "Set", '1', restaurant.get(1)));
        food.add(new Food("FM000006", "Dinner Plate C", 13.50, "Set", '1', restaurant.get(1)));
        customer.add(new Customer("CU000001", "Miw Jin Li", "14,Taman Cantik,53300,Setapak,Kuala Lumpur", "Setapak", "0167897899", "971003355333", "1234567890"));
        customer.add(new Customer("CU000001", "Miw Jin Le", "14,Taman Cantik,53300,Wangsa Maju,Kuala Lumpur", "Wangsa Maju", "0167897899", "970104079999", "1234567890"));
        order.add(new Orders(restaurant.get(0), customer.get(0), "OR000001", 0.00, 0.00, "1", 12, 45, 6, 11, 2017));
        orderdetail.add(new OrderDetail(order.get(0), food.get(0), 1));
        DMList.add(new DeliveryMan(0, "Not Yet Clock-In", "None", "DM000001", "123456", "Ong Yi Jun", "971009-02-5213", "012-3456789", 'M', "2345 Lorong 3 Jalan ABC, 51020 KL", "OngYiJun@gmail.com", "Delivery Man", "Working", 3500, 3500));
        B.setDeliveryMen(DMList);
        HRList.add(new HR(1, "HR000001", "123456", "Ong Ong Jun", "970707-07-0707", "010-2255533", 'M', "Jalan Prima Setapak, KL", "OngOngJun@hotmail.com", "HR", "Working", 3500, 3750));
        B.setHRList(HRList);
        A.setRestaurant(restaurant);
        menu();
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        assignment.initializeList();
    }

}
