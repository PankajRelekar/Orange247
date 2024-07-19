package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement submit;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logo;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		
	}
	
	
	public void enterUSerName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	
	public void submitButton()
	{
		submit.click();
	}
	
	public boolean verifyLogo()
	{
		boolean logovisible = logo.isDisplayed();
		
		return logovisible;
	}

}
