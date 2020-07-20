
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author laloschjetnan
 */
public class Warehouse {
    //class instance variables
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    //constructor
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    //adds a product to both the price and the stock maps maintaining the same identifier 
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    //looks in the prices map to find the correct product and returns its price value, otherwise it defaults to -99
    public int price(String product){
        if(this.prices.containsKey(product)){
           return this.prices.get(product); 
        }
        return -99;
    }
    
    //looks at the stock for a particular item, and returns the number of items left, otherwise returns 0
    public int stock(String product){
        if (this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        return 0;
    }
    
    //finds a product based on the parameter, checks if the product exists in the warehosue and reduces the
    //inventory by one, once that is done it returns true, otherwise returns false
    public boolean take(String product){
        if(this.stock.containsKey(product)){
            int stock = this.stock.get(product);
            if(stock > 0){
                stock--;
                this.stock.replace(product, stock);
                return true;
            }
        }
        return false;
    }
    
    //returns all the keys from the prices map (could also be from the stock map)
    public Set<String> products(){
        return this.prices.keySet();
    }

}
