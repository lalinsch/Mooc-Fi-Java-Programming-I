
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class UserInterface {
    //class instance variables
    private TodoList toDoList;
    private Scanner scan;
    
    //constructor
    public UserInterface(TodoList toDoList, Scanner scan){
        this.toDoList = toDoList;
        this.scan = scan;
    }
    
    //main program flow
    public void start(){
        //infinite loop until user enters the command "stop"
        
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            //if the command is add, it asks for a newTask String and passes it to the 
            //toDoList
            else if(command.equals("add")){
                System.out.print("To add: ");
                String newTask = scan.nextLine();
                toDoList.add(newTask);
            }
            
            //on the "list" command, it simply prints all of the current items on the list
            else if(command.equals("list")){
                toDoList.print();
            }
            
            //if the command is remove, it asks for a number (based on the output)
            //and removes it using the todolist class' method
            else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int taskToRemove = Integer.valueOf(scan.nextLine());
                toDoList.remove(taskToRemove);
            }
        }
    }

}
