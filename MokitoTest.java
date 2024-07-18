import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PortfolioTester {

    @Test
    public void testPortfolioMarketValue() {
        // Create mock StockService
        StockService stockServiceMock = Mockito.mock(StockService.class);
        Mockito.when(stockServiceMock.getPrice(Mockito.any(Stock.class)))
                .thenReturn(100.0); // Set a mock price

        // Create a list of stocks
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("SBI", "State Bank of India", 10));
        stocks.add(new Stock("TCS", "Tata Consultancy Services", 20));

        // Create a portfolio with the mock stockService
        Portfolio portfolio = new Portfolio(stockServiceMock, stocks);

        // Calculate expected market value (100 * quantity)
        double expectedValue = 100.0 * 10 + 100.0 * 20;

        // Get actual market value
        double actualValue = portfolio.getMarketValue();

        // Assert that portfolio value matches the expected value
        assertEquals(expectedValue, actualValue, 0.001);
    }

    public static void main(String[] args) {
        // Example usage
        StockService stockService = new StockServiceImpl(); // Implement StockService as needed
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("AAPL", "Apple Inc.", 15));
        stocks.add(new Stock("GOOGL", "Alphabet Inc.", 8));

        Portfolio portfolio = new Portfolio(stockService, stocks);
        double marketValue = portfolio.getMarketValue();
        System.out.println("Portfolio Market Value: $" + marketValue);
    }
}
