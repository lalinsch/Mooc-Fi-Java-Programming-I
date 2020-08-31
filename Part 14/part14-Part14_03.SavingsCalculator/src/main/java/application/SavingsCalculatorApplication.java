package application;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    //sets the program's variables // these will be updated as the user interacts with the application
    public static double monthlyAmount = 50;
    public static double interestRate = 5.0;
    public static MonthlyInterestCalculator interestCalculator = new MonthlyInterestCalculator();
    public static MonthlySavingsCalculator savingsCalculator = new MonthlySavingsCalculator();

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Specifies the objects and their styling for the first slider ("savings") 
        Label savingsLabel = new Label("Monthly savings");
        Label savingsAmountLabel = new Label(String.valueOf(monthlyAmount));

        Slider savingsSlider = new HSlider(25, 250, monthlyAmount);

        //this listener checks the value of the slider and updates our monthly amount variable,
        //also updates the label which indicates the current value, and then uses the updateChart method
        //to update the charts (see below)
        savingsSlider.valueProperty().addListener(
                (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
                    monthlyAmount = (double) newValue;
                    savingsAmountLabel.setText(String.format("%.2f", monthlyAmount));
                    updateChart();
                });

        //finally it all gets added to the first BorderPane 
        BorderPane savingsSliderContainer = new BorderPane();
        savingsSliderContainer.setLeft(savingsLabel);
        savingsSliderContainer.setCenter(savingsSlider);
        savingsSliderContainer.setRight(savingsAmountLabel);

        //the next block of code specifies the default behaviour of the chart when the application launches
        //(looking at the default variables set above)
        savingsCalculator.calculateSavings(monthlyAmount);

        //the same process is repeated to the interest rate slider
        Label interestLabel = new Label("Yearly interest rate");
        Label interestAmountLabel = new Label(String.valueOf(interestRate));

        //creates the slider object (see HSlider class) 
        Slider interestSlider = new HSlider(0.0, 10.0, interestRate);

        BorderPane interestSliderContainer = new BorderPane();
        interestSliderContainer.setCenter(interestSlider);
        interestSliderContainer.setLeft(interestLabel);
        interestSliderContainer.setRight(interestAmountLabel);

        interestSlider.valueProperty().addListener(
                (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
                    interestRate = (double) newValue;
                    interestAmountLabel.setText(String.format("%.2f", interestRate));
                    updateChart();
                });

        interestCalculator.calculateInterest(monthlyAmount, interestRate);

        //Once the sliders are complete, they are added to a VBox object 
        VBox sliderBox = new VBox(savingsSliderContainer, interestSliderContainer);
        sliderBox.setSpacing(20);

        //This creates the axis on our chart, specifying the range and volume of the data to be visualised 
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 125000, 25000);
        xAxis.setLabel("Years");

        LineChart lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("Monthly savings");
        lineChart.setCursor(Cursor.CROSSHAIR);
        lineChart.getData().addAll(savingsCalculator.getChartData(), interestCalculator.getChartData());
        lineChart.setAnimated(false);

        //the main layout of the program gets initialised and populated with the line chart
        BorderPane layout = new BorderPane(lineChart);
        layout.setTop(sliderBox);
        layout.setPadding(new Insets(10, 10, 10, 10));

        //shows the program to the user
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.setHeight(1000);
        stage.setWidth(1000);
        stage.setTitle("Monthly Savings and Interest Calculator");
        stage.show();
    }

    // this method uses the functions above to clear the chart and populate it with new data
    //this method is call on the slider listener so as soon as there are new values on our hashmaps,
    //these get passed to the chart and reflected to the user 
    public void updateChart() {

        savingsCalculator.clear();
        interestCalculator.clear();
        
        savingsCalculator.calculateSavings(monthlyAmount);
        interestCalculator.calculateInterest(monthlyAmount, interestRate);

    }

}
