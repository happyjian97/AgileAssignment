/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Keat
 */
public class HrExecutive implements Serializable{
    private String name;
    private String ic;
     private String gender;
    private String contactNo;
    private String address;
    private String status;
    private String userName;
    private String password;
    
    
     public HrExecutive(String name, String ic, String gender , String contactNo, String address, String status, String userName, String password){
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.status = status;
        this.userName = userName;
        this.password = password;
       
        }
    //get
    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }
    
    public String getStatus(){
        return status;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    
    //set
    
    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(String status){
        this.status = status;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
    
  @Override
  public String toString() {
    return String.format(" %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", name, ic ,gender , contactNo, address, status, userName, password);
  }
     
}
