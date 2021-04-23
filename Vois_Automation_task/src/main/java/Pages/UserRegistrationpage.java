package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//Inheritance 
public class UserRegistrationpage extends PageBase 
{

	
	public UserRegistrationpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="email_create")
	WebElement Insertemail;
	
	@FindBy(id ="SubmitCreate")
	WebElement ClickonCreateanaccount;
	
	@FindBy(id = "uniform-id_gender1")
	WebElement GenderRadiobuttonm;
	
	@FindBy(id = "uniform-id_gender2")
	WebElement GenderRadiobuttonf;
	
	@FindBy (id = "customer_firstname")
	WebElement Firstname;
	
	@FindBy (id = "customer_lastname")
	WebElement Lastname;
	
    @FindBy (id = "passwd")
	WebElement RegisterPassword;

	@FindBy (id = "days")
	WebElement Registerbirthday;
	
	@FindBy (id = "months")
	WebElement Registerbirthmonth;
	
	@FindBy (id = "years")
	WebElement Registerbirthyear;
	
	@FindBy (id = "newsletter")
	WebElement RegisterNewslettercheckin;
	
	@FindBy (id = "optin")
	WebElement Registerspecialoffercheckin;
	
	@FindBy (id = "company")
	WebElement Adresscompany;
	
	@FindBy (id = "address1")
	WebElement Adress1;
	
	@FindBy (id = "address1")
	WebElement Adress2;
	
	@FindBy (id = "city")
	WebElement Adresscity;
	
	@FindBy (id = "id_state")
	WebElement Adressstate;
	
	@FindBy (id = "postcode")
	WebElement Adresspostalcode;
	
	@FindBy (id = "id_country")
	WebElement Adresscountry;
	
	@FindBy (id = "other")
	WebElement AdressAdditionalinfo;
	
	@FindBy (id = "phone")
	WebElement Adresshomephone;
	
	@FindBy (id = "phone_mobile")
	WebElement Adressmobilephone;
	
	@FindBy (id = "alias")
	WebElement Refrenceadress;
	
	@FindBy (id = "submitAccount")
	WebElement Registersubmitbutton;
	
	public @FindBy (className = "info-account")
	WebElement AssertforRegistration;
	
	public void UserRegistration()
	{
		
		Insertemail.sendKeys("Ahmed4994@gmail.com");
		ClickonCreateanaccount.click();
		GenderRadiobuttonm.click();
		Firstname.sendKeys("Ahmed");
		Lastname.sendKeys("Nasser");
		RegisterPassword.sendKeys("P@ssw0rd");
		select = new Select(Registerbirthday);
		select.selectByValue("9");
		select = new Select(Registerbirthmonth);
		select.selectByValue("8");
		select = new Select(Registerbirthyear);
		select.selectByValue("1994");
		RegisterNewslettercheckin.click();
		Registerspecialoffercheckin.click();
	    Adresscompany.sendKeys("VOIS");
		Adress1.sendKeys("3 Masr Elgdida");
		select = new Select(Adressstate);
		Adresscity.sendKeys("Cairo");
		select.selectByVisibleText("Alaska");
		Adresspostalcode.sendKeys("02222");
		select = new Select(Adresscountry);
		select.selectByVisibleText("United States");
		AdressAdditionalinfo.sendKeys("Automate the registration");
		Adresshomephone.sendKeys("263867");
		Adressmobilephone.sendKeys("011257240");
		Refrenceadress.sendKeys(" Wazir street");
		Registersubmitbutton.click();
		
		
	}

	
}
