package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("NORTH"));
        borderPane.setLeft(new Label("WEST"));
        borderPane.setBottom(new Label("SOUTH"));
        borderPane.setRight(new Label("EAST"));
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
        
    }

}
