
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int positiveNumbers = 0;
        double average = 0.0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0){
                if(positiveNumbers == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                average = 1.0 * sum / positiveNumbers;
                System.out.println(average);
                break;
            }
            
            if (input > 0){
                sum += input;
                positiveNumbers++;
            }
        }
    }
}
