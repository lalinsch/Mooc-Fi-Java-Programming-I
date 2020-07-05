
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
//
public class ChangeHistory {
    //makes an arraylist of the type double to keep track of the inventory balances throughout the use 
    //of the program

    private ArrayList<Double> inventoryHistory;

    //consturctor
    public ChangeHistory() {
        this.inventoryHistory = new ArrayList<>();
    }

    //adds a value to the list
    public void add(double status) {
        this.inventoryHistory.add(status);
    }

    //clears all values
    public void clear() {
        this.inventoryHistory.clear();
    }

    //finds the largest value stored on the list, if empty returns 0
    public double maxValue() {
        if (this.inventoryHistory.isEmpty()) {
            return 0.0;
        }
        double max = this.inventoryHistory.get(0);
        for (double value : this.inventoryHistory) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    //finds the smallest value, if empty returns zero
    public double minValue() {
        if (this.inventoryHistory.isEmpty()) {
            return 0.0;
        }
        double min = this.inventoryHistory.get(0);
        for (double value : this.inventoryHistory) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    //calculates the average of all values, if empty returns zero
    public double average() {
        if (this.inventoryHistory.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double value : this.inventoryHistory) {
            sum += value;
        }

        return sum / this.inventoryHistory.size();
    }

    //specifies how the arraylist should be printed
    @Override
    public String toString() {
        return this.inventoryHistory.toString();
    }

}
