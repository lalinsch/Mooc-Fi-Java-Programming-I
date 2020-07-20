/**
 *
 * @author laloschjetnan
 */
public class Gift {

    //Gift class' instance variables
    private String name;
    private int weight;
    
    //Gift constructor
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    //getters
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.getName() + " (" + this.getWeight() +" kg)";
    }
}
