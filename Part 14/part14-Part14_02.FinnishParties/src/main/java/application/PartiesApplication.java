package application;

import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    //the main class uses javafx to build a graphical representation of the data in the 
    public static void main(String[] args) throws Exception {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //when the application starts it uses our PartyData class to read the specified file 
        PartyData partyData = new PartyData("partiesdata.tsv");
        partyData.readFile();

        //It creates both the X and Y axis (specifying the range for the X axis as well)
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        //We give each axis a label
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support");

        //and then we add both axis to a new lineChart object
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        //the following gets the data from the hashmap that has been created and assigns values to the data in the chart
        //we give the map that gets created a variable name 'values' so that we can reference it...
        Map<String, Map<Integer, Double>> values = partyData.getData();
        
        //we then use the keys for the map (partyName) to assign the name of each data series
        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series<>();
            data.setName(party);

            //we then get the values of the inner map for each key, and assign it to an XYChart
            values.get(party).entrySet().forEach(pair -> {
                data.getData().add(new XYChart.Data<>(pair.getKey(), pair.getValue()));
            });

            //once all the data has been assinge,d it gets added to the lineChart we created earlier(x & y values)
            lineChart.getData().add(data);
        });
        
        //sets the scene to automatically populate with the lineChart, and then displays it 
        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();

    }

}
