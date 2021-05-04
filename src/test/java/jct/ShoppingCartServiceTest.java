package jct;

import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.*;

public class ShoppingCartServiceTest {

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	private ShoppingCartService shoppingCartService;

	@BeforeEach
	public void setUp() {
		shoppingCartService = new ShoppingCartService(shoppingCartRepository);
	}

	@Test
	public void testCaseApplyDiscount() {
		BigDecimal expected = BigDecimal.valueOf(80);
		BigDecimal obtained = shoppingCartService.applyDiscount(100,20);
		assertEquals(expected, obtained);
	}

	@Test
	public void testCaseVerifyPaymentType() {
		Boolean expected = (true);
		Boolean obtained = shoppingCartService.verifyPaymentType(1);
		assertEquals(expected, obtained);
	}

	@AfterEach
	public void tearDown() {
	}

}
