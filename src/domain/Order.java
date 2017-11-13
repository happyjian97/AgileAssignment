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
public class Order implements Serializable {

    private static int number = 1000;
    private int orderId;
    private String remark;
    private String restaurant;
    private double totalPrice;
    private String customerTel;
    private String status;
    private String orderedDate;
    private String orderTime;
    private String deliveredTime;
    

    public Order(int orderId, String remark, String restaurant, double totalPrice, String customerTel, String status, String orderedDate, String orderTime, String deliveredTime) {
        this.orderId = orderId;
        this.remark = remark;
        this.restaurant = restaurant;
        this.totalPrice = totalPrice;
        this.customerTel = customerTel;
        this.status = status;
        this.orderedDate = orderedDate;
        this.orderTime = orderTime;
        this.deliveredTime = deliveredTime;
        orderId = ++number;
    }
    
    
    
    public Order(){
        orderId = ++number;
    }
    
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    
    public void setRemark(String remark){
        this.remark = remark;
    }
    
    public void setRestaurant(String restaurant){
        this.restaurant = restaurant;
    }
    
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setCustomerTel(String customerTel){
        this.customerTel = customerTel;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setOrderedDate(String orderedDate){
        this.orderedDate = orderedDate;
    }
    
    public void setOrderTime(String orderTime){
        this.orderTime = orderTime;
    }
    
    public void setDeliveredTime(String deliveredTime){
        this.deliveredTime = deliveredTime;
    }
    
    public String getRemark(){
        return remark;
    }
    
    public String getRestaurant(){
        return restaurant;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
    
    public String getCustomerTel(){
        return customerTel;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getOrderedDate(){
        return orderedDate;
    }
    
    public String getOrderTime(){
        return orderTime;
    }
    
    public String getDeliveredTime(){
        return deliveredTime;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
    public void resizeNum(){
        --number;
    }
}
