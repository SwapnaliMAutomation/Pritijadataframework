package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
 public WebDriver OpenBrowser() 
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://parabank.parasoft.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
					 
			 return driver;
			 }
				 
			  public void CloseBrowser(WebDriver driver)
				  {
					  driver.quit();
				  }
				  
				  
			}
				  
			


