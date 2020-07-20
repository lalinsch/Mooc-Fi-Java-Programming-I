
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String test = "av";
       
        while (!input.isEmpty()){
            String[] words = input.split(" ");
            for (int i = 0; i < words.length; i++){
                if (words[i].contains(test)){
                    System.out.println(words[i]);
                }
            }
            input = scanner.nextLine();
        }
       

    }
}
