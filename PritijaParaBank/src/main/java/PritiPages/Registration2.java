package PritiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration2 
{
	 @FindBy(xpath="//input[@name='customer.firstName']") private WebElement FName;
	  @FindBy (xpath="//input[@name='customer.lastName']")private WebElement LName;
	  @FindBy(xpath="//input[@name='customer.address.street']") private WebElement add;
	  @FindBy(xpath="//input[@name='customer.address.city']") private WebElement city;
	  @FindBy(xpath="//input[@name='customer.address.state']") private WebElement state;
	  @FindBy(xpath="//input[@name='customer.address.zipCode']")private WebElement zip;
	  @FindBy(xpath="//input[@name='customer.phoneNumber']")private WebElement Phone;
	  @FindBy(xpath="//input[@name='customer.ssn']") private WebElement SSN;
	  @FindBy(xpath="//input[@name='customer.username']") private WebElement UN;
	  @FindBy(xpath="//input[@name='customer.password']")private WebElement PWD;
	  @FindBy(xpath="//input[@name='repeatedPassword']") private WebElement CPWD;
	  @FindBy(xpath="//input[@value='Register']") private WebElement Register;
	  @FindBy(xpath="(//p)[3]") private WebElement verifyaccountmsg;
	   
				public Registration2(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
				
				//usage
				public void setfname(String Fname)
				{
					FName.sendKeys(Fname);
				}
				public void setLname(String Lname)
				{
					LName.sendKeys(Lname);
				}
				public void setAdd(String Address)
				{
					add.sendKeys(Address);
				}
				public void setcity( String City)
				{
					city.sendKeys(City);
				}
				public void setstate(String State)
				{
					state.sendKeys(State);
				}
				public void setzip(String Zip)
				{
					zip.sendKeys(Zip);
				}
				public void setphone(String PhoneNo)
				{
					Phone.sendKeys(PhoneNo);
				}
				public void setssn(String ssn)
				{
					SSN.sendKeys(ssn);
				}
				
				public void setuname(String username)
				{
					UN.sendKeys(username);
				}
				public void setpwd(String password)
				{
					PWD.sendKeys(password);
				}
				public void setcpwd(String Cpassword)
				{
					CPWD.sendKeys(Cpassword);
				}
				public void ClickRegisterBtn() 
				{
					Register.click();
				}
				 public String Verifyaccountopened()
					{
						String actual = verifyaccountmsg.getText();
						return actual;
						}
					}
						
				 
		
					