
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Pipe <T>{

    //instance variable is an arraylist with generic type values
    private ArrayList<T> values;
    
    //constructor
    public Pipe(){
        this.values = new ArrayList<>();
    }
    
    //adds a value (from the parameter) to the arraylist
    public void putIntoPipe(T value){
        this.values.add(value);
    }
    
    //removes the oldest value from the arraylist from the paramter and returns it (index 0)
    public T takeFromPipe(){
        
        //if the list is empty it returns null
        if (this.values.isEmpty()){
            return null;
        }
        
        T oldestValue = this.values.get(0);
        this.values.remove(0);
        return oldestValue;   
    }
    
    //checks if the arraylsit is empty
    public boolean isInPipe(){
        if (this.values.isEmpty()){
            return false;
        }
        return true;
    }
    
}
