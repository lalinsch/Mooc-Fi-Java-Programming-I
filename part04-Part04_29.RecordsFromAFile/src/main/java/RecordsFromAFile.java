
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        //creates scanner to read from specified file
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] data = line.split(","); //splits comma separated values
                
                //conditions depending on the value of the age for formatting
                if(Integer.valueOf(data[1]) == 1){
                    System.out.println(data[0] + ", age: " +  data[1] + " year"); 
                } else{
                    System.out.println(data[0] + ", age: " +  data[1] + " years");
                }
            }
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
