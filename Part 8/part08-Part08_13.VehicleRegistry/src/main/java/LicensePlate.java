
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    
    //implements the equals and hashcode, this one was done manually but it can also be done by 
    //NetBeans
    @Override
    public boolean equals(Object obj){
        if (obj.getClass() != this.getClass()){
            return false;
        }
        
        if (obj == this){
            return true;
        }
        
        LicensePlate convertedObject = (LicensePlate) obj;
        
        if (this.country.equals(convertedObject.country) && this.liNumber.equals(convertedObject.liNumber)){
            return true;    
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        int hash = 9;
        if (this.country == null){
            return hash * this.liNumber.hashCode();
        }
        
        if (this.liNumber == null){
            return hash * this.country.hashCode();
        }
        
        hash = 71 * hash + this.country.hashCode();
        hash = 71 * hash + this.liNumber.hashCode();
        return hash;  
    }
    


}
