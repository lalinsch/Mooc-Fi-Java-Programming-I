
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    //creating the toString method
    @Override
    public String toString() {

        //creates printOutput variable that will be returned depending on the scenario
        String printOutput = "";
        
        //if the list is empty, the following message is returned 
        if (this.elements.isEmpty()) {
            printOutput = "The collection " + this.name + " is empty.";
            return printOutput;
        //if the list only contains one element, the message is the following and picks up the 
        //string at index 0
        } else if (this.elements.size() == 1) {
            printOutput = "The collection " + this.name + " has " + this.getElements().size() + " element:"
                    + "\n" + this.elements.get(0);
            return printOutput;
         //otherwise, we create a string that will have all the items from the arraylist separated by a space (\n)
         //it then returns the message plus the items string
        } else {
            String items = "";
            printOutput = "The collection " + this.name + " has " + this.getElements().size() + " elements:\n";
            for(String e : elements){
                items = items + e + "\n";
            }
            return printOutput + items;
        }
    }

}
