
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //first instance of scanner
        System.out.println("Name: ");
        String input = scanner.nextLine();
        
        //checks if input is empty, if it is, the programme ends.
        while (!input.isEmpty()){
            //adds new user added objects to the items list.
            System.out.println("Name: ");
            items.add(new Item(input));
            
            input = scanner.nextLine();
        }
        
        //when loop ends, print the items on the list with the toString functionality
        for(Item item : items){
            System.out.println(item);
        }

    }
}
