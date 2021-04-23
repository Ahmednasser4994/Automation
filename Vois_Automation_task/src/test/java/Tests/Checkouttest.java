package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CheckoutPage;
import Pages.Homepage;
import Pages.Usersigninpage;

public class Checkouttest extends TestBase
{
	  Homepage Homeobject;
	 Usersigninpage Signinobject;
	CheckoutPage Checkoutobject;

@Test
public void chooseanyproduct()
{

	//To Scroll
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,600)");

	Homeobject =new Homepage(driver);
	Homeobject.Chooseanyproduct();
	
	Checkoutobject = new CheckoutPage(driver);
	Checkoutobject.Proceed_to_Checkout();
	
	Signinobject = new Usersigninpage(driver);
	Signinobject.usersignin();

	Checkoutobject.Proceed_to_Checkout_in_adress();
	Checkoutobject.Proceed_to_Checkout_in_shipping();
	Checkoutobject.Paybycheck();
	Checkoutobject.confirmmyorder();
	Assert.assertEquals(Checkoutobject.Assertforcheckout.getText(), "Your order on My Store is complete.");
	//Assert.assertTrue(Signinobject.AssertforSignin.getText().contains("Your order on My Store is complete."));	
}
}

