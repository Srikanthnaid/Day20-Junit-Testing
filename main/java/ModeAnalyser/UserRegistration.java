package ModeAnalyser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstName(String PassWord) {
		
		Pattern p = Pattern.compile("^[A-Za-z0-9]{8}$");
		Matcher m = p.matcher(PassWord);
		boolean result = m.matches();
		return result;
	}
}
