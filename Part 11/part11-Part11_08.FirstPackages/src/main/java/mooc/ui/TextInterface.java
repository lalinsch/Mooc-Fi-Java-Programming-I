/**
 *
 * @author laloschjetnan
 */
package mooc.ui; //sets the location of the class in a package

public class TextInterface implements UserInterface{
    
    @Override
    public void update(){
        System.out.println("Updating UI");
    }

}
