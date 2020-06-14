
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals(Object compared){
        
        //if the two objects are exactly the same, return true 
        if(this == compared){
            return true;
        }
        
        //if the compared object isn't a person object, return false
        if(!(compared instanceof Person)){
            return false;
        }
        
        //convert the compared object into a person object for comparison
        Person comparedPerson = (Person) compared;
        
        //if everything matches, return true
        if(this.birthday.equals(comparedPerson.birthday)
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight
                && this.name.equals(comparedPerson.name)){
            return true;
        }
        
        //otherwise return false
        else{
            return false;
        }
    }
}
