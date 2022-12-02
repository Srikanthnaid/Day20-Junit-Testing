package ModeAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	// create object to userRegistration class.
	UserRegistration registration = new UserRegistration();

	@Test
	void givenMobNumber_returnTrue() {
		
		boolean result = registration.firstName("91 9640604452");//[1-9]{2}+[ ][6-9]{1}[1-9]{9}$
		Assertions.assertEquals(true, result);
	}

	@Test

	void givenMobNumber_returnFalse() {

		boolean result = registration.firstName("919640604452");
		Assertions.assertEquals(false, result);
	}

}
