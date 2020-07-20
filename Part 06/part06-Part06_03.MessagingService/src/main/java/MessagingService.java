
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
public class MessagingService {
    
    private ArrayList<Message> messageList;
    
    //constructor creates a new arraylist with the message object parameter
    public MessagingService(){
        this.messageList = new ArrayList();
    }
    
    //if the message is 280 chars or smaller, it gets added to the messaging service
    public void add (Message message){
        if(message.getContent().length() <= 280){
            this.messageList.add(message);
        }
    }
    
    //returns all the messages that have been added 
    public ArrayList<Message> getMessages(){
        return this.messageList;
    }
    
    
}
