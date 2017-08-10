package SikuliX.SikuliX;

import org.sikuli.script.Button;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class patterns {
	
	public static Pattern loginError;
	public static Pattern LoginWithText;
	public static Pattern PasswordWithText;
	public static Pattern top50Search;
	public static Pattern countryAlbumSearch;
	public static Pattern Charts;
	public static Pattern PreviousButtonImage;
	public static Pattern playButton;
	public static Pattern playList;
	public static Pattern playListtextBox;
	public static Pattern PlayListCreate;
	public static Pattern myPlaylist;
	public static Button button;
	public static Pattern SongAddButton;
	public static Pattern SongAddCheck;
	
	public static features features;
	public static Pattern Search;
	public static Pattern Login;
	public static Pattern Password;
	public static Pattern LoginButton;
    
	public static Screen screen;
	public static Pattern menuSpotify;
	public static Pattern logout;
  
   
    
    
	static {
	
		Login = new Pattern("images/login.png");
	    Password = new Pattern("images/password.png");
	    LoginButton = new Pattern("images/loginButton.png");
	    Search = new Pattern("images/searchBox.png");
	    menuSpotify = new Pattern("images/menu-spotify.png");
	    logout = new Pattern("images/logout.png");  
		loginError = new Pattern("images/Loginerror.png");
          LoginWithText = new Pattern("images/loginwithText.png");
          PasswordWithText = new Pattern("images/passwordWithText.png");
           top50Search = new Pattern("images/top50serchResult.png");
           countryAlbumSearch = new Pattern("images/countryAlbumResult.png");
          Charts = new Pattern("images/ChartsButton.png");
           PreviousButtonImage = new Pattern("images/PreviousButton.png");
           playButton = new Pattern("images/playButton.png"); 
            playList = new Pattern("images/AddPlaylist.png");
            playListtextBox = new Pattern("images/PlayListTextBox.png");
            PlayListCreate = new Pattern("images/PlayListCreate.png");
            myPlaylist = new Pattern("images/myPlaylist.png");
            button = new Button();
            SongAddButton = new Pattern("images/SongAddInPlaylist.png");
            SongAddCheck = new Pattern("images/SongAddCheck.png");
             screen = new Screen(); 
             features = new features();
             Search = new Pattern("images/searchBox.png");
          
            
		}
	

}
