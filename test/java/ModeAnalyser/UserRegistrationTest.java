package ModeAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	// create object to userRegistration class.
	UserRegistration registration = new UserRegistration();

	@Test
	void givenPassword_returnTrue() {
		
		boolean result = registration.firstName("Srika960");//^[A-Za-z0-9]{8}$
		Assertions.assertEquals(true, result);
	}

	@Test

	void givenPassword_returnFalse() {

		boolean result = registration.firstName("Srikanth9640");
		Assertions.assertEquals(false, result);
	}

}
