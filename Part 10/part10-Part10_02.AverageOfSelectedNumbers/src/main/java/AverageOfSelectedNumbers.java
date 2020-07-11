
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type end to stop:");
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            inputList.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        while (true){
            if(command.equals("n") || command.equals("p")){
                System.out.println("Not a valid answer, select n or p");
            }
            if(command.equals("p")){
                double averageOfPositive  = inputList.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(num -> num > 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of positive numbers: " + averageOfPositive);
                break;
            }
            
            if(command.equals("n")){
                double averageOfNegative = inputList.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(num -> num < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of negative numbers: " + averageOfNegative);
                break;
                        
            }
        }

    }
}
