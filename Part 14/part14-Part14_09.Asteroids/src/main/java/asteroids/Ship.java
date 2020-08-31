package asteroids;

import javafx.scene.shape.Polygon;

/**
 *
 * @author laloschjetnan
 */
public class Ship extends Character{
    
    public Ship(int x, int y){
        //creates a triangle shaped character based off the character class and positions it in the middle of the pane
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);
    }
}
