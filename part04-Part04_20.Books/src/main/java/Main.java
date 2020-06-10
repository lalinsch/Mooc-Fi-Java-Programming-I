import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();
        
        
        //while loop that gets input from user and adds it on to our books List
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        //ask user if they want only the name or everything
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        //for loop that executes a print statement based on the users input
        for(Book book : books){
            if(info.equals("name")){
                System.out.println(book.getTitle());
            } else if(info.equals("everything")){
                //prints the book class' toString method 
                System.out.println(book);
            }
        }

    }
}
