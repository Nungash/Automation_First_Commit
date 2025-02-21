package testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {
public WebDriver driver;

	@BeforeClass
	public void setup()  {
	driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://tutorialsninja.com/demo/");// reading url from properties file.
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		
	}

}
