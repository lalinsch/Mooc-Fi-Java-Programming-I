
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    //uses stream to return the values fron the arraylist that follow the required conditions
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream() //starts the stream 
                .filter(i -> (i % 2 == 0) || (i%3 == 0) || (i % 5 == 0)) //filters values that are divisible by 2, 3 and 5
                .collect(Collectors.toCollection(ArrayList::new)); //returns the values as a new arraylist
    }

}
