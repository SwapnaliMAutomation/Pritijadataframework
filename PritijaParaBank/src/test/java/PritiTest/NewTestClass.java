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
import PritiPages.HomePage;
import PritiPages.LoginPage;
import PritiPages.Registration;
import PritiPages.Registration2;

public class NewTestClass
{
	       WebDriver driver;
			Registration2 R;
			HomePage home;
			LoginPage Login;
			Baseclass Base;
			@BeforeClass
			public void OpenBrowser() {
				Base=new Baseclass();
				driver=Base.OpenBrowser();
			}
			@DataProvider
			public Object[][] getData() throws IOException {
				ExcelReaderpritija E = new ExcelReaderpritija();
				Object[][] data = E.gettestdata();
				return data;
			}
			@Test(dataProvider = "getData") 
			public void UserRegistration(String Fname,String Lname,String Address,String City,String State,String Zip,String PhoneNo,String ssn,String username,String password,String Cpassword) throws InterruptedException {
				Login = new LoginPage(driver);
				Login.ClickRegisteButton();
				
				R = new Registration2(driver);
				R.setfname(Fname);
				R.setLname(Lname);
				R.setAdd(Address);
				R.setcity(City);
				R.setstate(State);
				R.setzip(Zip);
				R.setphone(PhoneNo);
				R.setssn(ssn);
				Thread.sleep(3000);
				R.setuname(username);
				R.setpwd(password);
				R.setcpwd(Cpassword);
				R.ClickRegisterBtn();
				Thread.sleep(4000);
				
		 String exp= "Your account was created successfully. You are now logged in.";
				   Assert.assertEquals(R.Verifyaccountopened(), exp);
				   home = new HomePage(driver);
				   home.clickLogout();
			 }
			@AfterClass
			public void CloseBrowser() {
				Base.CloseBrowser(driver);
			}
				
			}
  

