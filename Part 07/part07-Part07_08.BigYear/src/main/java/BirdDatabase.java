
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */

//BirdDatabase object class, is an arraylist of the Bird object type
public class BirdDatabase {
    private ArrayList<Bird> birdList;
    
    //the constructor simply creates the list
    public BirdDatabase(){
        this.birdList = new ArrayList<>();;
    }
    
    //Takes a Bird object and adds it to the list
    public void add(Bird bird){
        this.birdList.add(bird);
    }
    
    //checks if a bird with a specified name exists, useful for UI when searching for birds
    public boolean birdExists(String name){
        for (Bird bird : birdList){
            if (bird.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    //Searches on the list for a bird that has the name that matches the string passed
    public Bird getBird(String name){
        for(Bird bird : birdList){
            if (bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }
    
    //prints all birds in the list
    public void printAllBirds(){
        for (Bird bird : birdList){
            System.out.println(bird);
        }
    }
}
