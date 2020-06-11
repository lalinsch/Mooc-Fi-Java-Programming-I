
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("")){
            String[] words = input.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
            input = scanner.nextLine();
        }
       
    }

}
