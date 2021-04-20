package jct;

import com.mycompany.myapp.repository.ShoppingCartRepository;
import com.mycompany.myapp.service.ShoppingCartService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ShoppingCartServiceTest {
    @Autowired
    private ShoppingCartRepository shoppingCardRepository;
    final private ShoppingCartService shoppingCartService = new ShoppingCartService(shoppingCardRepository);

	@Test
	public void testCaseApplyDiscount() {
		BigDecimal expected = BigDecimal.valueOf(80);
		BigDecimal obtained = shoppingCartService.applyDiscount(BigDecimal.valueOf(80),20);
		assertEquals(expected, obtained);
	}

}
