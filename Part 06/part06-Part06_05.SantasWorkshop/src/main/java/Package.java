
import java.util.ArrayList;


/**
 *
 * @author laloschjetnan
 */
public class Package {
    //Package class instance variables, makes a list of the Gift class
    private ArrayList<Gift> giftList;
    
    //constructor, inititates the ArrayList
    public Package(){
        this.giftList = new ArrayList();
    }
    
    //takes a gift object and adds it to the list
    public void addGift(Gift gift){
        giftList.add(gift);
    }
    
    //keeps track of each gifts weight using getWeight() method and returns it as an int.
    public int totalWeight(){
        int total = 0;
        for (Gift gift : giftList){
            total += gift.getWeight();
        }
        return total;
    }
    
}
