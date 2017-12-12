package domain;

import java.text.DecimalFormat;

/**
 *
 * @author Tan Eu Tim
 */
public class Menu {
    private static int nextNumber = 1000;
    private int number;
    private String MenuName;
    private String MenuDesc;
    private double MenuPrice;
    private int MenuRank;
    private String MenuStatus;
    private String PromotionType;
    private String RestaurantName;

    public Menu(String MenuName,String MenuDesc,double MenuPrice,int MenuRank,String MenuStatus,String PromotionType,String RestaurantName) {
        this.MenuName = MenuName;
        this.number = nextNumber++;
        this.MenuDesc = MenuDesc;
        this.MenuPrice = MenuPrice;
        this.MenuRank = MenuRank;
        this.MenuStatus = MenuStatus;
        this.PromotionType = PromotionType;
        this.RestaurantName = RestaurantName;
  }
    public Menu(String MenuName,String MenuDesc,double MenuPrice) {
        this.MenuName = MenuName;
        this.number = nextNumber++;
        this.MenuDesc = MenuDesc;
        this.MenuPrice = MenuPrice;
  }
    
    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
        Menu.nextNumber = nextNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public String getMenuDesc() {
        return MenuDesc;
    }

    public void setMenuDesc(String MenuDesc) {
        this.MenuDesc = MenuDesc;
    }

    public double getMenuPrice() {
        return MenuPrice;
    }

    public void setMenuPrice(double MenuPrice) {
        this.MenuPrice = MenuPrice;
    }

    public int getMenuRank() {
        return MenuRank;
    }

    public void setMenuRank(int MenuRank) {
        this.MenuRank = MenuRank;
    }

    public String getMenuStatus() {
        return MenuStatus;
    }

    public void setMenuStatus(String MenuStatus) {
        this.MenuStatus = MenuStatus;
    }

    public String getPromotionType() {
        return PromotionType;
    }

    public void setPromotionType(String PromotionType) {
        this.PromotionType = PromotionType;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }
    
    @Override
  public String toString() {
     DecimalFormat df = new DecimalFormat("#.00");
    return String.format("%-10d %-15s %-25s %-15s %-10d %-15s %-10s %-15s", number, MenuName,MenuDesc,df.format(MenuPrice),MenuRank,MenuStatus,PromotionType,RestaurantName);
  }
    
}
