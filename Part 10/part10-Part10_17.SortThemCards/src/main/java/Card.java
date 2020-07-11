

public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    
    //Uses the order of the cards and their suit value to compare and sort their values
    @Override
    public int compareTo(Card card) {
       //finds the card value first and compares it
       int comparable = 0;
       if(this.value > card.getValue()){
           comparable = 1;
       }
       if(this.value < card.getValue()){
           comparable = -1;
       }
       //if the cards are of equal value, it compares their suit and respects the hierarchy  
       if(this.value == card.getValue()){
           if(this.suit.ordinal() > card.suit.ordinal()){
               comparable = 1;
           }
           if(this.suit.ordinal() < card.suit.ordinal()){
               comparable =  -1;
           }
           if(this.suit == card.suit){
               comparable = 0;
           }
       }
       return comparable; 
    }

}
