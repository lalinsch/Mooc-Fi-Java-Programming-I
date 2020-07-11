
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // test the method here

    }
    
    //Reads a file specified from the parameter 
    public static List<String> read(String file){
        ArrayList <String> rows = new ArrayList<>(); //starts a new arraylist object
        try{
           Files.lines(Paths.get(file)).forEach(row -> rows.add(row)); 
            //uses the Files stream method to add each line from the document on the array list
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rows; //returns the final arraylist
    }

}
