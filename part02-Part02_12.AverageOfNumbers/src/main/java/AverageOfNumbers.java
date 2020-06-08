
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        double average = 0.0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                numbers++;
                sum += input;
            }

        }
        average = (1.0 * sum) / numbers;
        System.out.println("Average of the numbers: " + average);

    }
}
