package SelTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testselectdropdown {
	


@Test
  public void Sel() throws InterruptedException {
	  
	  WebDriver driver;

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dp = driver.findElement(By.xpath("//*[contains(text(),'Multiselect ')]/following::*[12]"));
		
		WebElement dp1 = driver.findElement(By.xpath("//div[contains(text(),'Blue')]"));
		
		
		dp.click();
		Thread.sleep(5000);
		Actions action = new Actions(driver); 
		

	//	action.moveToElement(dp1).click();
	//	dp1.click();
		Thread.sleep(5000);
		
		
		
		
		 
		 
		
  }
}
