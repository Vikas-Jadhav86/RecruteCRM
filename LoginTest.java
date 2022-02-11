package test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	public WebDriver driver;
	@FindBy (xpath="//input[@id=\"sTestEmail\"]")
	private WebElement email;
	
	@FindBy (xpath="//input[@id=\"sTestPassword\"]")
	private WebElement pass;
	
	@FindBy (xpath="//button[@id=\"sTestLoginBtn\"]")
	private WebElement login;
	
	@FindBy (xpath="//*[@id=\"sTest-dpLinkInAppBtn\"]")
	private WebElement profile;
	
	@FindBy (xpath="//*[@id=\"sTest-signOutInAppBtn\"]")
	private WebElement logout;
	
	
	
	
	
	
	
	public LoginTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void sendData()
	{
		email.sendKeys("abc@gmail.com");
		pass.sendKeys("Abc@123");
	}
	public void botton()
	{
		login.click();
	}
	
	public void profileClick()
	{
		profile.click();
	}
	
	public void logout()
	{
		logout.click();
	}

}
