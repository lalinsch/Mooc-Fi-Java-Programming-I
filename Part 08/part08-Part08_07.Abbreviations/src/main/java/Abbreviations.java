
import java.util.HashMap;

/**
 *
 * @author laloschjetnan
 */
public class Abbreviations {
    private HashMap<String, String> directory;
    
    public Abbreviations(){
        this.directory = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.directory.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.directory.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        return this.directory.get(abbreviation);
    }

}
