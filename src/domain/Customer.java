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
public class Customer {
    private String telNo;
    private String address;

    public Customer() {
    }

    public Customer(String telNo, String address) {
        this.telNo = telNo;
        this.address = address;
    }

    
    public String getTelNo() {
        return telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
