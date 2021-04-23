package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
     //Driver
    protected WebDriver driver;
    //Dropdown
    public Select select;
    
   //Actions
    public Actions Action;
   
	//Create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	/*protected static void ClickButton(WebElement button)
	{
		button.click();
	}*/

	/*protected static void Settextelement(WebElement textelement,String Value)
	{
		textelement.sendKeys(Value);
	}*/
}
