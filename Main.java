import src.models.*;
import src.services.StockAnalyzer;
import src.utilities.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "data/stock_data.csv";
        List<StockData> stockData = new CSVLoader().loadStockData(filePath);
        System.out.println("The loaded stock data is: ");
        for(StockData data : stockData) {
            System.out.println(data);
        }
        double maxProfit = StockAnalyzer.calculateMaxProfit(stockData);
        System.out.println("\nMaximum Profit from a single transaction: $" + maxProfit);

        List<Double> movingAverages = StockAnalyzer.calculateMovingAverages(stockData, 3);
        System.out.println("\n3-Day Moving Averages:");
        for (Double avg : movingAverages) {
            System.out.println(avg);
        }
        
        String trend = StockAnalyzer.analyzeTrend(movingAverages);
        System.out.println("\nMarket Trend: " + trend);
    }
}

