/**
 *
 * @author laloschjetnan
 */
public class Item {
    
    //item class instance variables
    private String product;
    private int qty;
    private int unitPrice;
    
    //constructor for an item
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    //returns the final value based on the amount requested and the unit price
    public int price(){
        return this.qty * this.unitPrice;
    }
    
    //increases the amount if items by 1
    public void increaseQuantity(){
        this.qty++;
    }
    
    //represents how an item should be printed to the console
    @Override
    public String toString(){
        return this.product +": " + this.qty;
    }

}
