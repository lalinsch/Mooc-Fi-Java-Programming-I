package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    //sets the static variables for width and height of the game
    public static int WIDTH = 600;
    public static int HEIGHT = 400;

    public static void main(String[] args) {
        launch(args);
    }

    
    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

    @Override
    public void start(Stage stage) throws Exception {
        //creates the main elements that will be contained in the scene
        Pane pane = new Pane();
        Text text = new Text(10, 20, "Points: 0");
        Text gameOverText = new Text(WIDTH/2, HEIGHT/2, "");
        AudioClip lasers = new AudioClip("file:lasers.mp3");
        AudioClip explosion = new AudioClip("file:explosion.mp3");
        AudioClip end = new AudioClip("file:end.mp3");
        pane.getChildren().addAll(text, gameOverText);

        AtomicInteger points = new AtomicInteger();
        pane.setPrefSize(WIDTH, HEIGHT);

        //creates the ship using the Ship class - which extends the character class
        Ship ship = new Ship(WIDTH / 2, HEIGHT / 2);
        //creates the projectiles 
        List<Character> projectiles = new ArrayList<>();

        //creates the initial 5 asteroids with random dimensions 
        List<Character> asteroids = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            Asteroid asteroid = new Asteroid(rand.nextInt(100), rand.nextInt(100));
            asteroids.add(asteroid);
        }

        //adds the characters to the initial scene
        pane.getChildren().add(ship.getCharater());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharater()));

        Scene scene = new Scene(pane);

        //creates a map to track the key presses 
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        //sets a boolean value for the keys that will be tracking the press of keys and their state to invoke
        //different actions in the game
        scene.setOnKeyPressed((event) -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        scene.setOnKeyReleased((event) -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        //this is where the main interaction of the game and its events will happen
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                //if the left arrow key has been pressed, the ship moves to the left
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }

                //same thing fo the right arrow key
                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }

                //when the up arrow key gets pressed, the ship accelerates (look at character class)
                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }

                //when the space bar is pressed, projectiles are created and positioned at the smae place as the
                //ship, there can only be a maximum of 2 projectiles at one time
                if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3) {
                    //shoots projectile
                    Projectile projectile = new Projectile((int) ship.getCharater().getTranslateX(), (int) ship.getCharater().getTranslateY());
                    projectile.getCharater().setRotate(ship.getCharater().getRotate());
                    projectiles.add(projectile);

                    //once the projectiles are created, this modifies how they behave and then they get added to the pane view
                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));
                    lasers.play();
                    pane.getChildren().add(projectile.getCharater());
                }

                //makes all of the characters in the scene move continuously 
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());

                //the following code checks if a projectile has collided with an asteroid and sets both characters as
                //dead, 
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (projectile.collision(asteroid)) {
                            explosion.play();
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                        }
                    });

                    //this increments the points earned after each asteroid gets killed
                    if (!projectile.isAlive()) {
                        text.setText("Points: " + points.addAndGet(1000));
                    }
                });

                //these methods check which characters have been killed and removes them from the pane
                kill(projectiles);
                kill(asteroids);

                //this adds new asteroids at a random pace (with 5% probability), making sure the asteroids
                //don't collide with the ship the moment they get added 
                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if (!asteroid.collision(ship)) {
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharater());
                    }
                }

                //This ends the game if the ship collides with an asteroid
                asteroids.forEach(asteroid -> {
                    if (ship.collision(asteroid)) {
                        end.play();
                        gameOverText.setText("DEADEN");
                        stop();
                    }
                });
            }

            //this method checks a list of characters (projectiles or asteroids) and filters them by which ones 
            //have been killed, once they are filtered they get removed from their respective lists
            public void kill(List<Character> characters) {
                characters.stream()
                        .filter(character -> !character.isAlive())
                        .forEach(character -> pane.getChildren().remove(character.getCharater()));
                characters.removeAll(characters.stream()
                        .filter(character -> !character.isAlive())
                        .collect(Collectors.toList())
                );
            }

        }.start();

        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();

    }

}
