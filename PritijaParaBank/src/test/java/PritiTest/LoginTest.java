package PritiTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.Baseclass;
import PritiPages.LoginPage;

public class LoginTest {
	 
		WebDriver driver;
		LoginPage login;
		Baseclass base;
		
		@BeforeClass
		public void OpenchromeBrowser()
		{
			base=new Baseclass();
			driver=base.OpenBrowser();
		}
		@Test
		public void Login()
		{
		   login =new LoginPage(driver);
			login.setLoginPageUsername();
			
			login.setLoginPagePassword();
			login.clickLoginButton();
			System.out.println("Login done sucessfully");
		
			String exp="Accounts Overview";
			Assert.assertEquals(login.verifyAccount(), exp);
			}
		
		@AfterClass
		public void ClosechromeBrowser()
		{
		  base.CloseBrowser(driver);	
		}
	}


