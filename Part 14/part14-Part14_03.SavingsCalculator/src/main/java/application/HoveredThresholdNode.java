package application;


import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

/**
 *
 * @author laloschjetnan
 */
public class HoveredThresholdNode extends StackPane{
    
    //This class specifies what the threshold node should look like when a user hovers over a value on the XYChart
    public HoveredThresholdNode(double priorValue, double value){
        final Label label = createDataThresholdLabel(priorValue, value);
        
        setOnMouseEntered((MouseEvent mouseEvent) -> {
            getChildren().setAll(label);
            setCursor(Cursor.NONE);
            toFront();
        });
        setOnMouseExited((MouseEvent mouseEvent) -> {
            getChildren().clear();
            setCursor(Cursor.CROSSHAIR); 
        });
    }   
    
    private Label createDataThresholdLabel(double priorValue, double value){
        final Label label = new Label("Total savings: £" + String.format("%.2f", value) + "");
        label.getStyleClass().addAll("default-color0", "chart-line-symbol", "chart-series-line");
        label.setStyle("-fx-font-size: 12; -fx-font-weight: bold");
        
        if(priorValue == 0.0){
            label.setTextFill(Color.DARKGREY);
        } else if(value > priorValue) {
            label.setTextFill(Color.FORESTGREEN);
        } else {
            label.setTextFill(Color.FIREBRICK);
        }
        
        label.setMinSize(Label.USE_PREF_SIZE, Label.USE_PREF_SIZE);
        return label;
    }

}
