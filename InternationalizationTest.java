package sumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

public class InternationalizationTest {
	

	public void selectLang() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.queenslibrary.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		WebElement dropdownlang = driver.findElement(By.id("language-select-list"));
		Select langMenu = new Select(dropdownlang);
		
		/*Thread.sleep(3000);
		langMenu.selectByIndex(3);
		
		Thread.sleep(3000);
		langMenu.selectByValue("2");*/
		
		Thread.sleep(3000);
		langMenu.selectByVisibleText("English");
		
	}
	

	
	
	
		
	
		
		
		
		
		
		/*FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("language-select-list", "cn");
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.queenslibrary.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
	}


