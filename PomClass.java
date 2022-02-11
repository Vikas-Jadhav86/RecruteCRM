package test.maven;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PomClass extends Base {
	
	
	@Test (priority=1, alwaysRun=false)
	public void login() throws InterruptedException
	{
		LoginTest obj = new LoginTest(driver);
	
    obj.sendData();
    Thread.sleep(3000);
    obj.botton();
    
	}
	
	@Test (priority=2, dependsOnMethods="login", alwaysRun=false)
	public void click() throws InterruptedException
	{
		LoginTest obj1 = new LoginTest(driver);
		Thread.sleep(4000);
		obj1.profileClick();
	}
	
	@Test(priority=3, alwaysRun=false)
	public void logout1()
	{
		LoginTest obj2 = new LoginTest(driver);	
		obj2.logout();
	}
	
	@Test(priority=4)
	public void vefifyTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard | Recruit CRM");
	}
	
	
	@Test (priority=5, alwaysRun=true)
	public void signupClick()
	{
		SignUp su = new SignUp(driver);
		su.signup();
	}
	@Test (priority=6, alwaysRun=true)
	public void dropdown() throws InterruptedException
	{
		Thread.sleep(4000);
		SignUp su1 = new SignUp(driver);
		su1.select();
		Thread.sleep(3000);
		su1.option();
	}
	@Test(priority=7)
	public void navigate()
	{
	driver.navigate().back();
	}
	
	
	
	
	
	
	
}
