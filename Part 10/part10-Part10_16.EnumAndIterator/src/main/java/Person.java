/**
 *
 * @author laloschjetnan
 */
public class Person {
    //Instance variables
    private String name;
    private Education level;
    
    //Person constructor
    public Person(String name, Education level){
        this.name = name;
        this.level = level;
    }
    
    //returns a persons education level
    public Education getEducation(){
        return this.level;
    }
    
    //sets how a person should be printed to the console
    @Override
    public String toString(){
        return this.name + ", " + this.level;
    }
    
}
