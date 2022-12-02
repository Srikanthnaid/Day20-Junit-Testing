package ModeAnalyser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstName(String MobNumber) {
		
		Pattern p = Pattern.compile("^[1-9]{2}\\s[6-9]{1}[0-9]{9}$");
		Matcher m = p.matcher(MobNumber);
		boolean result = m.matches();
		return result;
	}
}
