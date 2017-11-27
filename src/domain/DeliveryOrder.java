/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Zhen Jian
 */
public class DeliveryOrder implements Serializable{
    String man;
    int order;
    
    public DeliveryOrder(){
    }
    
    public DeliveryOrder(String man, int order){
        this.man = man;
        this.order=order;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    
    
    @Override
  public String toString() {
    return String.format(" %-20s %-20s \n", man, order);
  }
    
}
