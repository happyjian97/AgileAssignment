/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Keat
 */
public interface DeliveryMenInterface {
    public String getName();
    public String getIc();
    public String getContactNo();
    public String getAddress();
    public String getType();
    public String getStatus();
    public String getClockIn();
    public String getClockOut();
    public String getTotalWorking();
    public String getWorkingStatus();
    public String getUserName();  
    public String getPassword();
    
    //set
    
    public void setName( String name);
    public void setIc(String ic);
    public void setContactNo(String contactNo);
    public void setAddress(String address);
    public void setType(String type);
    public void setStatus(String status);
    public void setClockIn(String clockIn);
    public void setClockOut(String clockOut);
    public void setTotalWorking(String totalWorking);
    public void setWorkingStatus(String workingStatus);
    public void setUserName(String userName);
    public void setPassword(String password);
    
    
    public DeliveryMenInterface initializeList();
    public DeliveryMenInterface DeliveryMenList(DeliveryMenInterface delivery);
   
}
