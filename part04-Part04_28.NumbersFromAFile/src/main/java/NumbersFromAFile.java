
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0; //initialises the count of elements
        
        //opens the specified file using a new scanner
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            //reads the whole file until it reaches the end
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                //condition to make sure the elements are only counted within the specified boundaries
                if (Integer.valueOf(row) >= lowerBound && Integer.valueOf(row) <= upperBound){
                    count++; //increments the count for each valid entry
                }
            }
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
        
        System.out.println("Numbers: " + count); // prints the total count

    }

}
