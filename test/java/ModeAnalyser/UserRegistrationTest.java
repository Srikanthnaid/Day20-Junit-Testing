package ModeAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	// create object to userRegistration class.
	UserRegistration registration = new UserRegistration();

	@Test
	void givenEmail_returnTrue() {
		
		boolean result = registration.firstName("abc.xyz@bl.co.in");
		Assertions.assertEquals(true, result);
	}

	@Test

	void givenLastName_With_OneUppercaseLetter_returnFalse() {

		boolean result = registration.firstName("sjdh.ashg@sjco.in");
		Assertions.assertEquals(false, result);
	}

}
