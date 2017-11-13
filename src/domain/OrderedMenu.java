/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Liew
 */
public class OrderedMenu implements Serializable{
    
    private int orderId;
    private int menuId;
    private int quantity;
    private String menuName;
    
    public void OrderMenu(int orderId, int menuId, int quantity, String menuName){
        this.menuId = menuId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.menuName = menuName;
    }
    
    public void OrderMenu(){
        
    }
    
    public void setMenuId(int menuId){
       this.menuId = menuId; 
    }
    
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    
    
    public int getMenuId(){
        return menuId;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
    public int getQuantity(){
        return quantity;
    }

    public String getMenuName() {
        return menuName;
    }
    
}
