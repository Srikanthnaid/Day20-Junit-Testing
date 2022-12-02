package ModeAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	// create object to userRegistration class.
	UserRegistration registration = new UserRegistration();

	@Test
	void givenFirstName_With_OneUppercaseLetter_returnTrue() {
		
		boolean result = registration.firstName("Srikanth");
		Assertions.assertEquals(true, result);
	}

	@Test

	void givenFirstName_With_OneUppercaseLetter_returnFalse() {

		boolean result = registration.firstName("srikanth");
		Assertions.assertEquals(false, result);
	}

}
