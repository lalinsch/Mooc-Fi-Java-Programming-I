
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class TodoList {
    private ArrayList<String> taskList = new ArrayList<>();
    
    public TodoList(){
        
    }
    
    //adds a string to the list based on a string parameter
    public void add(String task){
        taskList.add(task);
    }
    
    //prints each item from the list (note the use of the i variable)
    public void print(){
        for(int i = 0; i < taskList.size(); i++){
            System.out.println(i+1 + ": " + taskList.get(i));
        }
    }
    
    //removes an item based on the input provided 
    //this is represented as number-1 to get the correct index position
    public void remove(int number){
        taskList.remove(number-1);
    }

}
