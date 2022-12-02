package ModeAnalyser;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstName(String Email) {
		
		//result is boolean variable.
		//pattern.matches is inbuilt method of pattern class.
		boolean m = Pattern.matches("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$", Email);
		return m;
	}
}
