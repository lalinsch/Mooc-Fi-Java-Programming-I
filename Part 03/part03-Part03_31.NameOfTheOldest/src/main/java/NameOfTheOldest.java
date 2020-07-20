
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String nameOfOldest = "";
        int oldest = 0;
        
        while(!input.isEmpty()){
            String[] words = input.split(",");
            if (Integer.valueOf(words[1]) > oldest){
                oldest = Integer.valueOf(words[1]);
                nameOfOldest = words[0];
            }
            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
