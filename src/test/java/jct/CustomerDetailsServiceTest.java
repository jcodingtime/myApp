package jct;

import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.*;
import com.mycompany.myapp.repository.CustomerDetailsRepository;
import com.mycompany.myapp.service.CustomerDetailsService;

public class CustomerDetailsServiceTest {

	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;
	private CustomerDetailsService customerDetailsService;

	@BeforeEach
	public void setUp() {
		customerDetailsService = new CustomerDetailsService(customerDetailsRepository);
	}

	@Test	
	public void testCaseVerifyCountryAndAge() {
		Boolean expected = (true);
		Boolean obtained = customerDetailsService.verifyCountryAndAge("Brazil",18);
		assertEquals(expected, obtained);
	}

	@AfterEach
	public void tearDown() {
	}

}