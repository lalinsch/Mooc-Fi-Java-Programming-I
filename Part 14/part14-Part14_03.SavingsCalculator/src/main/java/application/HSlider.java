package application;

import javafx.scene.control.Slider;

/**
 *
 * @author laloschjetnan
 */

//this class extends the Slider object and describes how the horizontal sliders should look like and behave
public class HSlider extends Slider{
    
    public HSlider(double min, double max, double defaultValue){
        super(min, max, defaultValue);
        super.setShowTickLabels(true);
        super.setShowTickMarks(true);
        super.setBlockIncrement(max/10);
        super.setMajorTickUnit(max/10);
        super.setSnapToTicks(true);
       
    }
    

}
