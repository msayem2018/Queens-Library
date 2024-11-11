package qLiabraryExcercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName){
		
		if (browserName.equalsIgnoreCase("firefox")){
		
			driver= new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chorme.driver", "C:\\Users\\ZIHAAN63\\Desktop\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ZIHAAN63\\Desktop\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		driver.get("http://www.queenslibrary.org/contact-us");
		System.out.println(driver.getTitle());
		
	}

}
