
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        ArrayList<Book> bookList = new ArrayList<>();
        try{
            //reads the file based on the parameter 'file'
            Files.lines(Paths.get(file))
            //on each row, divides the string into string array by dividing with the comma
            .map(row -> row.split(","))
            //makes a filter to make sure all the rows contain 4 parts
            .filter(parts -> parts.length >= 4)
            //using the string aray, it creates a new book from each row using the book constructor and 
            //the respective parts of the string array
            .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
            //finally it adds one of the newly created books to the arraylist
            .forEach(book -> bookList.add(book));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return bookList;
    }

}
