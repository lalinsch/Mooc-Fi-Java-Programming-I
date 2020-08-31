package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

/**
 *
 * @author laloschjetnan
 */
public abstract class Character {

    //this class is used for asteroids, projectiles and the ship
    private Polygon character;
    private Point2D movement;
    private boolean isAlive;

    //constructor, uses the polygon class
    public Character(Polygon polygon, int x, int y) {
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        
        //this track the status of each item on screen
        this.isAlive = true;

        this.movement = new Point2D(0, 0);
    }
    
    //this method can change the status of a character from alive-dead or viceversa
    public void setAlive(boolean isAlive){
        this.isAlive = isAlive;
    }
     
    public boolean isAlive(){
        return this.isAlive;
    }

    //returns the polygon (useful for adding it to the pane)
    public Polygon getCharater() {
        return this.character;
    }

    public Point2D getMovement() {
        return this.movement;
    }

    public void setMovement(Point2D newPoint) {
        this.movement = newPoint;
    }

    //changes the rotation of the character by 5 degrees counterclockwise
    public void turnLeft() {
        this.character.setRotate(this.character.getRotate() - 5);
    }

    //rotates the character 5 degrees clockwise
    public void turnRight() {
        this.character.setRotate(this.character.getRotate() + 5);
    }

    //this method moves the characters continuously through the pane
    public void move() {
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());

        //these conditional methods makes sure the characters stay within the frame of the game (width, height)
        if (this.character.getTranslateX() < 0) {
            this.character.setTranslateX(this.character.getTranslateX() + AsteroidsApplication.WIDTH);
        }
        
        if (this.character.getTranslateX() > AsteroidsApplication.WIDTH) {
            this.character.setTranslateX(this.character.getTranslateX() % AsteroidsApplication.WIDTH);
        }

        if (this.character.getTranslateY() < 0) {
            this.character.setTranslateY(this.character.getTranslateY() + AsteroidsApplication.HEIGHT);
        }

        if (this.character.getTranslateY() > AsteroidsApplication.HEIGHT) {
            this.character.setTranslateY(this.character.getTranslateY() % AsteroidsApplication.HEIGHT);
        }
    }

    //specifies the speed of the character
    public void accelerate() {
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));

        changeX *= 0.05;
        changeY *= 0.05;

        this.movement = this.movement.add(changeX, changeY);
    }

    //this method checks if a character has collided with another character using the Shape.interesect method
    public boolean collision(Character other) {
        Shape collisionArea = Shape.intersect(this.getCharater(), other.getCharater());
        return collisionArea.getBoundsInLocal().getWidth() != -1;
    }
}
