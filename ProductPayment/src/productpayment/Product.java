
package productpayment;

import java.util.*;

public class Product {   
    private int pID;
    private String pName;
    private int stock;
    private double price;
    double totalCostofAllItem;
    
    public Product(int pID, String pName, int stock, double price){
        this.pID = pID;
        this.pName = pName;
        this.stock = stock;
        this.price = price;
    }

    Product() {
        
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    public void totalCostofItem(){
        totalCostofAllItem = (stock * price);
        System.out.println("Product ID: " + pID + " Product Name: " + pName + " Quantity: " + 
                stock + " @ Kes" + price + " = kes " + totalCostofAllItem);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj ==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Product other = (Product) obj;
        if(!Objects.equals(this.pName, other.pName)){
            return false;
        }if(!Objects.equals(this.pID, other.pID)){
            return false;
        }if(!Objects.equals(this.price, other.price)){
            return false;
        }if(!Objects.equals(this.stock, other.stock)){
            return false;
        }
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.pID);
        hash = 29 * hash + Objects.hashCode(this.pName);
        hash = 29 * hash + Objects.hashCode(this.price);
        hash = 29 * hash + Objects.hashCode(this.stock);
        return hash; //To change body of generated methods, choose Tools | Templates.
    }

    void totalCostofItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
