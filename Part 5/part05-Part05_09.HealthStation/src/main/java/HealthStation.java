
public class HealthStation {
    
    private int weighingsCount = 0;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighingsCount++; //keeps track of how many weighings have occurred
        return person.getWeight();
    }
    
    //increase the persons weight passed as a paremeter
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings(){
        return this.weighingsCount;
    }

}
