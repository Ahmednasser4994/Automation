package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase
{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement Proceed_to_Checkout ;
	
	@FindBy(name = "processAddress")
	WebElement Proceed_to_Checkout_in_adress ;
	
	@FindBy(className = "form-control")
	WebElement Insertcomment ;
	
	@FindBy(id = "cgv")
	WebElement Mark_on_term_of_service ;
	
	@FindBy(name = "processCarrier")
	WebElement Proceed_to_Checkout_in_shipping;
	
	
	@FindBy(className = "cheque")
	WebElement paybycheck;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirmmyorder;
	
	public @FindBy (xpath = "//*[@id=\"center_column\"]/p[1]")
	WebElement Assertforcheckout;
	
	
	

	public void Proceed_to_Checkout()
{
Proceed_to_Checkout.click();

	}

public void Proceed_to_Checkout_in_adress()
   {
	Insertcomment.sendKeys("Automation for Vois Assessment");
    Proceed_to_Checkout_in_adress.click();

	}

public void Proceed_to_Checkout_in_shipping()
{
	Mark_on_term_of_service.click();
	Proceed_to_Checkout_in_shipping.click();
}
public void Paybycheck()
{
	paybycheck.click();
}

public void confirmmyorder()
{
	confirmmyorder.click();
}



}