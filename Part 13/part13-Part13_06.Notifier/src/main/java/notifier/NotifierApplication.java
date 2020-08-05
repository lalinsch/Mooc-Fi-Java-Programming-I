package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField text = new TextField("");
        Button button = new Button("Update");
        Label label = new Label("");
        
        //in order for the following lambda expression to work, you have to specify version 1.8 of the
        //maven compiler https://stackoverflow.com/questions/32923586/maven-lambda-expressions-are-not-supported-in-source-1-5
        
        button.setOnAction((event) -> {
            label.setText(text.getText()); //sets the label text to whatever the text is on the text field
        });
       
        
        VBox layout = new VBox();
        layout.getChildren().addAll(text, button, label);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
    }

}
