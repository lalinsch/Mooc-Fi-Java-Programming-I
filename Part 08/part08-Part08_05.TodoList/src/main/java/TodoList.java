
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class TodoList {
    //object's instance variables
    private ArrayList<String> list;
    
    //constructor
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    //takes a task and adds it to the list
    public void add(String task){
        this.list.add(task);
    }
    
    //finds all the tasks, assigns a number to them using the index i+1 and prints them to the console
    public void print(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i+1 + ": " + list.get(i));
        }
    }
    
    //removes a task based on the number that is displayed to the user (index i-1)
    public void remove(int number){
        this.list.remove(number - 1);
    }

}
