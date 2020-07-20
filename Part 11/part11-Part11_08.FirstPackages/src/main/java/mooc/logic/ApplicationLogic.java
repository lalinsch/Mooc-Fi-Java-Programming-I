package mooc.logic; //sets the location of the package
import mooc.ui.UserInterface;

/**
 *
 * @author laloschjetnan
 */
public class ApplicationLogic {
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }
    
    public void execute(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }

}
