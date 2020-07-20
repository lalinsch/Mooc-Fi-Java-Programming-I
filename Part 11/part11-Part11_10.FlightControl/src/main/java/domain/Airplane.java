package domain;
/**
 *
 * @author laloschjetnan
 */
public class Airplane {
    private String ID;
    private int capacity;
    
    //plane constructor
    public Airplane(String ID, int capacity){
        this.ID = ID;
        this.capacity = capacity;
    }
    
    //returns the ID of a plane
    public String getID(){
        return this.ID;
    }
    
    //specifies how the plane object should be printed when called by the console
    @Override
    public String toString(){
        return this.ID + " (" + this.capacity + " capacity)";
    }

}
