/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Keat
 */
public class Delivery {
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
    private ArrayList list;

    
    //get
    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getClockIn() {
        return clockIn;
    }

    public String getClockOut() {
        return clockOut;
    }

    public String getTotalWorking() {
        return totalWorking;
    }

    public String getWorkingStatus() {
        return workingStatus;
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

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setClockIn(String clockIn) {
        this.clockIn = clockIn;
    }

    public void setClockOut(String clockOut) {
        this.clockOut = clockOut;
    }

    public void setTotalWorking(String totalWorking) {
        this.totalWorking = totalWorking;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /*
    
     public DeliveryMenInterface initializeList() {
         /*
         try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("DeliveryMen.dat"));
              list = (ArrayList) (oiStream.readObject());
             oiStream.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
     } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
         return true;
  }
     /*
     public DeliveryMenInterface DeliveryMenList(DeliveryMenInterface delivery) {
         initializeList();
         String outputStr = "Adde Delivery Men Results\n";
         for (int i = 0; i < list.size(); ++i) {
            outputStr += (i + 1) + ". " + list.get(i);
         }
          return outputStr;
  }
    
    */
}
