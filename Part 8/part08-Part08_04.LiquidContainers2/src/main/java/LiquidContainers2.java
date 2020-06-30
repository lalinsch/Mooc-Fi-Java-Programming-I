
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
                //creates the scanner and the two container objects 
        Scanner scan = new Scanner(System.in);
        Container containerA = new Container();
        Container containerB = new Container();

        while (true) {
            //loops until the input is "quit"
            System.out.println("First: " + containerA);
            System.out.println("Second: " + containerB);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            
            //otherwise it splits the input into a command string and an amount integer
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            int amount = Integer.valueOf(commandArray[1]);

            //if the command is add, uses the Object's add() method
            if (command.equals("add")) {
                containerA.add(amount);
                System.out.println("");
            }

            //uses the objects add and remove methods() depending on the conditions
            if (command.equals("move")) {
                if (containerA.contains() >= amount) {
                    containerA.remove(amount);
                    containerB.add(amount);
                } else if (containerA.contains() < amount){
                    containerB.add(containerA.contains());
                    containerA.remove(amount);
                }

                System.out.println("");
            }

            //removes the specified amount from a container
            if (command.equals("remove")) {
                containerB.remove(amount);
                System.out.println("");
            }

        }
    }

}
