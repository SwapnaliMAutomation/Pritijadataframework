package PritiTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Baseclass;
import Excelpritija.ExcelReaderpritija;
import PritiPages.Login2;

public class Login2Test {
	 
	    WebDriver driver;
		Login2 log;
		Baseclass base;
		//Login2 login2;
		
		@BeforeClass
		public void OpenBrowser()
		{
			base=new Baseclass();
			driver=base.OpenBrowser();
		}
		@DataProvider
		public Object[][] getData() throws IOException
		{
			ExcelReaderpritija E=new ExcelReaderpritija();
			Object[][] data= E.gettestdata();
			return data;
		}
		@Test(dataProvider="getData")
		public void Loginuser(String username,String password)
		{
			log=new Login2(driver);
			log.setLogin2Username(username);
			//login2.setLogin2Username();
			log.setLogin2Password(password);
			log.clickLoginButton();
			System.out.println("Login done successfully");
			
			String exp="Accounts Overview";
			Assert.assertEquals(log.verifyAccount(), exp);
			
			log.clickonlogout();
			 
		}
	  @AfterClass
	  public void ClosechromeBrowser()
		{
		  base.CloseBrowser(driver);	
		}
	  
	}


