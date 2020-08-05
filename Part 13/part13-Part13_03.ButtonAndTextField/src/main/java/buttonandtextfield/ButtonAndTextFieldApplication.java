package buttonandtextfield;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("This is a button");
        TextField textField = new TextField("This is a test field");
        
        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(textField);
        
        Scene scene = new Scene(components);
        
        window.setScene(scene);
        window.show();
        
    }
    
    

}
