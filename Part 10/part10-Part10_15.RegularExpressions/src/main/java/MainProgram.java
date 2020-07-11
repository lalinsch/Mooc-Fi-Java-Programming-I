
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Day of week");
        String input = scanner.nextLine();
        
        if(checker.isDayOfWeek(input)){
            System.out.println("Yay");
        }
        
        System.out.println("Vowells");
        input = scanner.nextLine();
        if (checker.allVowels(input)){
            System.out.println("Yay");
        }
        System.out.println("time of day");
        input = scanner.nextLine();
        if (checker.timeOfDay(input)){
            System.out.println("yay");
        }
    }
}
