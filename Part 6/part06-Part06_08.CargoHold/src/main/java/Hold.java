
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Hold {
    //similar structure to the suitcase class, but now in a more abstract way
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;
    
    //constructor
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    //finds the current weight based on the total weight of each suitcase
    public int currentWeight(){
        int currentWeight = 0;
        for(Suitcase s : suitcases){
            currentWeight += s.totalWeight();
        }
        return currentWeight;
    }
    
    //checks if the maxweight will be exceeded after adding a new suitcase, if not
    //it adds the suitcase to the list
    public void addSuitcase(Suitcase suitcase){
        if(this.currentWeight() + suitcase.totalWeight() <= this.maxWeight){
           this.suitcases.add(suitcase); 
        }
    }
    
    //specifies the string format of the object when it's called
    @Override
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.currentWeight() + " kg)";
    }
    
    //prints all items of the cargo based on the suitcases' printItems() method
    public void printItems(){
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }

}
