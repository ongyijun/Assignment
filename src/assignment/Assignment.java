/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import java.util.Scanner;
/**
 *
 * @author ong
 */


public class Assignment {

    /**
     * @param args the command line arguments
     */
    public void menu(){
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
        while(!selection.equals("1")&&!selection.equals("2")&&!selection.equals("3")&&!selection.equals("4")){
        System.out.print("Option: ");
        selection = s.next();
        switch(selection){
            case "1":{
                //create class at module A and import the module A at this class and den call the method from here
                System.out.println("1");
                break;
            }
            case "2":{
                System.out.println("2");
                break;
            }
            case "3":{
                System.out.println("3");
                break;
            }
            case "4":{
                System.out.println("4");
                break;
            }
            default:{
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
        restaurant.add(new Restaurant("Nandos","Tneh Chee Wei","asd","016-6666666","Setapak","1234567890"));
        restaurant.add(new Restaurant("Nandos1","Tneh Chee Wei","asd","016-6666666","Setapak","1234567890"));
        Assignment assignment = new Assignment();
        assignment.menu();
    }
    
}
