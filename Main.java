import src.models.*;
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
    }
}

