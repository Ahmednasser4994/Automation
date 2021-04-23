package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {


	public static WebDriver driver ;

	@BeforeSuite
	public void Startdriver ()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
       driver.get("http://automationpractice.com/index.php");
	}
	@AfterSuite
	public void Stopdriver ()
	{
		driver.quit();	
	}

}

