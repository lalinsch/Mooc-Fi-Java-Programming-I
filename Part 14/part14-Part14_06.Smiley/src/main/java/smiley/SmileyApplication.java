package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{


    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas paintingCanvas = new Canvas(800, 800);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        //paints the left eye
        painter.fillRect((paintingCanvas.getWidth()/10)*2, paintingCanvas.getHeight()/5, 100, 100);
        //paints the right eye
        painter.fillRect((paintingCanvas.getWidth()/10)*6, paintingCanvas.getHeight()/5, 100, 100);
        //paints the first part of the mouth
        painter.fillRect(paintingCanvas.getWidth()/10, (paintingCanvas.getHeight()/5)*3, 100, 100);
        //paint the middle part of the mouth    
        painter.fillRect(100+(paintingCanvas.getWidth()/10), 100 + (paintingCanvas.getHeight()/5)*3, 400, 100);
        //paint the last part of the mouth
        painter.fillRect(100+(paintingCanvas.getWidth()/10)*6, (paintingCanvas.getHeight()/5)*3, 100, 100);
        
        paintingCanvas.setOnMouseDragged((event) -> {
            double locationX = event.getX();
            double locationY = event.getY();
            painter.setFill(Color.BLACK);
            painter.fillRect(locationX, locationY, 4, 4);
        });
        
        BorderPane layout = new BorderPane();
        layout.setCenter(paintingCanvas);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

}
