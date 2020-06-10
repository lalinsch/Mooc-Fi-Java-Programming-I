
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean isInFile = false; //boolean to specify if the input was found within a document
        
        //creates filereader scanner and points it to the specified file
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String name = fileReader.nextLine();
                if(name.equals(searchedFor)){
                    isInFile = true; //switches boolean to true
                } 
            }
            //conditional statements depending on the state of the boolean
            if (isInFile){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
            
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed");
        }

    }
}
