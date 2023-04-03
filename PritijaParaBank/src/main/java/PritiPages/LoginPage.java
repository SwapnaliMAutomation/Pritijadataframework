package PritiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
		String actual;
		@FindBy(xpath="//input[@name='username']") private WebElement username;
		@FindBy(xpath="//input[@name='password']") private WebElement password;
		@FindBy(xpath="//input[@type='submit']") private WebElement loginbtn;
	    @FindBy(xpath="//a[text()='Forgot login info?']") private WebElement forgotlogininfo;
		@FindBy(xpath="//a[text()='Register']") private WebElement register;
		//@FindBy(xpath="//h1[@class='title']") private WebElement verifyacc;
		@FindBy(xpath="//h1[text()='Accounts Overview']") private WebElement verifyacc;
		@FindBy(xpath="//a[text()='Log Out']") private WebElement loginbutton;
		
		//initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public void clickRegister()
		{
			register.click();
		}
		public void setLoginPageUsername() 
		{
			username.sendKeys("PritijaP@678678");
			}
		public void setLoginPagePassword()
		{
	        password.sendKeys("Hello789");
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
			loginbutton.click();
		}
		
		
		 public void ClickRegisteButton()
			{
				register.click();
			}

			
		}


