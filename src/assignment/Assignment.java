/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import ModuleB.ModuleBFunction;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import java.util.Scanner;

/**
 *
 * @author ong
 */
public class Assignment {

    ModuleBFunction B = new ModuleBFunction();

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
                    System.out.println("3");
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

    public static void main(String[] args) {
        //initialize the variable at here
        //example:
        List<Restaurant> restaurant = new ArrayList<>();
        restaurant.add(new Restaurant("Nandos", "Tneh Chee Wei", "asd", "016-6666666", "Setapak", "1234567890"));
        restaurant.add(new Restaurant("Nandos1", "Tneh Chee Wei", "asd", "016-6666666", "Setapak", "1234567890"));
        Assignment assignment = new Assignment();
        assignment.menu();
    }

}
