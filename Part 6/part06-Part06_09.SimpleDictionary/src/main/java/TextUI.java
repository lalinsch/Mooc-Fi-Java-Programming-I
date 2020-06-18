
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    //constructor
    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    //main method, contains the flow of the application
    public void start() {

        while (true) {
            System.out.println("");
            System.out.print("Command:");
            String command = scan.nextLine();

            //program loops until the user enters the command "end"
            if (command.toLowerCase().equals("end")) {
                System.out.println("Bye bye!");
                break;

                //if the user inputs "add" it takes the word and translation input and uses
                // the dictionary method add to store it
            } else if (command.toLowerCase().equals("add")) {
                System.out.print("Word: ");
                String newWord = scan.nextLine();
                System.out.print("Translation: ");
                String newTranslation = scan.nextLine();
                dictionary.add(newWord, newTranslation);

                //if user inputs search, it asks for what word and then
                //prints the result
            } else if (command.toLowerCase().equals("search")) {
                System.out.print("To be translated:");
                String query = scan.nextLine();
                System.out.println(dictionary.translate(query));
                System.out.println("");

                //otherwise it asks theh user to enter a new command
            } else {
                System.out.println("Unknown command");
            }
        }

    }

}
