package jct;

import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.*;
import com.mycompany.myapp.repository.ProductCategoryRepository;
import com.mycompany.myapp.service.ProductCategoryService;

public class ProductCategoryServiceTest {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	private ProductCategoryService productCategoryService;

	@BeforeEach
	public void setUp() {
		productCategoryService = new ProductCategoryService(productCategoryRepository);
	}

	@Test	
	public void testCaseVerifyCountryAndAge() {
		Boolean expected = (true);
		Boolean obtained = productCategoryService.verifyCountryAndAge("Brazil",18);
		assertEquals(expected, obtained);
	}

	@AfterEach
	public void tearDown() {
	}

}