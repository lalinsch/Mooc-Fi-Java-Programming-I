
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class UserInterface {
   private JokeManager jokeManager;
   private Scanner scanner;
   
   public UserInterface(JokeManager jokeManager, Scanner scanner){
       this.jokeManager = jokeManager;
       this.scanner = scanner;
   }
   
   public void start(){
       while (true) {
           //shows the available commands
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            //ends the program
            if (command.equals("X")) {
                break;
            }
            
            //calls the addJoke method from the joke manager and pasess the user string
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
                
            //calls the drawJoke method and prints out a random joke
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokeManager.drawJoke());
                
            //calls the printJokes method and prints all the jokes
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
   }

}
