
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author laloschjetnan
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }

    //finds the specified license plate, if it has no owner attached to it, it sets it depending on the 
    //parameter passed and returns true, otherwise returns false
    public boolean add(LicensePlate licensePlate, String owner){
        if (this.owners.get(licensePlate) == null){
            this.owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    //checks if the specified license plate exists, if it does, returns the owner's name
    //otherwise it returns null
    public String get(LicensePlate licensePlate){
        if(this.owners.containsKey(licensePlate)){
            return this.owners.get(licensePlate);
        }
        else {
            return null;
        }
    }
    
    //if the specified license plate exists, finds the owner and removes it, then returns true,
    //otherwise it returns false
    public boolean remove(LicensePlate licensePlate){
        if(this.owners.containsKey(licensePlate)){
            this.owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    //finds every license plate number and prints it to the console
    public void printLicensePlates(){
        for (LicensePlate license : owners.keySet()){
            System.out.println(license);
        }
    }
    
    //finds the owners list and creates a new list, if a name is repeated it gets ignored, 
    //once all the values have been added, it prints each person's name to the console
    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner : this.owners.values()){
            if(!ownerList.contains(owner)){
                ownerList.add(owner);
            }
        }
        for(String owner : ownerList){
            System.out.println(owner);
        }
    }

}
