
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int number = 0;
        double average = 0;
        int evenNums = 0;
        int oddNums = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                evenNums++;
            }

            if (input % 2 != 0) {
                oddNums++;
            }

            sum += input;
            number++;
        }
        average = (1.0 * sum) / number;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + number);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);
    }
}
