
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
public class Stack {
    
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList();
    }
    
    //checks is the arraylist is empty
    public boolean isEmpty(){
        if (this.list.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    
    //adds the passed string on to the arraylist
    public void add(String value){
        this.list.add(value);
    }
    
    //returns a new arraylist with all the added values
    public ArrayList<String> values(){
        return this.list;
    }
    
    //takes the last item from the list and returns its value
    public String take(){
        String last = this.list.get(this.list.size()-1);
        this.list.remove(last);
        return last;
    }
    
    
}
