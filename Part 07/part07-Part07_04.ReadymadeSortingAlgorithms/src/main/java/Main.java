
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
    }
    
    //utilises the Java built in sort method for the data type Array 
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    //same behaviour but for String arrays instead of int
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    //takes an Integer array list and uses the built in collections sort method
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    //takes an String array list and uses the built in collections sort method
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
