/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
//create timer class
public class Timer {

    // create two ClockHand objects
    private ClockHand hundredths = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);

    //conditionals to represent when each clockhand should move
    public void advance() {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    //displays the correct formating when printing to console
    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
}
