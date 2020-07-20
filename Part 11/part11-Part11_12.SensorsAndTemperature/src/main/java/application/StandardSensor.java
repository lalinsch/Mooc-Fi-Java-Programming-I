package application;
/**
 *
 * @author laloschjetnan
 */
public class StandardSensor implements Sensor{
    private int value;
    
    //constructor takes a value of the paramter and sets it as the value for the sensor
    public StandardSensor(int value){
        this.value = value;
    }
    
    //a standard sensor is always on
    @Override
    public boolean isOn(){
        return true;
    }
    
    //does nothing
    @Override
    public void setOn(){
        
    }
    
    //does nothing
    @Override
    public void setOff(){
        
    }
    
    //return the value as an integer
    @Override
    public int read(){
        return this.value;
    }

}
