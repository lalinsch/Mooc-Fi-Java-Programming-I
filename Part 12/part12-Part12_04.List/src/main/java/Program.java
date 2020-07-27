
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }

    }

}
