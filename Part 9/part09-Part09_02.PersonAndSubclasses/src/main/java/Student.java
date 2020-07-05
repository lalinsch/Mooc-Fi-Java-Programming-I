/**
 *
 * @author laloschjetnan
 */

//student is a subclass of person with it's private instance variable for study credits
public class Student extends Person{
    
    private int credits;
    
    //the constroctures takes the same form as the Person but also inititates the credits variable
    //note: the super variables have to be first in the constructor
    public Student(String name, String address){
        super(name, address);
        this.credits = 0;
    }
    
    //returns the current credit amount
    public int credits(){
        return this.credits;
    }
    
    //increases the credits count by one
    public void study(){
        this.credits++;
    }
    
    //inherits the superclass toString method and overwrites it to include the credits
    @Override
    public String toString(){
        return super.toString() + "\n  Study credits " + this.credits;
    }

}
