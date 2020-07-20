package application;

import java.util.Random;

/**
 *
 * @author laloschjetnan
 */
public class TemperatureSensor implements Sensor {

    //has a value and a status boolean as variables
    private int value;
    private boolean status;

    //constructor takes no parameter but initialises our variables
    public TemperatureSensor() {
        this.value = 0;
        this.status = false;
    }

    //returns the current status of our boolean
    @Override
    public boolean isOn() {
        return this.status;
    }

    //this method changes the status from false to true
    @Override
    public void setOn() {
        this.status = true;
    }

    //sets the boolean as false (default status)
    @Override
    public void setOff() {
        this.status = false;
    }

    //if the sensor is off, it throws an illegal state exception, otherwise it returns 
    // a random integer between -30 and 30 using the Random Java method
    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException("sensor is off");
        }
        int rand = new Random().nextInt(61);
        //if the random number is not 0, substract 30 to get the range -30 ... 30
        if (rand != 0){
            rand -= 30;
        }
        return rand;
    }

}
