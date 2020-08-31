package asteroids;

import javafx.scene.shape.Polygon;

/**
 *
 * @author laloschjetnan
 */
public class Projectile extends Character {

    //creates a rectangle polygon that represents the proejctiles that the ship fires
    public Projectile(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
    }
}
