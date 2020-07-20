/**
 *
 * @author laloschjetnan
 */
public class Container {
    
    //Container instance variables
    private int capacity;
    private int currentAmount;
    
    //container constructor, sets the capacity by default to 100
    //this could be adapted for containers with different capacities
    public Container(){
        this.capacity = 100;
        this.currentAmount = 0;
    }
    
    //simple logic to figure add a new liquid amount to firstContainer
    //checks if the amount will overfill, if so, it sets the container to the capacity (100)
    public void add (int amount){
        if(this.currentAmount + amount > this.capacity){
            this.currentAmount = this.capacity;
        }
        //otherwise, makes sure the amount is a positive value and adds it to the container
        else if (amount > 0){
            this.currentAmount += amount;
        }
    }
    
    //checks that the removed amount doesn't take the containers amount to negative number, 
    //if so it sets it to 0
    public void remove (int amount){
        if (this.currentAmount - amount < 0){
            this.currentAmount = 0;
        }
        //otherwise it removes the amount
        else if (amount > 0){
            this.currentAmount -= amount;
        }
    }
    
    //returns the capacity of the container (100)
    public int getCapacity(){
        return this.capacity;
    }
    
    //returns the current amount contained
    public int contains(){
        return this.currentAmount;
    }
    
    //tells the program how to format the result when the object is called
    public String toString(){
        return this.currentAmount+"/"+this.capacity;
    }

}
