/**
 *
 * @author laloschjetnan
 */

//dog inherits animal and it implements the NoiseCapable interface
public class Dog extends Animal implements NoiseCapable{
    
    //constructor calls the abstaract class and passes a parameter
    public Dog(String name){
        super(name);
    }
    
    
    //if there are no parameters, the name of the animal is simply "dog"
    public Dog(){
        super("Dog");
    }
    
    //bark method which only applies to the dog class
    public void bark(){
        System.out.println(super.getName() + " barks");
    }
    
    //implementation of the makeNoise method, it simply calls the bark method
    @Override
    public void makeNoise(){
        this.bark();
    }
    

}
