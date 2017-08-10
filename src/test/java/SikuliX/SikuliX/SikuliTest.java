package SikuliX.SikuliX;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.*;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestContext;
import org.sikuli.script.Region;
import org.sikuli.script.Match;
import org.junit.Assert;
import org.junit.Before;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.sikuli.script.Button;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import SikuliX.SikuliX.features;
import SikuliX.SikuliX.Assertions;

@RunWith(DataProviderRunner.class)

public class SikuliTest extends Assertions{
	
	private static features features;
	private static Screen screen;
	private static Button button;
    private static patterns p;
  
   
    
    
	static {
	
           screen = new Screen(); 
		     features = new features();
     
		}
	

	@Before 
	public void  OpenApplication() {
		
		 App.open("/Applications/Spotify.app");
	}
	
	
    @Test   
    public void testLogin() throws FindFailed {   

    	features.Login("neeshpal@gmail.com");
       Assert.assertTrue(ensureExists(patterns.Search));
       features.Logout();
     }
    
    @Test   
    public void testFailedLogin() throws FindFailed {   
   	 
    	features.Login("neeshpal123@gmail.com");
    	Assert.assertTrue(ensureExists(patterns.loginError));

     }
    
   
    
    @Test
    @UseDataProvider("data")
    public void searchScenarios(String s, Pattern p) throws FindFailed, InterruptedException {   
        
    	screen.click(patterns.LoginWithText);
    	
    	features.Login("neeshpal@gmail.com");
       screen.wait(patterns.Charts, 5000);
       screen.click(patterns.Search);
       screen.type(s);
       screen.type(Key.ENTER);
       TimeUnit.SECONDS.sleep(3);
       try{
       Assert.assertTrue(ensureExists(p));
       }finally{
   
    	   features.Logout();

         }
       }

    @Test   
    public void TestPlaySong() throws FindFailed, InterruptedException, AWTException {   
   
   	features.Login("neeshpal@gmail.com");
    screen.wait(patterns.Charts, 5000);
   	screen.click(patterns.Search); 
   	features.Clear();
    screen.type("Today Hits");
    screen.type(Key.ENTER);

    TimeUnit.SECONDS.sleep(5);
    screen.click(patterns.PreviousButtonImage);

    screen.click(patterns.playButton);
    
   	Region Playedregion = new Region(372,796, 40, 25);
   	Playedregion.hover();
   	
   	TimeUnit.SECONDS.sleep(12);

   	Robot myRobot = new Robot();
   	 int c = myRobot.getPixelColor(412,807).getRGB();
   	System.out.print(c);

   try{
	   Assert.assertEquals(c,-11755456);
   } finally {
   	TimeUnit.SECONDS.sleep(2);
   	features.Logout();
   }
     }
    
    
 @Test   
 public void TestPlayList() throws InterruptedException , FindFailed {
	
	    features.Login("neeshpal@gmail.com");
	    screen.wait(patterns.Charts, 5000);
	    screen.click(patterns.playList);
	    screen.click(patterns.playListtextBox);
	    //screen.type("a", KeyModifier.CMD);
	    features.Clear();
	    screen.type("my playlist");
	    screen.click(patterns.PlayListCreate);
	    
	    TimeUnit.SECONDS.sleep(2);
	    
	    screen.wait(patterns.myPlaylist, 5000);
	    screen.click(patterns.myPlaylist);
	    
	 Region RegionForScroll = new Region(571,457, 10, 10);
	   TimeUnit.SECONDS.sleep(2);
	   
	 screen.wheel(RegionForScroll, Button.WHEEL_UP, 5);
	 screen.click(patterns.SongAddButton);
	 
	try{
		Assert.assertTrue(ensureExists(patterns.SongAddCheck));
	} finally {
	 TimeUnit.SECONDS.sleep(2);
	   	features.Logout();
	}
	 
	 
 }


	@DataProvider
    public static Object[][] data() {
        
        return new Object[][] {
                { "US Latin Top 50",patterns.top50Search},
                {"latest country album",patterns.countryAlbumSearch}
                
              
        };
        
    }
	

}
