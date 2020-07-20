
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    //checks that amount isn't negative, then increases the balance of the card
    public void addMoney(double increase) {
        if(increase > 0){
          this.balance += increase;  
        }
        
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        if(amount <= this.balance){
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
