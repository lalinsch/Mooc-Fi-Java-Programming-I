/**
 *
 * @author laloschjetnan
 */
public class ProductWarehouse extends Warehouse{
    
    private String productName;
    
    //constructor, adds the same values as the warehouse but also includes a productname
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName = productName;
    }
    
    //return's the products name
    public String getName(){
        return this.productName;
    }
    
    public void setName(String newName){
        this.productName = newName;
    }
    
    @Override
    public String toString(){
        return this.getName() + ": " + super.toString();
    }

}
