
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        
        System.out.println("Enter numbers:");
        int input = Integer.valueOf(scanner.nextLine());
        Statistics stats = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
  
        
        while (input != -1){
            
            if(input % 2 == 0){
                even.addNumber(input);
            } else if(input %2 != 0){
                odd.addNumber(input);
            }
            
            stats.addNumber(input);
            input = Integer.valueOf(scanner.nextLine());
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        System.out.println("Average: " + stats.average());

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
