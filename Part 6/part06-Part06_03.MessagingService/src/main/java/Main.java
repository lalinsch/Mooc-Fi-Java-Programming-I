
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        //test code
        Scanner scan = new Scanner(System.in);
        System.out.println("Sender?");
        String sender = scan.nextLine();
        System.out.println("Message? (Max 280 characters)");
        String msg = scan.nextLine();
        
        Message test = new Message(sender, msg);
        
        MessagingService sending = new MessagingService();
        
        sending.add(test);
        System.out.println(sending.getMessages());
    }
}
