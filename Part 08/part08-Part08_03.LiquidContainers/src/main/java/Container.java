
/**
 *
 * @author laloschjetnan
 */
public class Container {
    //Container Object class and instance variables

    private int currentAmount;
    private int capacity;
    private String name;

    //container constructor, gives the container a string for the name as a parameter
    public Container(String name) {
        this.name = name;
        this.currentAmount = 0;
        this.capacity = 100;
    }
    
    //returns the containers current amount
    public int getCurrentAmount(){
        return this.currentAmount;
    }

    //does some logical checks and adds the specified amount depending on the conditions
    public void add(int addedAmount) {
        if (addedAmount > 0) {
            if (this.currentAmount + addedAmount > this.capacity) {
                this.currentAmount = this.capacity;
            } else if (this.currentAmount < this.capacity) {
                this.currentAmount += addedAmount;
            }
        }
    }
    
    // does some checks to make sure the container doesn't below 0 depending on the conditions
    public void remove(int removedAmount){
        if(removedAmount > 0){
            if(this.currentAmount - removedAmount > 0){
                this.currentAmount -= removedAmount;
            }
            else if (this.currentAmount - removedAmount <= 0){
                this.currentAmount = 0;
            }
        }
    }
    
    //specifies how to print the contaienr object.
    @Override 
    public String toString(){
        return this.name + ": " + this.currentAmount + "/" + this.capacity;
    }

}
