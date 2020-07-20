
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Suitcase {
    //instance variables based on the Item object
    private ArrayList<Item> contents = new ArrayList<>();
    private int maxWeight;
    
    //constructor, only takes the maxWeight variable
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    //calculates current weight of the suitcase, useful for the following method
    public int currentWeight(){
        int currentWeight = 0;
        for(Item item : contents){
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
    //checks if after adding the item, the weight limit will be met or exceeded, if not, it adds the item to suitcase
    public void addItem(Item i){
        if(this.currentWeight() + i.getWeight() <= this.maxWeight){
           this.contents.add(i);
        } 
        
    }
    
    //specifies formating when calling the object as a string
    @Override
    public String toString(){
        if(this.contents.isEmpty()){
            return "no items (" + this.currentWeight() + " kg)";
        }
        if(this.contents.size() == 1){
            return this.contents.size() + " item (" + this.currentWeight() + " kg)";
        } else;
        return this.contents.size() + " items (" + this.currentWeight() + " kg)";
    }
    
    //prints each item of a suitcase on a new line
    public void printItems(){
        for(Item i : contents){
            System.out.println(i);
        }
    }
    
    //calculates totalweight of suitcase
    public int totalWeight(){
        int totalWeight = 0;
        for(Item i: contents){
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    
    public Item heaviestItem(){
        if (this.contents.isEmpty()){
            return null;
        }
        
        //starts an Item object, assings it to the beginning and then loops through the list
        //to compare weights
        Item heaviest = this.contents.get(0);
        for(Item i : contents){
            if(i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }

}
