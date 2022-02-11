package test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp{
	public WebDriver driver;

	@FindBy (xpath="//a[text()=\"Sign Up\"]")
	private WebElement signup;
	@FindBy (xpath="//input[@class=\"vs__search\"]")
    private WebElement dropdown;
	
	
	@FindBy (xpath="//*[@id=\"vs1__combobox\"]/div[1]/input")
    private WebElement option;

	public SignUp(WebDriver driver)
	
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void signup()
	{
		signup.click();
	}
	
	public void select()
	{
		dropdown.click();
	}
	public void option()
	{
		
	option.click();
	}
	
	
}
