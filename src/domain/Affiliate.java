package domain;

import java.io.Serializable;

public class Affiliate implements Serializable {
    private String UsrName;
    private String UsrPass;
    private String RestName;
    private String RestOwner;
    private String RestContact;
    private String RestAddress;
    private String RestTown;
    private String RestStatus;
    private String AccType;
    
    public Affiliate(){}
    
    public Affiliate(String UsrName,String UsrPass,String RestName,String RestOwner,String RestContact,String RestAddress,String RestTown,String RestStatus,String AccType){
        this.UsrName = UsrName;
        this.UsrPass = UsrPass;
        this.RestName = RestName;
        this.RestOwner = RestOwner;
        this.RestContact = RestContact;
        this.RestAddress = RestAddress;
        this.RestTown = RestTown;
        this.RestStatus = RestStatus;
        this.AccType = AccType;
    }
    public String getUsrName() {
        return UsrName;
    }
    public void setUsrName(String UsrName){
        this.UsrName = UsrName;
    }
    
    public String getUsrPass() {
        return UsrPass;
    }
    public void setUsrPass(String UsrPass){
        this.UsrPass = UsrPass;
    }
    
    public String getRestName() {
        return RestName;
    }
    public void setRestName(String RestName){
        this.RestName = RestName;
    }
    
    public String getRestOwner() {
        return RestOwner;
    }
    public void setRestOwner(String RestOwner){
        this.RestOwner = RestOwner;
    }
    
    public String getRestContact() {
        return RestContact;
    }
    public void setRestContact(String RestContact){
        this.RestContact = RestContact;
    }
    
    public String getRestAddress() {
        return RestAddress;
    }
    public void setRestAddress(String RestAddress){
        this.RestAddress = RestAddress;
    }
    
    public String getRestTown(){
        return RestTown;
    }
    public void setRestTown(String RestTown){
        this.RestTown = RestTown;
    }
    
    public String getRestStatus() {
        return RestStatus;
    }
    public void setRestStatus(String RestStatus){
        this.RestStatus = RestStatus;
    }
    
    public String getAccType(){
        return AccType;
    }
    public void setAccType(String AccType){
        this.AccType = AccType;
    }
    
    
    @Override
  public int hashCode() {
    int hash = 3;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Affiliate other = (Affiliate) obj;
    return true;
  }
    
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n",UsrName ,UsrPass, RestName, RestOwner,RestContact,RestAddress,RestTown,RestStatus,AccType);
    }
}
