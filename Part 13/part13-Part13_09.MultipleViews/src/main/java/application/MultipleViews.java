package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //elements of the first view
        BorderPane borderPane = new BorderPane();
        Label firstText = new Label("First view!");
        Button firstButtonNext = new Button("To the second view!");
        //building the first view
        borderPane.setTop(firstText);
        borderPane.setCenter(firstButtonNext);
        
        //elements of the second view
        VBox vBox = new VBox();
        Button secondButtonNext = new Button("To the third view!");
        Label secondText = new Label("Second view!");
        //building the second view
        vBox.getChildren().addAll(secondButtonNext, secondText);
        
        //elements of the third view
        GridPane gridPane = new GridPane();
        Button thirdButtonNext = new Button("To the first view!");
        Label thirdText = new Label("Third View");
        //building the third view
        gridPane.add(thirdText, 0, 0);
        gridPane.add(thirdButtonNext, 1, 1);
        
        //sets the three scenes
        Scene first = new Scene(borderPane);
        Scene second = new Scene(vBox);
        Scene third = new Scene(gridPane);
        
        //adds the actions to the buttons
        firstButtonNext.setOnAction((event) -> {
            stage.setScene(second);
        });
        
        secondButtonNext.setOnAction((event) -> {
            stage.setScene(third);
        });
        
        thirdButtonNext.setOnAction((event) -> {
            stage.setScene(first);
        });
        
        //sets the default behaviour when the application is launched 
        stage.setScene(first);
        stage.show();
    }

}
