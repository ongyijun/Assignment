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
public class Food {
    private String FoodName;
    private double FoodPrice;
    private String FoodType;
    private char FoodAvailability;
    private Restaurant restaurant;

    public Food(String FoodName, double FoodPrice, String FoodType, char FoodAvailability, Restaurant restaurant) {
        this.FoodName = FoodName;
        this.FoodPrice = FoodPrice;
        this.FoodType = FoodType;
        this.FoodAvailability = FoodAvailability;
        this.restaurant = restaurant;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }

    public char getFoodAvailability() {
        return FoodAvailability;
    }

    public void setFoodAvailability(char FoodAvailability) {
        this.FoodAvailability = FoodAvailability;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Food{" + "FoodName=" + FoodName + ", FoodPrice=" + FoodPrice + ", FoodType=" + FoodType + ", FoodAvailability=" + FoodAvailability + ", restaurant=" + restaurant + '}';
    }
    
    
}
