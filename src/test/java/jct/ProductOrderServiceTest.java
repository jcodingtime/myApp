package jct;

import com.mycompany.myapp.repository.ProductOrderRepository;
import com.mycompany.myapp.repository.ShoppingCartRepository;
import com.mycompany.myapp.service.ProductOrderService;
import com.mycompany.myapp.service.ShoppingCartService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProductOrderServiceTest {

    @Autowired
    private ProductOrderRepository productOrderRepository;
    final private ProductOrderService productOrderService = new ProductOrderService(productOrderRepository);

	@Test
	public void testCaseCalculateTotalValue() {
		Integer expected = (200);
        BigDecimal obtained = productOrderService.calculateTotalValue(BigDecimal.valueOf(20),10);
		assertEquals(expected, Integer.valueOf(obtained.intValue()));
	}
}
