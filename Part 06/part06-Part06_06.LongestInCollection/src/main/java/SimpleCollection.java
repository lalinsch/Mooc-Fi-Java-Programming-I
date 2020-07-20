
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

    //method to return the longest string in the elements list
    public String longest() {
        //firts checks if list is empty and returns null
        if (this.elements.isEmpty()) {
            return null;
        }

        //creates longestString variable and assigns it to the first element 
        String longestString = this.elements.get(0);

        //loops through the elements and makes a comparison, if a longer string is found
        // it is assigned the longestString variable 
        for (String s : elements) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }

        //after the loop is done, it returns the longest String
        return longestString;
    }

}
