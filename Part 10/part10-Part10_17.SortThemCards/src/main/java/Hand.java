
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author laloschjetnan
 */

//implements the comparable class
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    //prints all cards
    public void print(){
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    
    //uses the sorting method based on the card compareto method
    public void sort(){
        Collections.sort(cards, (c1, c2) -> c1.compareTo(c2));
    }
    
    //uses the bysuitinvalueorder to sort the cards by suit first, and then by value
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    //returns the total sum of the hand's values
    public int sum(){
        return this.cards.stream().map(card -> card.getValue())
                .reduce(0, (subtotal, nextCard) -> subtotal+nextCard);
    }

    //compares the sum value for each hand and then compares them to figure out the sorting order
    @Override
    public int compareTo(Hand hand) {
        if(this.sum() > hand.sum()){
            return 1;
        }
        if(this.sum() < hand.sum()){
            return -1;
        }
        return 0;
    }

}
