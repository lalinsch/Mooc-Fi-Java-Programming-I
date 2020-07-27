
import java.util.Scanner;

public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int s = 0; // initiates our sum variable

        //if the fromWhere index is smaller than 0, it sets it to 0
        if (fromWhere < 0) {
            fromWhere = 0;
        }

        //if the toWhere index is larger than the highest index in the array, it sets it to the last element of the array
        if (toWhere > array.length) {
            toWhere = array.length - 1;
        }

        //goes through every element in the array and checks if it falls between the range between smallest - largest
        //if it does then it adds it to our sum "s" variable
        for (int i = 0; i < array.length; i++) {
            if (i >= fromWhere && i <= toWhere) {
                if (array[i] >= smallest && array[i] <= largest) {
                    s += array[i];
                }
            }

        }
        //returns the s (sum) variable
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

}
