
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //checks which file the user wants to load
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        
        //opens the file based on input, creates new scanner to read the file
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            //reads the documents nad prints out each line until it reaches the end
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
