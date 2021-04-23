package Pages;

import org.checkerframework.checker.signature.qual.SignatureBottom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Usersigninpage extends PageBase 
{

	public Usersigninpage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(name = "email")
	WebElement Signinmail;
	
	@FindBy(name = "passwd")
	WebElement signinpassword;
	
	@FindBy(name = "SubmitLogin")
	WebElement signinbutton;
	
	
	public @FindBy (className = "info-account")
	WebElement AssertforSignin;
	
	public void usersignin()
	{
		
		Signinmail.sendKeys("Ahmed@gmail.com");
		signinpassword.sendKeys("P@ssw0rd");
		signinbutton.click();
		
	}

}
