/**
 *
 * @author laloschjetnan
 */
public abstract class Animal {
    //Animal abstract class
    //instance varaible for the name of the animal
    private String name;
    
    //constructor
    public Animal(String name){
        this.name = name;
    }
    
   
    public void eat(){
        System.out.println(this.name + " eats");
    }
    
    public void sleep(){
        System.out.println(this.name + " sleeps");
    }
    
    public String getName(){
        return this.name;
    }

}
