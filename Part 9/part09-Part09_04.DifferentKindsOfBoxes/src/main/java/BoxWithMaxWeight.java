
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */

//New subclass that extends the Box abstract class
public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int maxWeight;
    
    //constructor for the object class
    public BoxWithMaxWeight(int capacity){
        this.items = new ArrayList<>();
        this.maxWeight = capacity;
    }
    
    //finds all the item in the box and returns the sum of its weights
    public int getCurrentWeight(){
        int sum = 0;
        for(Item item : items){
            sum += item.getWeight();
        }
        return sum;
    }
    
    //implements the abstract method, checks that the max weight is not exceeded when adding a new itme
    @Override
    public void add(Item item){
        if(item.getWeight() + this.getCurrentWeight() <= this.maxWeight){
            this.items.add(item);
        }
    }

    //implements the isInBox method, checks if the item exists in the box or not
    @Override
    public boolean isInBox(Item item) {
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }

}
