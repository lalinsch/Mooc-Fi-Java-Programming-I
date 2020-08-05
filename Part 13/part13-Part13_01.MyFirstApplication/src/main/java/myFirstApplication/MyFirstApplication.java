package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;


public class MyFirstApplication extends Application{
    
    public void start(Stage window){
        window.setTitle("My first application");
        window.show();
    }
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

}
