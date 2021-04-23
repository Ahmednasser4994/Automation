package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Usersigninpage;

public class Usersignintest extends TestBase
{
     Homepage Homeobject;
	Usersigninpage Signinobject;
	 @Test
	public void usersigninsuccessfully()
	{
		 Homeobject =new Homepage(driver);
		Homeobject.OpenRegisterSigninPage();
		//To Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	
		Signinobject = new Usersigninpage(driver);
		Signinobject.usersignin();
		
		Assert.assertTrue(Signinobject.AssertforSignin.getText().contains("Welcome to your account"));	
	}
	
}
