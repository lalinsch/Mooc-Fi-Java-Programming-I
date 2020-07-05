
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Herd implements Movable{
    //instance variable, a list of movable objects
    private ArrayList<Movable> list;

    //consturctor, initiates our list
    public Herd(){
        this.list = new ArrayList<>();
    }
    
    //adds an object of the movable type to the list
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }
    
    
    //since the class implements the movable interface, it has to use this method
    //in this case it changes the coordinates of all objects in the list
    public void move(int dx, int dy){
        for(Movable m : list){
            m.move(dx, dy);
        }
    }
    
    //prints every movable object in the list
    @Override
    public String toString(){
        String s = "";
        for(Movable m : list){
            s = s + m.toString() + "\n";
        }
        return s;
    }

}
