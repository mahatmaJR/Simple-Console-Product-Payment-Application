package productpayment;

import java.util.*;



public class ProductPayment {
   
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws ProductNotFoundException {
        
        System.out.println("Enter your Username");
        String userName = scan.next();
        if (userName.equalsIgnoreCase("admin")){
            
            int count = 0;
            for (int i = 0; i < 2; i++){
                System.out.println("Enter your password");
                String pass = scan.next();
                if (pass.equals("passWord1")){
                    adminMenu();
                }
                else{
                    System.out.println("Try Again!!");
                }
            }
            System.out.println("Please call sys Admin");
        }else{
            Order newOrder = new Order(userName);
        
            mainMenu(newOrder);
        }
        
    /**
     *
     */
    public static void adminMenu(){
        ProductLogic pl = new ProductLogic();
        
        while(true)
                {
            System.out.println("1. Add Product.");
            System.out.println("2. Remove Product.");
            System.out.println("3. Update Product.");
            System.out.println("4. Show All Products.");
            
            int chioce = scan.nextInt();
            
            if (chioce == 1){
                pl.addProduct();
            }else if(chioce == 2){
                pl.deleteProduct();
            }else if(chioce == 3){
                pl.editProduct();
            }else if(chioce == 4){
                
            }
        } 
    }
    
    public static void mainMenu(Order newOrder) throws ProductNotFoundException{
        
        while (true){
            System.out.println("Welcome to home shopping: ");
            System.out.println("1. Add item to cart.");
            System.out.println("2. Remove item from cart.");
            System.out.println("3. Change item quantity");
            System.out.println("4. Show shopping cart");
            System.out.println("5. Total cost of items");
            System.out.println("6. Quit");
            
            int input = scan.nextInt();
            
            if (input == 1){
                System.out.println("Add item to Cart");
                System.out.println("Enter Product ID");
                int pID = scan.nextInt();
                System.out.println("Enter Product name");
                String pName = scan.next();
                System.out.println("Enter Product quantity");
                int quantity = scan.nextInt();
                System.out.println("Enter Price");
                double price = scan.nextDouble();
                
                Product product = new Product(pID, pName, quantity, price);
                newOrder.addProduct(product);
            }else if(input == 2){
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter ID of product to remove: ");
                int pID = scan.nextInt();
                newOrder.removeProduct(pID);
            }else if(input == 3){
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the product ID: ");
                int pID = scan.nextInt();
                System.out.println("Enter the new quantity: ");
                int quantity = scan.nextInt();
                Product p = new Product();
                p.setpID(pID);
                p.setStock(quantity);
                newOrder.modifyItem(p);
            }else if (input == 4){
                System.out.println("Show shopping cart.");
                newOrder.showTotal();
            }else if (input == 5){
                System.out.println("The Total cost of your shopping is: kes" + newOrder.getTotalCostofCart());
            }
            else if (input == 6){
                break;
            }
        }
    }
}