package jct;

import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mycompany.myapp.repository.AuthorityRepository;

import org.springframework.cache.CacheManager;;

import com.mycompany.myapp.repository.UserRepository;
import com.mycompany.myapp.service.UserService;

public class UserServiceTest {

	@Autowired
	private UserRepository userRepository;
	private UserService userService;

	private PasswordEncoder passwordEncoder;
	private AuthorityRepository authorityRepository;
	private CacheManager cacheManager;
	@BeforeEach
	public void setUp() {
		userService = new UserService(userRepository, passwordEncoder, authorityRepository, cacheManager);
	}

	@Test	
	public void testCaseVerifyAdminUser() {
		Boolean expected = (true);
		Boolean obtained = userService.verifyAdminUser("Admin");
		assertEquals(expected, obtained);
	}

	@AfterEach
	public void tearDown() {
	}

}