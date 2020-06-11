
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //while loop to ask for input until the first name is empty
        while(true){
            System.out.println("First name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            
            //adds the input information to the infoCollection list passing the paramters
            infoCollection.add(new PersonalInformation(name, lastName, id));
        }
        
        //for loop to print out the personal data from the PersonalInformation objects
        for (PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
        
        

    }
}
