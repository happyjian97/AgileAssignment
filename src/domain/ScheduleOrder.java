
package domain;

import java.util.Date;
import java.io.Serializable;

public class ScheduleOrder implements Serializable{
    
    private static int OrderID = 2000;
    private int number;
    private Date OrderDate;
    private String Session;
    private double TotalPrice;
    private String CustomerTel;
    private String MenuItem;
    private int MenuID;
    private String Destination;
    private String Status;

    public ScheduleOrder(String CustomerTel,int MenuID,String MenuItem,String Session,int Quantity,String Destination,double TotalPrice,Date OrderDate,String Status){
        this.number = OrderID++;        
        this.CustomerTel = CustomerTel;
        this.MenuID = MenuID;
        this.MenuItem = MenuItem;
        this.Session = Session;       
        this.Quantity = Quantity;              
        this.Destination = Destination;       
        this.TotalPrice = TotalPrice;
        this.OrderDate = OrderDate;
        this.Status = Status;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public int getMenuID() {
        return MenuID;
    }

    public void setMenuID(int MenuID) {
        this.MenuID = MenuID;
    }

    public String getMenuItem() {
        return MenuItem;
    }

    public void setMenuItem(String MenuItem) {
        this.MenuItem = MenuItem;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    private int Quantity;
    
    
    
    public ScheduleOrder(){
        number = OrderID++;
    }
    
    public int getOrderID(){
        return OrderID;
    }
    
    public void setOrderID(int OrderID){
        this.OrderID = OrderID;
    }
    
    public double getTotalPrice(){
        return TotalPrice;
    }
    
    public void setTotalPrice(double TotalPrice){
        this.TotalPrice = TotalPrice;
    }
    
    public String getCustomerTel(){
        return CustomerTel;
    }
    
    public void setCustomerTel(String CustomerTel){
        this.CustomerTel = CustomerTel;
    }
    
    public String getSession(){
        return Session;
    }
    
    public void setSession(String Session){
        this.Session = Session;
    }
    
    public Date getOrderDate(){
        return OrderDate;
    }
    
    public void setOrderDate(Date OrderDate){
        this.OrderDate = OrderDate;
    }
    
    public String toString(){
        return String.format("No. %-10d %-20s %-10d %-20s %-20s %-10d %-20s RM%.2f     %tD %10s\n", number, CustomerTel, MenuID, MenuItem, Session, Quantity, Destination, TotalPrice,OrderDate, Status);
    }
}