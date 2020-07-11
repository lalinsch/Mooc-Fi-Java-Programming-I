
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        //UI, takes input from user and adds it to an ArrayList of the Book type
        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            String inputTitle = scanner.nextLine();
            
            if(inputTitle.isEmpty()){
                break;
            }
            
            System.out.print("Input the age recommendation: ");
           int inputRecommendedAge = Integer.valueOf(scanner.nextLine());
           
           books.add(new Book(inputTitle, inputRecommendedAge));
        }
        
        System.out.println("");
        System.out.println(books.size() + " books in total."); //prints out the total number of books
        System.out.println("");
        
        //Uses a comparator to call the methods from our Book class
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedAge) //it compares the books by age first
                .thenComparing(Book::getTitle); //and then by title alphabetically
        
        System.out.println("Books: ");
        Collections.sort(books, comparator); //sorting gets applied
        books.stream().forEach(book -> System.out.println(book)); //prints all the books in the new order

    }

}
