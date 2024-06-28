package SelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sele {
  @Test
  public void Sel() {
	  
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  
	  driver= new ChromeDriver();
	  
	  driver.get("http://www.google.com");
	
	  driver.navigate().to("http://www.bing.com");
	  
		/*
		 * driver.navigate().to("http://facebook.com");
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.navigate().forward();
		 */
	  
	  String url = driver.getCurrentUrl();
	  
		/*
		 * if(url.contains("bing")) {
		 * 
		 * System.out.println("Back page successfully loaded " +url);
		 * 
		 * if(driver.getCurrentUrl().contains("facebook")) {
		 * 
		 * System.out.println("forward page successfully loaded " +url); } else {
		 * System.out.println("Back page not loaded "); }
		 * 
		 * driver.close(); }
		 */

     String title = driver.getTitle();
     if(title.equals("Bing")) {
    	 System.out.println("Ttile is present " +title);
     }
     else {
    	 System.out.println("Ttile is not present " +title);
     }
  }
}
