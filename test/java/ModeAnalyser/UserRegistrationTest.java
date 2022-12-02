package ModeAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	// create object to userRegistration class.
	UserRegistration registration = new UserRegistration();

	@Test
	void givenPassword_returnTrue() {
		
		boolean result = registration.firstName("S9#ikant");
		Assertions.assertEquals(true, result);
	}

	@Test

	void givenPassword_returnFalse() {

		boolean result = registration.firstName("srikanth9640");
		Assertions.assertEquals(false, result);
	}

}
