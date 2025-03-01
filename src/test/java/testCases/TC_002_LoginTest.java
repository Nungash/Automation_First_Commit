package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass

{

	@Test
	public void verify_login()
	{
		
		try
		{
		//Home page
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		hp.clickLogin();//Login link under MyAccount
	
		
		//Login page
		LoginPage lp=new LoginPage(driver);
	
		lp.setEmail("nungari@gmail.com");
		lp.setPassword("mary1977");
		lp.clickLogin(); //Login button
		
		
		//My Account Page
		MyAccountPage macc=new MyAccountPage(driver);
				
		boolean targetPage=macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
	}
}
