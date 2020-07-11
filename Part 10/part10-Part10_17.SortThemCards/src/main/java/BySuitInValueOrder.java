
import java.util.Comparator;

/**
 *
 * @author laloschjetnan
 */
public class BySuitInValueOrder implements Comparator<Card>{
    
    
    public BySuitInValueOrder(){
        
    }

    //specifies the order in the way cards should be compared, first looking at thheir value, and then looking
    //at their suit hierarchy
    @Override
    public int compare(Card c1, Card c2){
        if(c1.getSuit() == c2.getSuit()){
            return c1.getValue() - c2.getValue();
        }
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
    

}
