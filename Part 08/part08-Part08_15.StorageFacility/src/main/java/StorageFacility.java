
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author laloschjetnan
 */
public class StorageFacility {

    //instance variable
    private HashMap<String, ArrayList<String>> storage;

    //constructor
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    //takes the name of a unit where the item will be added
    public void add(String unit, String item) {
        //if the unit doesn't exist, it creates a new one and assigns a new arraylist to it
        this.storage.putIfAbsent(unit, new ArrayList<>());

        //opens control of the array list of the specified unit
        ArrayList<String> items = this.storage.get(unit);

        //finally, it adds the specified item to the list
        items.add(item);
    }

    public ArrayList<String> contents(String unit) {
        //if a unit exists, it returns the contents of it
        if (this.storage.containsKey(unit)) {
            return this.storage.get(unit);
        }

        //otherwise it creates a new empty list
        return new ArrayList<>();
    }

    public void remove(String unit, String item) {
        //lets us control the arraylist within the specified unit
        ArrayList<String> items = this.storage.get(unit);
        //removes an item from the list
        items.remove(item);

        //if the unit is empty after removing the item, it also removes the specified unit
        if (items.isEmpty()) {
            this.storage.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        //creates a list for all the units' names
        ArrayList<String> unitNames = new ArrayList<>();

        //for loop through all the units
        for (String unit : this.storage.keySet()) {
            //as long as the unti has contents inside it, it adds it to our list 
            if (!this.storage.get(unit).isEmpty()) {
                unitNames.add(unit);
            }
        }
        //returns the completed arraylist of units
        return unitNames;
    }
}
