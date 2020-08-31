package asteroids;

import java.util.Random;
import javafx.scene.shape.Polygon;

/**
 *
 * @author laloschjetnan
 */
public class PolygonFactory {

    //this class generates random sized pentagons, which are used by the asteroid class to create the asteroid objects
    //the formula is taken from WolframAlpha
    
    public Polygon createPolygon(){
        Random rand = new Random();
        
        double size = 10 + rand.nextInt(10);
        
        Polygon polygon = new Polygon();
        double c1 = Math.cos(Math.PI * 2 / 5);
        double c2 = Math.cos(Math.PI / 5);
        double s1 = Math.sin(Math.PI * 2 / 5);
        double s2 = Math.sin(Math.PI * 4 / 5);
        
        polygon.getPoints().addAll(
          size, 0.0,
          size * c1, -1 * size * s1,
          -1 * size * c2, -1 * size * s2,
          -1 * size * c2, size * s2,
          size * c1, size * s1);
        
        for(int i = 0; i < polygon.getPoints().size(); i++){
            int change = rand.nextInt(5) - 2;
            polygon.getPoints().set(i, polygon.getPoints().get(i) + change);
        }
        
        return polygon;
    }
}
