package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.UserRegistrationpage;

public class Userregistrationtest extends TestBase
{

	Homepage homeobject;
	UserRegistrationpage registerobject ;
	@Test
	public void userregister ()
	{
		
		homeobject = new Homepage(driver);
		homeobject.OpenRegisterSigninPage();
		
		registerobject = new UserRegistrationpage(driver);
		registerobject.UserRegistration();
		Assert.assertTrue(registerobject.AssertforRegistration.getText().contains("Welcome to your account"));
	}
}
