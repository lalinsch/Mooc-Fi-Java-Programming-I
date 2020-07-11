
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            inputs.add(input);
        }
        
        //uses stream to join all of the strings on the arraylist together and prints out to the console
        String allInputs = inputs.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(allInputs);

    }
}
