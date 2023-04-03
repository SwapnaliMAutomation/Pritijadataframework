package PritiTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.Baseclass;
import PritiPages.HomePage;
import PritiPages.LoginPage;
import PritiPages.Registration;

public class RegistrationTest
{
	
		 WebDriver driver;
		 LoginPage Login;
		 HomePage Home;
		 Registration reg;
		 Baseclass base;
			
		  @BeforeClass
		  public void Openbrowser() 
		  {
			  base=new Baseclass();
			  driver=base.OpenBrowser();
			    }
		  @Test
		  public void Register() throws InterruptedException
		  {
			  Thread.sleep(5000);
			  Login=new LoginPage(driver);
			  Login.ClickRegisteButton();
			  
			  reg=new Registration(driver);
			  reg.setfname();
			  reg.setLname();
			  reg.setAdd();
			  reg.setcity();
			  reg.setstate();
			  reg.setzip();
			  reg.setphone();
			  reg.setssn();
			  Thread.sleep(5000);
			  reg.setuname();
			  reg.setpwd();
			  reg.setcpwd();
			  reg.ClickRegisterBtn();
			 Thread.sleep(3000);
			 String exp= "Your account was created successfully. You are now logged in.";
			  
			  //String actual
		 Assert.assertEquals(reg.Verifyaccountopened(), exp);
		 Home=new HomePage(driver);
		 Home.clickLogout();
			    }
		   @AfterClass
		  public void ClosechromeBrowser()
		  {
			  base.CloseBrowser(driver);
			 }
	}
  

