package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki Ranking");
        
        XYChart.Series rankingData = new XYChart.Series<>();
        rankingData.setName("University of Helsinki");
        
        rankingData.getData().add(new XYChart.Data(2007, 73));
        rankingData.getData().add(new XYChart.Data(2008, 68));
        rankingData.getData().add(new XYChart.Data(2009, 72));
        rankingData.getData().add(new XYChart.Data(2010, 72));
        rankingData.getData().add(new XYChart.Data(2011, 74));
        rankingData.getData().add(new XYChart.Data(2012, 73));
        rankingData.getData().add(new XYChart.Data(2013, 76));
        rankingData.getData().add(new XYChart.Data(2014, 73));
        rankingData.getData().add(new XYChart.Data(2015, 63));
        rankingData.getData().add(new XYChart.Data(2016, 56));
        rankingData.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(rankingData);
        
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();
        
    }

}
