package SikuliX.SikuliX;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class features {
    
    private static Screen screen;
  
       
	static{
	
	    screen = new Screen();
	}

	
	public void Login(String email) throws FindFailed {
		 
		 
		 if (screen.exists(patterns.LoginWithText, 4)!=null	){
			 screen.click(patterns.LoginWithText);		
		     Clear();
		     screen.type(email);
		        if (screen.exists(patterns.PasswordWithText, 2)!=null	){
		        	screen.click(patterns.PasswordWithText);
		        	Clear();
		        	screen.type("sikulitest");
		        	 screen.click(patterns.LoginButton);
		     } else if (screen.exists(patterns.Password, 2)!=null	){
		    	   screen.click(patterns.Password); 
		    	   Clear();
		    	   screen.type("sikulitest");
		    	   screen.click(patterns.LoginButton);
		     }
		 }  else if (screen.exists(patterns.Login, 4)!=null	){
	     screen.click(patterns.Login);		
	     Clear();
	     screen.type(email);
	     if (screen.exists(patterns.PasswordWithText, 2)!=null	){
	        	screen.click(patterns.PasswordWithText);
	        	Clear();
	        	screen.type("sikulitest");
	        	 screen.click(patterns.LoginButton);
	     } else if (screen.exists(patterns.Password, 2)!=null	){
	    	   screen.click(patterns.Password); 
	    	   Clear();
	    	   screen.type("sikulitest");
	    	   screen.click(patterns.LoginButton);
	     }
	     
		 }
	 }
	
	public void Logout() throws FindFailed {
		
		 screen.click(patterns.menuSpotify);		
	     screen.wait(patterns.logout, 10);
	     screen.click(patterns.logout);
	     screen.wait(patterns.Login, 20);
		 
	 }
	
	public void Clear() throws FindFailed {
		
		screen.type("a", KeyModifier.CMD);
	    screen.type(Key.BACKSPACE);
		 
	 }
}

