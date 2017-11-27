/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Keat
 */
import java.io.Serializable;
/**
 *
 * @author Keat
 */
public class DeliveryMen implements Serializable {

    private String name;
    private String ic;
    private String contactNo;
    private String address;
    private String type;
    private String status;
    private String clockIn;
    private String clockOut;
    private String totalWorking;
    private String workingStatus;
    private String userName;
    private String password;
    
    
    public DeliveryMen(String name, String ic, String contactNo , String address, String type, String status, String clockIn, String clockOut, String totalWorking, String workingStatus, String userName, String password){
        this.name = name;
        this.ic = ic;
        this.contactNo = contactNo;
        this.address = address;
        this.type = type;
        this.status = status;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
        this.totalWorking = totalWorking;
        this.workingStatus = workingStatus;
        this.userName = userName;
        this.password = password;
    }
    //get
    public String getName(){
        return name;
    }
    
    public String getIc(){
        return ic;
    }
    
    public String getContactNo(){
        return contactNo;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getType(){
        return type;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getClockIn(){
        return clockIn;
    }
    
    public String getClockOut(){
        return clockOut;
    }
    
    public String getTotalWorking(){
        return totalWorking;
    }
    
    public String getWorkingStatus(){
        return workingStatus;
    }
    
    public String getUserName(){
        return userName;
    }
    
      
    public String getPassword(){
        return password;
    }
    
    
    
    //set
    
    public void setName( String name){
        this.name = name;
    }
    
    public void setIc(String ic){
        this.ic = ic;
    }
    
    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    
   public void setClockIn(String clockIn){
       this.clockIn = clockIn;
   }
   
   public void setClockOut(String clockOut){
       this.clockOut = clockOut;
   }
    
   public void setTotalWorking(String totalWorking){
       this.totalWorking = totalWorking;
   }
   
   public void setWorkingStatus(String workingStatus){
       this.workingStatus = workingStatus;
   }
   
   public void setUserName(String userName){
       this.userName = userName;
   }
   
    public void setPassword(String password){
        this.password = password;
    }
    
 
   @Override
  public String toString() {
    return String.format(" %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", name, ic, contactNo, address, type, status, clockIn, clockOut, totalWorking, workingStatus, userName, password);
  }
    
}

