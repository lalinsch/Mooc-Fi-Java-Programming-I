
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        
        //initialises filereader scanner pointing to specified file 
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){ //checks documents until the end
                String line = fileReader.nextLine();
                String [] person = line.split(","); //creates string array by separating values with ","
                persons.add(new Person(person[0], Integer.valueOf(person[1]))); //creates a new Person object with the string array
            }
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return persons;

    }
}
