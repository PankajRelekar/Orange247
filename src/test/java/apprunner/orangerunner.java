package apprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(
		features = {"src\\test\\resources\\uiappfeature\\loginorangehrm24.feature"},
		glue= {"uiappfeature","hooks"},
	    plugin= {"pretty"},
		publish=true
		
				
		
		
		)


public class orangerunner extends AbstractTestNGCucumberTests {
	
	
	

}
