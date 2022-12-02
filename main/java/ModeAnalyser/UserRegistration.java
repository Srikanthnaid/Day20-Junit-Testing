package ModeAnalyser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean firstName(String LastName) {
		
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher m = p.matcher(LastName);
		return m.matches();
	}
}
