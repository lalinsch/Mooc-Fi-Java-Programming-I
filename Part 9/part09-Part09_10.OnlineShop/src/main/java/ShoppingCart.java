
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author laloschjetnan
 */

//shopping cart instance variables
public class ShoppingCart {
    private Map<String, Item> cart;
    
    //constructor, no parameters and initiates a hashmap
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    //returns all the vakues stored in the hashmap
    public Collection values(){
        return this.cart.values();
    }
    
    //adds a new item to our cart, if the item is already in the cart, increases the quantity by one
    public void add (String product, int price){
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
            //otherwise it adds the item to the list using the constructor
        } else{
           this.cart.put(product, new Item(product, 1, price)); 
        }
        
    }
    
    //returns the sum of all the items added to a shopping cart
    public int price(){
       int sum = 0;
       for(Item item : cart.values()){
           sum += item.price();
       }
       return sum;
    }
    
    //returns a list of items stored in the cart
    public void print(){
        for(Item item : cart.values()){
            System.out.println(item);
        }
    }
    
    
    

}
