/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Liew
 */
public class Menu {
    private static int number = 1000;
    private int menuId;
    private String restaurantName;
    private String menuName;
    private double price;

    
    public Menu(String restaurantName, String menuName, double price) {
        this.restaurantName = restaurantName;
        this.menuName = menuName;
        this.price = price;
        menuId = ++number;
    }
    
    

    public void Menu() {
    }

    
    public int getMenuId() {
        return menuId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
}
