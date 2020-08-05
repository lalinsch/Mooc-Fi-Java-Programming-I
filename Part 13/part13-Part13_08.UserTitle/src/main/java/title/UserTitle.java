package title;


import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parameters params = getParameters(); //when the application launches it gets the parameter for the application
        String title = params.getNamed().get("title"); //specifies which parameter to look for
        
        stage.setTitle(title); //once the parameter has loaded, it specifies it as the application title
        stage.show();
    }


}
