package productpayment;

import java.util.*;

public class ProductLogic {
    Scanner scan = new Scanner(System.in);
       
    public void addProduct(){
        
        System.out.println("Enter Product ID");
        int pID = scan.nextInt();
        System.out.println("Enter Product Name");
        String pName = scan.next();
        System.out.println("Enter Product Price");
        double price = scan.nextDouble();
        System.out.println("Enter Product Quantity");
        int quantity = scan.nextInt();
        
        Product product = new Product(pID, pName, quantity, price);
                
    }
    
    public void editProduct(){
       
    }
    
    public void deleteProduct() {
       
    }
    
    public void getAll(){
        
    }
}
