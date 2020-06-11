
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        //open scanner and point it to the text file
        try ( Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            //checks until the document reaches the end of the content 
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            //throws error in case the document is incompatible 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
