import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        // Arrange: Sample data matching expected totals
        int[][] mockData = {
                {25, 18, 20}, // Total: 63
                {15, 10, 12}, // Total: 37
                {18, 15, 20}  // Total: 53  -> Overall Total: 153
        };
        String[] names = {"P1", "P2", "P3"};
        Product product = new Product(mockData, names);

        // Act
        int total = product.GetTotalProductsSold();

        // Assert
        assertEquals(153, total);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange
        int[][] mockData = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        String[] names = {"P1", "P2", "P3"};
        Product product = new Product(mockData, names);

        // Act
        double average = product.GetAverageProductSold();

        // Assert (153 / 9 items = 17.0)
        assertEquals(17.0, average, 0.001);
    }
}
