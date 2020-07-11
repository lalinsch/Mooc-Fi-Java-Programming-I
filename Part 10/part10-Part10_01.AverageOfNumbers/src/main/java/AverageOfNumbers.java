
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfNumbers = new ArrayList<>();
        // Write your program here
        
        System.out.println("Input numbers, type end to stop:");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            listOfNumbers.add(input);
        }
        
        double average = listOfNumbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("Average of numbers: " + average);

    }
}
