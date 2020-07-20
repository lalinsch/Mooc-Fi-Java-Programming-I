
import java.util.HashMap;

/**
 *
 * @author laloschjetnan
 */
public class IOU {
    private HashMap<String, Double> hashmap;
    
    public IOU(){
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }
    
    
}
