package FlightControl;

import java.util.Scanner;
import logic.FlightControl;
import ui.TextUI;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scan = new Scanner(System.in);
        FlightControl fc = new FlightControl();
        TextUI userInterface = new TextUI(scan, fc);
        
        //starts the execution of the program's UI and logic
        userInterface.start();
    }
}
