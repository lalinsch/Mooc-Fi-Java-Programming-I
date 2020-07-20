
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */

//UI Class instance variables
public class UserInterface {
    private Scanner scan;
    private BirdDatabase birdList;
    
    //constructor, takes a scanner as parameter and starts a new BirdDatabase
    public UserInterface(Scanner scan){
        this.scan = scan;
        this.birdList = new BirdDatabase();
    }
    
    //main method of interacting with the program
    public void start(){
        //starts a while loop until the user enters "Quit"
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                break;
            }
            
            //using the methods in BirdDatabase and Bird, we can create a bird from the users input
            if (command.equals("Add")){
                System.out.print("Name: ");
                String birdName = scan.nextLine();
                System.out.print ("Name in Latin: ");
                String latinName = scan.nextLine();
                this.birdList.add(new Bird(birdName, latinName));
            }
            
            //The program finds a bird based on the name in the input, if it exists, increases the observation count
            //otherwise prints an error message to the user
            if (command.equals("Observation")){
                System.out.print("Bird? ");
                String query = scan.nextLine();
                if(this.birdList.birdExists(query)){
                    Bird b = this.birdList.getBird(query);
                    b.addObservation();
                }
                else {
                    System.out.println("Not a bird!");
                }
            }
            
            //Prints all birds with the specified format
            if (command.equals("All")){
                this.birdList.printAllBirds();
            }
            
            //Finds a bird based on the name the user inputs, if its found, prints the bird
            //otherwise it shows an error to the user
            if (command.equals("One")){
                System.out.print("Bird? ");
                String query = scan.nextLine();
                if(this.birdList.birdExists(query)){
                    Bird b = this.birdList.getBird(query);
                    System.out.println(b);
                }else{
                    System.out.println("Not a bird!");
                }
            }
        }
    }

}
