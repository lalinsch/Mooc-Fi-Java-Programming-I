package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class HurraaSovellus extends Application{

    //For this app to work properly, it's important you configure the POM file to work with java-fx controls and media
    //I have commented the lines on the POM file for you to copy
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        //I'm using different audio clip to the one provided, since it seems the file was corrupt
        //creates the audioclip object based on the file 
        AudioClip sound = new AudioClip("file:sound.mp3");
        //adds the function to the button so it plays the audio when it detects a click
        nappi.setOnMouseClicked((event) -> {
            sound.play();
        });
        
        pane.setCenter(nappi);
        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
