
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
//      with this search we make a for loop that goes through each element in the list
//      and checks if the IDs match, when theres a match, it returns the index if that ID
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
//      if the value can't be found, return -1
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
//       for a binary search we specifiy the boundaries of the search beased on the size of the list 
        int begin = 0;
        int end = books.size() - 1;

//      while loop that checks if the end value is still higher than the begin
        while (end >= begin) {
            //sets the middle value by adding the two elements and divides by 2
            int middle = (begin + end) / 2;

//          if the Id of the book in the 'middle' index matches the search ID, 
//          it returns the value of middle
            if (books.get(middle).getId() == searchedId) {
                return middle;
            } 
            
//          otherwise, if the value of middle was smaller than the ID, the value of begin
//          increses by one to the next value from middle to set a new range
            else if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;

//          finally, if the value is larger than the id, then the end value gets modified
//          by substracting 1 and setting a new range
            } else if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
        }
        //if the value can't be found, returns -1
        return -1;
    }

}
