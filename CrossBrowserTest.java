package qLiabraryExcercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest {
// Cross Browser Test using TestNG framework
	
	public static void main(String[] args) throws InterruptedException {
		//Test environment: FireFox Browser version 46.0.1 Selenium-java version 2.53.0
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.queenslibrary.org/contact-us ");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.quit();
		driver.close();
		
		/*//Chrome Driver execution, Version 67.0.3396.99 (Official Build) (64-bit)
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ZIHAAN63\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.queenslibrary.org/contact-us ");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.quit();
		driver.close();
		
		
		//Interner Explorer 11; version: 11.0.9600.18499
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ZIHAAN63\\Desktop\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.queenslibrary.org/contact-us ");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.quit();
		driver.close();*/
	}
}

