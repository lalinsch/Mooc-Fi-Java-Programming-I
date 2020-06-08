
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        double average = 0.0;
        int sum = 0;
        int longest = 0;
        String longestName = "";
        
        while(!input.isEmpty()){
            String[] data = input.split(",");
            
            if(data[0].length() > longest){
                longest = data[0].length();
                longestName = data[0];
            }
            sum += Integer.valueOf(data[1]);
            count++;
            input = scanner.nextLine();
        }
        average = 1.0 * sum/count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years:  " + average);
        
    }
}
