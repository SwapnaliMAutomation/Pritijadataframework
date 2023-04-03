package PritiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 
{
	  String actual;
		@FindBy(xpath="//input[@name='username']") private WebElement uname;
		@FindBy(xpath="//input[@name='password']") private WebElement pwd;
		@FindBy(xpath="//input[@value='Log In']") private WebElement loginbtn;
	    @FindBy(xpath="//a[text()='Forgot login info?']") private WebElement forgotlogininfo;
		@FindBy(xpath="//a[text()='Register']") private WebElement register;
		@FindBy(xpath="//h1[@class='title']") private WebElement verifyacc;
		@FindBy(xpath="//a[text()='Log Out']") private WebElement button;
		
		//initialization
		public Login2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void setLogin2Username(String username) 
		{
			uname.sendKeys(username);
			}
		public void setLogin2Password(String password)
		{
	        pwd.sendKeys(password);
		}
		public void clickLoginButton()
		{
			loginbtn.click();
		}
		public String verifyAccount()
		{
			actual=verifyacc.getText();
			return actual;
		}
		public void clickonlogout()
		{
			button.click();
		}
	}
			
		

