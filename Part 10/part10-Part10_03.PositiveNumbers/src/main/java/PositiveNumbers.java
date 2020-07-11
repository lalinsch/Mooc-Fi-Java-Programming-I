
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test code
        ArrayList<Integer> nums = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            nums.add(input);
        }
        
        System.out.println(positive(nums));
        

    }
    
    //uses a stream to return the positive values from a given list
    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream() //starts the stream
                .filter(n -> n > 0) //filters any value (integer) that is larger than zero
                .collect(Collectors.toList()); //returns the stream as a new list
    }

}
