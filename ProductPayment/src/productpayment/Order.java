package productpayment;

import java.util.*;

public class Order {
    
    public String userID;
    List<Product> orderedItem = new ArrayList<Product>();
    
    public Order(){}
    public Order(String userID){
        this.userID = userID;
    }
    
   public void addProduct(Product p){
       orderedItem.add(p);
    }
    
    public void removeProduct(int pID)throws ProductNotFoundException{
        boolean found = false;
        for (Product newP : orderedItem){
            if(newP.getpID() == pID){
            } else {
                orderedItem.remove(newP);
                found =true;
            }
        }
        if(!found){
            throw new ProductNotFoundException("Product with product ID "+pID+" is not found.");
        }
    }
    
    public void getCartDetail(){
        if (orderedItem != null && orderedItem.size() > 0){
            System.out.println(userID);
            System.out.println("Number of Items Picked:" + orderedItem.size());
            System.out.println();
            for(Product list: orderedItem){
                list.totalCostofItem();
            }
        } else {
            System.out.println("Shopping cart is empty.");
        }
    }
    
    public void getProductFromCart(int pID) throws ProductNotFoundException{
        for (Product p: orderedItem) {
            if(p.getpID() == pID){
                p.totalCostofItem();
            }
        }
    }
    
    public void modifyItem(Product item) {
        boolean found = false;
        for(Product i: orderedItem){
            if(i.getpID() == item.getpID()) {
                if(i.getStock() != 0){
                    i.setStock() = i.getStoke() + 1;
                }
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Item not found in cart. Nothing removed");
    }
    
    public int productCount(){
        int sum = 0;
        for(Product p : orderedItem){
            sum = sum + p.getStock();
        }
        return sum;
    }
    
    
    public void showTotal(){
        if (orderedItem != null && orderedItem.size() > 0){
            System.out.println(userID);
            System.out.println("Number of Items: " + orderedItem.size());
            System.out.println();
            for(Product p: orderedItem){
                p.totalCostofItem();
            }
        }
    }
    
    double getTotalCostofCart() {
        double sum = 0.0d;
        for(Product p: orderedItem){
            sum = sum + p.totalCostofAllItem;
        }
        return sum;
    }
    
}