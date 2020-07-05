/**
 *
 * @author laloschjetnan
 */

//person is the superclass with the name and address instance variables
public class Person {
    private String name;
    private String address;
    
    
    //person constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    //specifies how a person should be printed when it's called as a string
    @Override
    public String toString(){
        return this.name + "\n  " + this.address;
    }

}
