/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class AssignedJob implements Serializable  {
    private String DmName;
    private int OrderID;
    
    public AssignedJob() {
    }
    
    public AssignedJob(String DmName, int OrderID) {
        this.DmName = DmName;
        this.OrderID = OrderID;
    }

    public String getDmName() {
        return DmName;
    }

    public void setDmName(String DmName) {
        this.DmName = DmName;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    
}
