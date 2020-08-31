package application;

import javafx.scene.chart.XYChart;

/**
 *
 * @author laloschjetnan
 */
public class MonthlySavingsCalculator {

    public XYChart.Series savingsData;

    public MonthlySavingsCalculator() {
        this.savingsData = new XYChart.Series<>();
        this.savingsData.setName("Savings");
    }

        public void calculateSavings(double monthlyAmount) {
        //once the hashmap is inititated, it loops from 0 to 30 and multiplies the monthly amount * number of years * 12
        for (int i = 0; i <= 30; i++) {
            double savingsAmount = i * monthlyAmount * 12;
            //each value is added to the chart 
            XYChart.Data<Integer, Double> data = new XYChart.Data<>(i, savingsAmount);
            //it adds the hoveredthreshold node to each data point so it can display the value
            data.setNode(new HoveredThresholdNode(i, savingsAmount));
            this.savingsData.getData().add(data);        }
    }

    
    public XYChart.Series getChartData(){
        return this.savingsData;
    }
    
    public void clear(){
        this.savingsData.getData().clear();
    }
    
}
