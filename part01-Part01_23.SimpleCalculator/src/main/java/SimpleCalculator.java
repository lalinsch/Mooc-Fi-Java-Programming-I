
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int addition = first+second;
        int substraction = first - second;
        int multiplication = first * second;
        double division = 1.0 * first/second;
        System.out.println(first + " + " + second + " = " + addition);
        System.out.println(first + " - " + second + " = " + substraction);
        System.out.println(first + " * " + second + " = " + multiplication);
        System.out.println(first + " / " + second + " = " + division);
        
        

    }
}
