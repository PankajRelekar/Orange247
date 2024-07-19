package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class apphooks
{
	
	WebDriver driver;
	 
	 @Before
	 public void launchBrowser()
	 {
	  DriverFactory df= new DriverFactory();
	   driver=df.initBrowser("Chrome");
	  driver.manage().window().maximize();
	    
	 }
	 
	 @After
	 public void tearDown()
	 {
	  driver.quit();
	 }

}
