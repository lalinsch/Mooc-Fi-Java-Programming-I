package asteroids;

import java.util.Random;

/**
 *
 * @author laloschjetnan
 */
public class Asteroid extends Character {

    private double rotationalMovement;

    //this class uses the polygon factory to generate a new pentagon and specify its characteristics in the game
    //so that all of the asteroids are slightly different
    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);

        Random rand = new Random();

        super.getCharater().setRotate(rand.nextInt(360));

        int accelerationAmount = 1 + rand.nextInt(10);
        for (int i = 0; i < accelerationAmount; i++) {
            accelerate();
        }

        this.rotationalMovement = 0.5 - rand.nextDouble();
    }

    @Override
    public void move() {
        super.move();
        super.getCharater().setRotate(super.getCharater().getRotate() + rotationalMovement);
    }
}
