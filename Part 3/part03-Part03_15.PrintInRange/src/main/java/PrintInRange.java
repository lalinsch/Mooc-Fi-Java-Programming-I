
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> testList = new ArrayList();
        testList.add(4);
        testList.add(10);
        testList.add(12);
        testList.add(5);
        
        printNumbersInRange(testList, 5, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int number: numbers){
            if(number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }
    }
    
}
