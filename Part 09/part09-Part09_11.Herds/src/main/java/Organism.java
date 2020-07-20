/**
 *
 * @author laloschjetnan
 */
public class Organism implements Movable{
    
    //class instance variables
    private int x;
    private int y;
    
    //constructor
    public Organism (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //represents how an organism should be printed to the console
    @Override
    public String toString(){
        return "x: " + this.x + "; y: " + this.y;
    }
    
    //changes the values of the coordinates 
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

}
