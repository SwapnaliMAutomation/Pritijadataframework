package PritiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration 
{
	//decl
		String actual;
	  @FindBy(xpath="//input[@name='customer.firstName']") private WebElement Fname;
	  @FindBy (xpath="//input[@name='customer.lastName']")private WebElement Lname;
	  @FindBy(xpath="//input[@name='customer.address.street']") private WebElement Add;
	  @FindBy(xpath="//input[@name='customer.address.city']") private WebElement city;
	  @FindBy(xpath="//input[@name='customer.address.state']") private WebElement State;
	  @FindBy(xpath="//input[@name='customer.address.zipCode']")private WebElement zip;
	  @FindBy(xpath="//input[@name='customer.phoneNumber']")private WebElement phone;
	  @FindBy(xpath="//input[@name='customer.ssn']") private WebElement ssn;
	  @FindBy(xpath="//input[@name='customer.username']") private WebElement uname;
	  @FindBy(xpath="//input[@name='customer.password']")private WebElement pwd;
	  @FindBy(xpath="//input[@name='repeatedPassword']") private WebElement cpwd;
	  @FindBy(xpath="//input[@value='Register']") private WebElement registerbtn;
	  @FindBy(xpath="(//p)[3]") private WebElement verifyaccountmsg;
	   //init
				public Registration(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
				
				//usage
				public void setfname()
				{
					Fname.sendKeys("Pritija");
				}
				public void setLname()
				{
					Lname.sendKeys("Pandgale");
				}
				public void setAdd()
				{
					Add.sendKeys("Pune");
				}
				public void setcity()
				{
					city.sendKeys("Pune");
				}
				public void setstate()
				{
					State.sendKeys("Maharashtra");
				}
				public void setzip()
				{
					zip.sendKeys("411028");
				}
				public void setphone()
				{
					phone.sendKeys("9822714321");
				}
				public void setssn()
				{
					ssn.sendKeys("111111222222");
				}
				
				public void setuname()
				{
					uname.sendKeys("PritijaP@678678");
				}
				public void setpwd()
				{
					pwd.sendKeys("Hello789");
				}
				public void setcpwd()
				{
					cpwd.sendKeys("Hello789");
				}
				public void ClickRegisterBtn() 
				{
					registerbtn.click();
				}
				 public String Verifyaccountopened()
					{
						actual=verifyaccountmsg.getText();
						return actual;
						}
				 
		
					
}
