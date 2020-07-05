
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */

//another implementation of the box abstract clas
public class MisplacingBox extends Box{
    private ArrayList<Item> items;
    
    //constructor
    public MisplacingBox(){
        this.items = new ArrayList<>();
    }
    
    //in this instance, an items is always added to the box
    @Override
    public void add(Item item){
        this.items.add(item);
    }
    
    //always returns false, regardless of the item being in the box or not
    @Override
    public boolean isInBox(Item item){
        return false;
    }

}
