/**
 *
 * @author laloschjetnan
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    //brings in a ChangeHistory variable to keep track of the inventory changes
    private ChangeHistory inventoryHistory;
    
    
    //constructor, inherits from the superclass but also starts the changehistory object and adds the initial balance to the program
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.inventoryHistory = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    //overrides the warehouse's method, keeps the same functionality but also takes the value of the balance
    //at that point and adds it to the inventory history list
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.inventoryHistory.add(this.getBalance());
    }

    //keeps the same functionality as the warehouse method, but also saves the value at that point to the 
    //inventory history list
    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        this.inventoryHistory.add(this.getBalance());
        return amountTaken;
    }
    
    //prints the full list of values stored in the history of the program
    public String history(){
        return this.inventoryHistory.toString();
    }
    
    //utilises methods from the class and superclassses as wells as the variables to summarise
    //all the data in the program
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.inventoryHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.inventoryHistory.minValue());
        System.out.println("Average: " + this.inventoryHistory.average());
    }

}
