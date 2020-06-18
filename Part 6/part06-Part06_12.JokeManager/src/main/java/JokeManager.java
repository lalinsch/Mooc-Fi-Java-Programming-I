
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author laloschjetnan
 */
public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();
    
    public JokeManager(){
        
    }
    
    //adds a string parameter to the jokes list
    public void addJoke(String joke){
        jokes.add(joke);   
    }
    
    //uses the Random object to pick a random joke based on the jokes list size
    public String drawJoke(){
        if (this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int randomJokeIndex = rand.nextInt(this.jokes.size());
        return this.jokes.get(randomJokeIndex);
    }
    
    //prints every joke in a single line 
    public void printJokes(){
        for(String joke : jokes){
            System.out.println(joke);
        }
    }
}
