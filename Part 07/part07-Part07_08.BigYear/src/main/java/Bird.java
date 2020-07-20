/**
 *
 * @author laloschjetnan
 */

//We declare the bird object class and its instance variables
public class Bird {
    private String name;
    private String latinName;
    private int watchCount;
    
    //Bird constructor, starts the watch count at 0
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.watchCount = 0;
    }
   
    //returns the name of the bird as a string
    public String getName(){
        return this.name;
    }
    
    //increases the observation count by one
    public void addObservation(){
        this.watchCount++;
    }
    
    //specifies how the object should print to the console
    @Override
    public String toString(){
        if(this.watchCount == 1){
            return this.name + " (" + this.latinName + "): " + this.watchCount + " observation";
        }
        return this.name + " (" + this.latinName + "): " + this.watchCount + " observations";
    }
    
    
}
