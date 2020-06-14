
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        

        // Experiment with your program here
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(7);
        System.out.println(salt.volume());
        System.out.println(salt);
        
        Cube c = new Cube(7);
        System.out.println(c.toString());
    }
}
