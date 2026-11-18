import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
    Product p = new Product(3);
    p.addProductData("Cozy", 25, 18, 20);
    p.addProductData("Restonic", 15, 10, 12);
    p.addProductData("Sealy", 18, 15, 20);   
        assertEquals(153, p.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product p = new Product(3);
        p.addProductData("Cozy", 25, 18, 20);
        p.addProductData("Restonic", 15, 10, 12);
        p.addProductData("Sealy", 18, 15, 20);
       
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);
    }
}