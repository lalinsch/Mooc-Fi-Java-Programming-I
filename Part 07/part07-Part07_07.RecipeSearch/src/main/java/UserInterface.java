
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author laloschjetnan
 */
public class UserInterface {

    //UI instance variables
    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>(); //makes a list of all the recipes in the file

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    //main UI method, contains the console output and scanner inputs for interaction 
    public void start() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName); //calls the readFile method below

        System.out.println("");

        //prints out the programs instructions to the user
        System.out.println("Commands: \nlist - lists the recipes \nstop - stops the program"
                + "\nfind name - searches recipes by name \nfind cooking time - searches recipes by cooking time"
                + " \nfind ingredient - searches recipes by ingredient");
        System.out.println("");

        //main execution of the program, it will run until the stop command is entered
        while (true) {
            System.out.println("Enter a command");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            //finds all the recipes in our recipeList and prints them in the right format (toString) 
            if (command.equals("list")) {
                for (Recipe r : recipeList) {
                    System.out.println(r);
                }
            }

            //searches for a string within the name of the recipe, if found it prints the recipes that contain the string
            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String query = scanner.nextLine();
                for (Recipe r : recipeList) {
                    if (r.getName().contains(query)) {
                        System.out.println(r);
                    }
                }
            }

            //compares the input cooking time vs the cooking time, if the time is less or equal the input, print the recipe
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scanner.nextLine());
                for (Recipe r : recipeList) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
            }

            //looks specifically for an ingredient using the hasIngredient boolean method in Recipe
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingQuery = scanner.nextLine();
                for (Recipe r : recipeList) {
                    if (r.hasIngredient(ingQuery)) {
                        System.out.println(r);
                    }
                }
            }
        }
    }

    //method to read the specified file, we know the data's specific format 
    //so we can create Recipes as the file is being read
    public void readFile(String fileName) {
        //starts a new Scanner which reads the file input by the user
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            //starts a while loop that will execute until the end of the document
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                //when an empty line is found, go to the start of the loop (creates a new recipe)
                if (line.equals("")) {
                    continue;
                }
                //otherwise, set a name variable to the string on the first line
                String name = line;
                // then an int variable to the string on the second line
                int time = Integer.valueOf(fileReader.nextLine());
                //we know the rest of the data is strings, so we can create an arrayList for the ingredients
                ArrayList<String> ings = new ArrayList();
                //uses the same condition of chekcing that the document continues to avoid errors
                while (fileReader.hasNextLine()) {
                    //for every line until the next space, give a string variable of the name ingredient
                    String ingredient = fileReader.nextLine();
                    //once an empty line is found (end of recipe) exits the inner while loop
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    //otherwise, it adds each ingredient to the ings ArrayList
                    ings.add(ingredient);
                }
                //at the end of each iteration of the loop, creates a Recipe object based on the variables we have been collected
                recipeList.add(new Recipe(name, time, ings));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
