package qLiabraryExcercise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class winHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.queenslibrary.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='block-menu-menu-menu-top-links']/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("modalframe-element");// switch to frame
		driver.findElement(By.id("edit-cancel")).click();// click on Proceed without login button
		//Click on Contact Information form
		driver.findElement(By.xpath(".//*[@id='request-info']/legend/a")).click();
		//Type First name, last name ..... in the all fields
		driver.findElement(By.className("form-text ")).sendKeys("Mohammed");
		driver.findElement(By.name("contact_info[last_name]")).sendKeys("Hasan");
		//type phone # in the all fields
		driver.findElement(By.id("edit-contact-info-phone")).sendKeys("7185315832");
		driver.findElement(By.id("edit-contact-info-mobile-phone")).sendKeys("9175322312");
		
		//Type e-mail address in the fields
		driver.findElement(By.name("contact_info[email]")).sendKeys("nobonil360@gmail.com");
		driver.findElement(By.className("form-text required")).sendKeys("nobonil360@gmail.com");
		//Select Radio Button
		driver.findElement(By.name("contact_info[request_for]")).click();
		
		//Select an option from the drop down 
		Select objCategory= new Select(driver.findElement(By.name("request_info[category_dropdown]")));
		objCategory.selectByVisibleText("Customer Account Question");
		//objCategory.selectByIndex(1);	  
		//objCategory.selectByValue("2934");	
		
		driver.quit();
		driver.close();
	}
}
