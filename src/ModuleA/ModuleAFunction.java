/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleA;
import domain.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ModuleAFunction {
    private List<Restaurant> restaurant = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public ModuleAFunction(){
    }
    
    public void RestaurantRegistration(List<Restaurant> restaurant){
        
        System.out.println("-----------------------");
        System.out.println("Affiliate Registration");
        System.out.println("-----------------------");
        
        int totalRest = restaurant.size();
        String restid = String.format("RE%06d",totalRest + 1);
        System.out.println("Restaurant ID: " + restid);
        System.out.println("(Please remember the ID for further use.)");
        System.out.print("Restaurant Name: ");
        String rName = sc.nextLine();
        System.out.print("Owner Name: ");
        String oName = sc.nextLine();
        System.out.print("Address: ");
        String add = sc.nextLine();
        System.out.print("Contact No: ");
        String no = sc.nextLine();
        System.out.print("Area: ");
        String area = sc.nextLine();
        System.out.print("Latitude: ");
        String latitude = sc.nextLine();
        System.out.print("Password: ");
        String pass =sc.nextLine();
        
        for(int i=0 ; i<restaurant.size() ; i++){
            if(add.equals(restaurant.get(i).getAddress())){
                System.out.println("Restaurant already exists in the system.");
                RestaurantRegistration(restaurant);
            }else{
                Restaurant rest = new Restaurant(restid,rName,oName,add,no,area,latitude,pass);
                restaurant.add(rest);
                System.out.println("Successfully Registered.");
                RestaurantLogin(restaurant);
            }
        }       
    }
    
    public void RestaurantLogin(List<Restaurant> restaurant){
        int idcount = 0;
        System.out.println("----------------");
        System.out.println("Affiliate Login");
        System.out.println("----------------");        
        System.out.print("Restaurant ID: ");
        String id = sc.nextLine().toUpperCase();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        
        for(int i=0 ; i<restaurant.size() ; i++){
           while(id.equals(restaurant.get(i).getRestaurantID())){
               if(pass.equals(restaurant.get(i).getPassword())){
                   idcount = 1;
                   System.out.println("Successfully Login");
                   RestaurantMenu(restaurant);
               }
               else{
                   System.out.println("Invalid password");
                   RestaurantLogin(restaurant);
               }
           }
        }
        if(idcount == 0){
            System.out.println("Invalid ID");
            RestaurantLogin(restaurant);
        }
    }
    
    public void RestaurantMenu(List<Restaurant> restaurant){
        System.out.println("1. Add New Menu Items");
        System.out.println("2. Update Menu Item Details");
        System.out.println("3. Remove Menu Items");
        System.out.println("0. Log Out");
        
        System.out.print("Option: ");
        int selection = sc.nextInt();
        sc.nextLine();
        switch(selection){
            case 1:{
                System.out.println("Stay Tuned. Under Construction.");
                break;
            }
            case 2:{
                System.out.println("Stay Tuned. Under Construction.");
                break;
            }
            case 3:{
                System.out.println("Stay Tuned. Under Construction.");
                break;
            }
            case 0:{
                System.out.println("Successfully Logout");
                //RestaurantLogin(restaurant);
                Amenu();
                break;
            }
            default:{
                System.out.println("Error. Please key in again.");
                RestaurantMenu(restaurant);
                break;
            }
        }
    }
 
    public void Amenu(){
        System.out.println("1. Affiliate Registration");
        System.out.println("2. Affiliate Login");
        System.out.print("Option: ");
        int selection = sc.nextInt();
        sc.nextLine();
        switch(selection){
            case 1:{
                RestaurantRegistration(restaurant);
            }
            case 2:{
                RestaurantLogin(restaurant);
            }
            default:{
                System.out.println("Error. Please select again");
                Amenu();
            }
        }
    }
    
    public void setRestaurant(List<Restaurant> restaurant){
        this.restaurant = restaurant;
    }
}

