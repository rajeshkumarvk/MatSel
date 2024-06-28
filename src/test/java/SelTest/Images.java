package SelTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {
  @Test
  public void img() {
	  //Test Webdriver setup
	  WebDriver driver;

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		
		driver.get("https://www.gsmarena.com/nokia-phones-1.php");
		
		List<WebElement> imgcount = driver.findElements(By.xpath("//img"));
		
		for(int i=0; i<imgcount.size(); i++) {
			
			String img = imgcount.get(i).getAttribute("title");
			
			System.out.println(img);
			}
		System.out.println(imgcount.size());
  }
}
