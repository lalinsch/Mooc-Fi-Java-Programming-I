package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;
    private int idCounter;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
        this.idCounter = 0;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            if (command.equals("1")){
                System.out.println("Listing the database contents");
                //prints every task stored in the database
                this.database.list().forEach(task -> System.out.println(task));
            }
            
            if (command.equals("2")){
                //creates a new todo object and adds it to the database, it also increments the idCounter
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String name = this.scanner.nextLine();
                System.out.println("Enter a description");
                String description = this.scanner.nextLine();
                Todo todo = new Todo(this.idCounter, name, description, false);
                this.database.add(todo);
                this.idCounter++;
            }
            
            if (command.equals("3")){
                //modifies the boolean for a specific task based on its id 
                System.out.println("Which todo should be mark as done? (give id)");
                int idToMarkAsDone = Integer.valueOf(this.scanner.nextLine());
                this.database.markAsDone(idToMarkAsDone);
            }
            
            if (command.equals("4")){
                //deletes a task from the database based on its id 
                System.out.println("Which todo should be removed? (give id)");
                int idToRemove = Integer.valueOf(this.scanner.nextLine());
                this.database.remove(idToRemove);
            }
        }

        System.out.println("Thank you!");
    }

}
