package PritiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    //declaration
		@FindBy(xpath="//a[text()='Open New Account']") private WebElement openacc;
		@FindBy(xpath="//a[text()='Accounts Overview']") private WebElement accoverview;
		@FindBy(xpath="//a[text()='Transfer Funds']") private WebElement transferfund;
		@FindBy(xpath="//a[text()='Bill Pay']") private WebElement billpay;
		@FindBy(xpath="//a[text()='Find Transactions']") private WebElement findtrans;
		@FindBy(xpath="//a[text()='Update Contact Info']") private WebElement updatecontactinfo;
		@FindBy(xpath="//a[text()='Request Loan']") private WebElement requestloan;
		@FindBy(xpath="//a[text()='Log Out']") private WebElement logout;
		
		

	//initialization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public String SetOpenNewAccount()
		{
			openacc.click();
			return null;
			}
		public void clickLogout()
		{
			logout.click();
		}
		

		}


