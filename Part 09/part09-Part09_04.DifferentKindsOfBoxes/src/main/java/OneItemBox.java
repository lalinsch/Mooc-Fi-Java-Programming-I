
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */

//another subclass of the Box abstract class
public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> items;

    //constructor, the capacity of this kind of box is always one
    public OneItemBox(){
        this.items = new ArrayList<>();
        this.capacity = 1;
    }
    
    
    //only adds an item to the box when the box is empty
    @Override
    public void add(Item item){
        if (this.items.isEmpty()){
            this.items.add(item);
        }
    }
    
    //checks if the item passed on the parameter is the same as the one in the box
    @Override
    public boolean isInBox(Item item){
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }
    

}
