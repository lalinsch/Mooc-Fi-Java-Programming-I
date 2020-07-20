
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    
    //function to calculate price based on sq meters * pricePerSquare
    public int getPrice(){
        return this.princePerSquare * this.squares;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        } else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        return Math.abs(this.getPrice() - compared.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if (this.getPrice() > compared.getPrice()){
            return true;
        } else {
            return false;
        }
    }

}
