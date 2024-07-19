package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class orangehrmsteps 
{
	WebDriver driver;
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("I am at the Login page")
	public void i_am_at_the_login_page() throws InterruptedException {
		
		 driver=DriverFactory.getDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(4000);
	    
	}

	@When("user enter username {string}")
	public void user_enter_username(String uname) {
		homepage.enterUSerName(uname);
	    
	}

	@When("enter password {string}")
	public void enter_password(String pwd) {
		homepage.enterPassword(pwd);
	    
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
	    homepage.submitButton();
	}

	@Then("user should be able land on Dashboard")
	public void user_should_be_able_land_on_dashboard() 
	{

	    boolean isDisplayed = homepage.verifyLogo();
	    Assert.assertEquals(isDisplayed, true);
	}


}
