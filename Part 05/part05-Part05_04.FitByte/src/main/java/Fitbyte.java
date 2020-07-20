/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
public class Fitbyte {
    // set instance variables
    private int age;
    private int restingHeartRate;
    
    //constructor
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    } 
    
    //calculttes max heart rate with the given formula and input age
    public double maxHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    //calculates target heartrate 
    public double targetHeartRate(double percentageOfMaximum){
        return (this.maxHeartRate() - this.restingHeartRate)*(percentageOfMaximum) + this.restingHeartRate;
    }
    
}
