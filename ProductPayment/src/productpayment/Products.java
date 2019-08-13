package productpayment;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products = new ArrayList<Product>();
    
    public Products(){
        this.initStoreItems();
    }
    
    public List<Product> getProducts(){
        return products;
    }
    
    public void initStoreItems(){
        String [] productNames = {"Lux Soap", "Kiwi", "Cooking Oil", "Foil"};
        double [] productPrices = {100.00d, 90.00d, 250.00d, 145.00d};
        int [] stock = {10, 23, 9, 11};
        
        for(int i = 0; i < productNames.length; i++){
            this.products.add(new Product(i + 1, productNames[i], (int) productPrices[i], stock[i]));
        }
    }
    
}

