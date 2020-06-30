
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //creates the containers and sets the maximum capacity as ints
        int firstContainer = 0;
        int secondContainer = 0;
        int capacity = 100;

        while (true) {
            //UI showing the current status of each container
            System.out.println("First: " + firstContainer + "/" + capacity);
            System.out.println("Second: " + secondContainer + "/" + capacity);

            String input = scan.nextLine();
            String[] parts = input.split(" ");  //breaks the input into a String array
            if (input.equals("quit")) {
                break;
            }

            //assigns the strings in the parts[] array to a new string and a new int
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            //intstruction set for the add comand
            if (command.equals("add")) {
                if (firstContainer + amount > capacity) {
                    firstContainer = capacity;
                } else if (amount > 0) {
                    firstContainer += amount;
                }

            }

            //instruction set for the move comand
            if (command.equals("move")) {
                if (amount + secondContainer > capacity) {
                    firstContainer -= amount;
                    secondContainer = capacity;
                } else if (amount > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else if (amount > 0) {
                    secondContainer += amount;
                    firstContainer -= amount;
                }

                //makes sure the containers are kept within the valid values 0-100
                if (secondContainer > capacity) {
                    secondContainer = capacity;
                }
                if (firstContainer < 0) {
                    firstContainer = 0;
                }

            }
            
            //instruction set for the remove command
            if (command.equals("remove")){
                if (amount > secondContainer){
                    secondContainer = 0;
                } 
                else if (amount > 0){
                    secondContainer -= amount;
                }
            }

        }

    }

}
