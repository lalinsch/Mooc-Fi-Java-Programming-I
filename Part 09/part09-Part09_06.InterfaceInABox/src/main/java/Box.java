
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maximumCapacity;
    
    //constructor, sets the weight limit
    public Box(double maximumCapacity){
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }
    
    //implements the interface method, calculates the total weight of the items in a box
    public double weight(){
        double sum = 0;
        for(Packable item : items){
            sum += item.weight();
        }
        return sum;
    }
    
    //checks if the weight limit is met after adding an item, if it's not, it adds the item to the box
    public void add(Packable packable){
        if(packable.weight() + this.weight() <= this.maximumCapacity){
            items.add(packable);
        }
    }
    

    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
