package ModeAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	// create object to userRegistration class.
	UserRegistration registration = new UserRegistration();

	@Test
	void givenLastName_With_OneUppercaseLetter_returnTrue() {
		
		boolean result = registration.firstName("Naidu");
		Assertions.assertEquals(true, result);
	}

	@Test

	void givenLastName_With_OneUppercaseLetter_returnFalse() {

		boolean result = registration.firstName("naidu");
		Assertions.assertEquals(false, result);
	}

}
