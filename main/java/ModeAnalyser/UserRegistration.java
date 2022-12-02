package ModeAnalyser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstName(String PassWord) {
		
		/* \\d is refer to [0-9] values*/
		Pattern p = Pattern.compile("^[A-Z]{1}[\\d]{1}[A-Za-z]{6}$");
		Matcher m = p.matcher(PassWord);
		boolean result = m.matches();
		return result;
	}
}
