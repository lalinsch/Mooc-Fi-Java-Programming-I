package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laloschjetnan
 */
public class AverageSensor implements Sensor {
    
    //instance variables contains a list of the Sensor interface, and an integer that stores previous readings
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    //constructor initiates our variables 
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    //adds any object that implements Sensor to our sensors list
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    //returns a list of all previously executed readings from the sensors 
    public List<Integer> readings() {
        return this.readings;
    }

    //this method only returns true if every sensors inside our list is on
    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    //switches every sensor in the list on
    @Override
    public void setOn() {
        this.sensors.forEach(sensor -> sensor.setOn());
    }

    //switches every sensor in the list off (this doesn't affect StandardSensors as they are always on)
    @Override
    public void setOff() {
        this.sensors.forEach(sensor -> sensor.setOff());
    }

    
    @Override
    public int read() {
        //throws an illegal state exception if the sensors are off, or if the sensors list is empty
        if ((!this.isOn()) || this.sensors.isEmpty()) {
            throw new IllegalStateException("sensors are off or the list is empty");
        }
        
        //takes every reading from the sensor and adds it up, then divides by the size of the sensor list size
        int average = (this.sensors.stream().map(sensor -> sensor.read())
                .reduce(0, (subtotal, value) -> subtotal + value))/this.sensors.size();
        
        //the reading gets added to our readings list
        this.readings.add(average);
        
        //the average is returned (as an int)
        return average;
    }

}
