package SelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
  @Test
  public void Navi() throws InterruptedException {
	  
	  WebDriver driver;	  
	  WebDriverManager.firefoxdriver().setup();
	  
	  driver = new FirefoxDriver();
	  
	 driver.get("https://www.google.co.in");
	 
	 String url1 =driver.findElement(By.linkText("Gmail")).getAttribute("href");
	 
	 System.out.println ("The link is " +url1);
	 
	 //Tooltip
	 
	 driver.get("https://www.flipkart.com");
	 
	 String url2 =driver.findElement(By.partialLinkText("Login")).getAttribute("title");
	 
	 System.out.println ("The tool tip is " +url2);
	 
	 //Get phone number of Bangalore
	 
	 driver.get("https://www.irctc.com/contact.html");
	 
	 String url3 =driver.findElement(By.linkText("South Zone")).getAttribute("href");
	 
	 
	 
	 System.out.println ("The link  is " +url3);
	 
	  
	  driver.get("https://online.actitime.com/rkumar1/login.do");
	  
	  WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	  
	  username.sendKeys("rajesh.heggade@gmail.com");
	  				 	 
	  WebElement passwd = driver.findElement(By.xpath("//input[@name='pwd']"));
	  
	  passwd.sendKeys("June123");
	  
	 	 	  
	  String text = passwd.getAttribute("value");
	  
	  System.out.println (text);
	  
	  WebElement login = driver.findElement(By.xpath("//div[contains(text(), 'Login')]/preceding::a[@id='loginButton']"));
	  login.click();
	  
	  System.out.println("Successfully logged in");
	  
	  Thread.sleep(5000);
	  
	  while(true) {
		  	  
		  try{
			  
			  driver.findElement(By.xpath("//div[@id='logo_aT']/following::a[@id='logoutLink'][2]")).click();
			  
			  System.out.println("Successfully logged out");
			  break;
		  }
			  
		  
		  catch(NoSuchElementException e){
			  
		  }
	  
	  
	/*  WebElement username =driver.findElement(By.xpath("//input[@name='username']"));

	  username.sendKeys("rajesh.heggade@gmail.com");
	  username.clear();
	  Thread.sleep(5000);
	  username.sendKeys("rajesh.heggade@gmail.com");
	  
	  
	  WebElement password =driver.findElement(By.xpath("//input[@name='pwd']"));

	  password.sendKeys("June123");
	  password.clear();
	  Thread.sleep(5000);
	  password.sendKeys("June123");
	  
	  String text = password.getAttribute("value");
	  System.out.println (text);

	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//input[@name='pwd']/following::div[contains(text(),'Login')][1]")).click();
	  
	//div[@id='logo_aT']/following::a[contains(text(),'Logout')][2]
	  while(true)
	  {
	  try
	  {
	  driver.findElement(By.xpath("//div[@id='logo_aT']/following::a[contains(text(),'Logout')][2]")).sendKeys(Keys.ENTER);
	  break;
	  }
	  catch(NoSuchElementException e)*/
	  {
	  }
	  }

	  
	//  Thread.sleep(5000);
	  
	  
	/*  String url = driver.getCurrentUrl();
	  
	  System.out.println(url);*/
	  
		/*
		 * if(url.contains("google.co.in")) {
		 * 
		 * System.out.println ("Google.com navigated to google.co.in successfully"); }
		 * 
		 * else { System.out.println ("Google.com is not navigated to google.co.in"); }
		 */
	  
/*	 driver.close();
  }*/
	  
	  driver.close();
}
  
 
}
