package SikuliX.SikuliX;

import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Assertions {
	
	public  boolean ensureExists(Pattern p) {

		Screen s = new Screen(); 
		Match m = s.exists(p);

		 if (m != null) {
		 
		 return true;
		 } else {
		 return false;
		 }
		}

}
