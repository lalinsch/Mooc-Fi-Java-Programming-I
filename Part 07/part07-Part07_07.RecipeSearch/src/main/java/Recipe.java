
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class Recipe {
    //recipe object class

    // instance variables
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    //constructor
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    //checks if a specified ingredient is containted in the ingredients array list
    public boolean hasIngredient(String ingQuery){
        for(String s : this.ingredients){
            if(s.equals(ingQuery)){
                return true;
            }
        }
        return false;
    }
    
    //shows how the recipes should be formatted when printed
    @Override
    public String toString(){
        return this.getName() + ", cooking time: "  + this.getTime();
    }

    }
