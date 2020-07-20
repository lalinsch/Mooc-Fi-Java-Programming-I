
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UI userInterface = new UI(scanner);

        //starts the program
        userInterface.start();
        scanner.close();
    }
}
