
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList();

        //loop to ask for input until an empty string is entered
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            //constructs an Archive object based on the input
            Archive item = new Archive(id, name);
            
            //checks if the ID of the input already exists on our Archive list, 
            //if it doesn't it adds it to the list
            if(!(list.contains(item))){
                list.add(item);
            } 
        }
        
        //Prints out each item based on the toString method 
        System.out.println("==Items==");
        for(Archive item : list){
            System.out.println(item);
        }

    }
}
