
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while(!input.isEmpty()){
            String[] words = input.split(" ");
            System.out.println(words[words.length-1]);
            input = scanner.nextLine();
        }

    }
}
