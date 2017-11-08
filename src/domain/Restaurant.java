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
public class Restaurant {
    private String RestaurantName;
    private String OwnerName;
    private String Address;
    private String ContactNo;
    private String Area;
    private String Password;

    public Restaurant(String RestaurantName, String OwnerName, String Address, String ContactNo, String Area, String Password) {
        this.RestaurantName = RestaurantName;
        this.OwnerName = OwnerName;
        this.Address = Address;
        this.ContactNo = ContactNo;
        this.Area = Area;
        this.Password = Password;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "RestaurantName=" + RestaurantName + ", OwnerName=" + OwnerName + ", Address=" + Address + ", ContactNo=" + ContactNo + ", Area=" + Area + ", Password=" + Password + '}';
    }
    
}
