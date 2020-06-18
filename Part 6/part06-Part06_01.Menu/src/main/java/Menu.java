
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    //checks if the ArrayList meals already contains the meal String, 
    //if it doesn't it adds it to the list
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            meals.add(meal);
        }    
    }
    
    //for loop to print each item from the list on an individual line
    public void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    //clears the menu
    public void clearMenu(){
        meals.clear();
    }
}
