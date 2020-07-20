
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //test code
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();

    }
}
