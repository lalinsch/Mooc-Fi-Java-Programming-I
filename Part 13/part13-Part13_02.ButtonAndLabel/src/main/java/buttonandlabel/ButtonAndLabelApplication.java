package buttonandlabel;

//For this application make sure the imports are correct, otherwise you will have compile errors
//If you are having trouble loading javafx, make sure to follow the steps in https://ohjelmointi-20.mooc.fi/javafx-ohjeet
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        //objects are created first, with the text in the constructor
        Button button = new Button("Testing your buttons");
        Label label = new Label ("Testing your labels as well");
        
        //then the scene is populated with our objects (in order)
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(label);
        
        //finally the scene gets added to the application window
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
        
    }

}
