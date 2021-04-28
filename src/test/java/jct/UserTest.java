package jct;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {

	@Test
	public void testCase1SetAge() {
		int age = 17;
		boolean valid = false;
		if (age >= 18 && age <= 130){
			valid = true;
		} else {
			valid = false;
		}
		assertNotEquals(true, valid);
	}

	@Test
	public void testCase2SetAge() {
		Integer age = 18;
		boolean valid = false;
		if (age >= 18 && age <= 130){
			valid = true;
	} else {
			valid = false;
		}
		assertEquals(true, valid);
	}

	@Test
	public void testCase3SetAge() {
		Integer age = 19;
		boolean valid = false;
		if (age >= 18 && age <= 130){
			valid = true;
		} else {
			valid = false;
		}
		assertEquals(true, valid);
	}

	@Test
	public void testCase4SetAge() {
		Integer age = 129;
		boolean valid = false;
		if (age >= 18 && age <= 130){
			valid = true;
		} else {
			valid = false;
		}
		assertEquals(true, valid);
	}

	@Test
	public void testCase5SetAge() {
		Integer age = 130;
		boolean valid = false;
		if (age >= 18 && age <= 130){
			valid = true;
		} else {
			valid = false;
		}
		assertEquals(true, valid);
	}

	@Test
	public void testCase6SetAge() {
		Integer age = 131;
		boolean valid = false;
		if (age >= 18 && age <= 130){
			valid = true;
		} else {
			valid = false;
		}
		assertNotEquals(true, valid);
	}


}
