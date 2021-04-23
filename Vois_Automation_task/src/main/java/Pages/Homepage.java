package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase 
{

	public Homepage(WebDriver driver) {
		super(driver);
		Action = new Actions(driver);
	  }
 
	//Annotation 
	@FindBy(linkText = "Sign in")
	WebElement Registerlink ;
	
	//Products in homepage
	@FindBy(linkText = "Blouse")
	WebElement Chooseproduct ;
	
	@FindBy(id = "add_to_cart")
	WebElement Addtocart ;
	
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement Proceedtocheckout ;
	
	
	public void OpenRegisterSigninPage()
	
	{
		Registerlink.click();
		//ClickButton(Registerlink);
		
	}
	
	public void Chooseanyproduct()
	{
		Chooseproduct.click();
		Addtocart.click();
		Proceedtocheckout.click();
		
	}
	

}
