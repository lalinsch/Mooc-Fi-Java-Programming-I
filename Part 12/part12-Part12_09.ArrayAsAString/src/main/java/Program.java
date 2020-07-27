

public class Program {

    public static String arrayAsString(int[][] array) {
        StringBuilder sb = new StringBuilder(); //Starts the string builder object

        //first for loop, goes through each array inside the array 
        for (int row = 0; row < array.length; row++) { //first for loop

            //in the nested for loop we iterate through the data of each nested array
            for (int column = 0; column < array[row].length; column++) {
                int element = array[row][column];
                sb.append(element); //adds each individual element to the stringbuilder
            }

            //once it adds all the elements from each array, it adds a space before it goes to the next row
            if (row < array.length - 1) {
                sb.append("\n");
            }
        }

        //returns the completed string from stringbuilder
        return sb.toString();
    }
    

    public static void main(String[] args) {
        int[][] matrix = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        System.out.println(arrayAsString(matrix));
    }
}
