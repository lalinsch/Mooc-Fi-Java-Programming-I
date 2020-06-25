
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);

    }

    //loops through each int in the array and returns the smallest 
    public static int smallest(int[] array) {
        int smallest = array[0]; //sets the "smallest" variable to the first element
        for (int i = 0; i < array.length; i++){ //loops through every element in the array
            if(array[i] < smallest){ //compares the value of both ints and if its smaller
                smallest = array[i]; //it assigns the new smaller value to the smallest variable
            }
        }
        return smallest;
    }

    //follows the same logic as the method above but it returns the index instead of the value
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0; //sets the origin index at 0
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i; //once a smaller value, it sets the variable value to the index
            }
        }
        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) { //the loop starts at startIndex instead of 0
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) { 
        //takes two ints from the array based on the index1 and index2 variables and swaps the
        //value to the other one
        int first = array[index1];
        int second = array[index2];

        array[index1] = second;
        array[index2] = first;
    }
    
    public static void sort(int[] array){
        //loops through the whole array
        for(int i = 0; i < array.length; i++){
            //utilises the swap and indexOfSmallestFrom methods to go through each element and organise the values one by one
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array)); //prints each step of the organisation
        }
    }

}
