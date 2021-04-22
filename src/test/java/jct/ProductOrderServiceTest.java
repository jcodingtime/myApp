package jct;

import static org.junit.Assert.assertEquals;

import com.mycompany.myapp.repository.ProductOrderRepository;
import com.mycompany.myapp.service.ProductOrderService;
import java.math.BigDecimal;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductOrderServiceTest {

    @Autowired
    private ProductOrderRepository productOrderRepository;

    private ProductOrderService productOrderService = new ProductOrderService(productOrderRepository);

    /**
     * Calculate a valid total value.
     */
    @Test
    public void testCaseCalculateTotalValue() {
        BigDecimal expected = BigDecimal.valueOf(500);
        BigDecimal obtained = productOrderService.calculateTotalValue(BigDecimal.valueOf(100), 5);
        assertEquals(expected, obtained);
    }
}
