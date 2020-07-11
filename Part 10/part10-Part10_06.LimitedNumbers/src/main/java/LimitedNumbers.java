
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input < 0){
                break;
            }
            nums.add(input);
        }
        
        //creates new arraylist using a stream that filters values in the nums arraylist that are between 1 and 5
        ArrayList<Integer> numsBetweenOneAndFive = nums.stream()
                .filter(i -> (i >= 1) && (i <= 5))
                .collect(Collectors.toCollection(ArrayList::new));
        
        //then uses the forEach expression on the new arraylsit to print out each item on a new line
        numsBetweenOneAndFive.stream()
                .forEach(i -> System.out.println(i));
                

    }
}
