
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class UserInterface {

    //UI class instance variables
    private Scanner scan;
    private TodoList list;

    //constructor
    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.list = list;
    }

    //main program loop, repeats until the command input is "stop"
    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            }

            //adds a task to the list based on the TodoList object "add" method
            if (command.equals("add")) {
                System.out.print("To add: ");
                String taskAdded = scan.nextLine();
                this.list.add(taskAdded);

            }

            //prints all of the current tasks on the list
            if (command.equals("list")) {
                this.list.print();

            }

            //asks for a number and removes it from the list using the remove() method of the TodoList object
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskRemoved = Integer.valueOf(scan.nextLine());
                this.list.remove(taskRemoved);
                
            }
        }
    }

}
