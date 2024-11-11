package qLiabraryExcercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.ui.Select;

public class Search {
		
		public void SearchItems() {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.queenslibrary.org");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
				
			WebElement ddSearch = driver.findElement(By.id("edit-searchby"));
			Select keyWords = new Select(ddSearch);
			keyWords.selectByIndex(3);
			
			WebElement cateSearch = driver.findElement(By.id("edit-categories"));
			Select selCat = new Select (cateSearch);
			selCat.selectByIndex(6);
			
			WebElement Speclocation = driver.findElement(By.id("edit-loc-filter"));
			Select location = new Select (Speclocation);
			location.selectByVisibleText("Astoria");
			
		}
}
