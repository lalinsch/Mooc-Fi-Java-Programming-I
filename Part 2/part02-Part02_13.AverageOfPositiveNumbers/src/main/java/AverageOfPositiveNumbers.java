
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posNums = 0;
        int sum = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0){
                break;
            }
            
            if (input > 0){
                posNums++;
                sum += input;
            }
            
        }
        double average = (1.0 * sum)/posNums;
        if (posNums <= 0){
            System.out.println("Cannot calcualte average");
        } else {
            System.out.println(average);
        }

    }
}
