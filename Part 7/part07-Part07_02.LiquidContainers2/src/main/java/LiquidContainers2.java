
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //creates 2 containers based on the container class
        Container firstContainer = new Container();
        Container secondContainer = new Container();

while (true) {
            //UI showing the current status of each container
            System.out.println("First: " + firstContainer.contains() + "/" + firstContainer.getCapacity());
            System.out.println("Second: " + secondContainer.contains() + "/" + secondContainer.getCapacity());

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
               firstContainer.add(amount);
            }

            //instruction set for the move comand
            if (command.equals("move")) {
                //checks if the amount requested is larger than the amount on firstContainer
                //if so, it increases the secondContainer only by the available amount 
              if (amount > firstContainer.contains()){
                  secondContainer.add(firstContainer.contains());
                  firstContainer.remove(amount);
              } else {
                  //otherwise there's a straightfoward swap of amounts
                  secondContainer.add(amount);
                  firstContainer.remove(amount);
              }
            }
            
            //instruction set for the remove command
            if (command.equals("remove")){
                secondContainer.remove(amount);
            }

        }
    }

}
