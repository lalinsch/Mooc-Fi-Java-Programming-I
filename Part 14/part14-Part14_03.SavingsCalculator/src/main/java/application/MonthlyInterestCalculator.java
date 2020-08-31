package application;

import javafx.scene.chart.XYChart;

/**
 *
 * @author laloschjetnan
 */
public class MonthlyInterestCalculator {
    public XYChart.Series interestData;
    
    public MonthlyInterestCalculator(){
        this.interestData = new XYChart.Series<>();
        this.interestData.setName("Interest earned");
    }
    
    public void calculateInterest(double monthlyAmount, double interestRate){
        double amountSavedPerYear = monthlyAmount * 12;
        //and then calculate the savings + interest
        double currentTotalSavings = amountSavedPerYear + (amountSavedPerYear * interestRate) / 100;

        //adds the values for year 0 and 1
        this.interestData.getData().add(new XYChart.Data(0, 0.0));
        this.interestData.getData().add(new XYChart.Data(1, currentTotalSavings));
        
        //it then adds the values from years 2-30, which increment by the yearly amount and then calculates the interest again
        for (int i = 2; i <= 30; i++) {
            currentTotalSavings += amountSavedPerYear; 
            currentTotalSavings = currentTotalSavings + (currentTotalSavings * interestRate) / 100;
            XYChart.Data<Integer, Double> data = new XYChart.Data<>(i, currentTotalSavings);
            //it adds the hoveredthreshold node to each data point so it can display the value
            data.setNode(new HoveredThresholdNode(i, currentTotalSavings));
            this.interestData.getData().add(data);
            
        }
    }
    
    public XYChart.Series getChartData(){
        return this.interestData;
    }
    
    public void clear(){
        this.interestData.getData().clear();
    }

}
