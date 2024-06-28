package SelTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	
  
  @Test( priority = 2)
     
  public void linkstr() throws InterruptedException {
	  
	  
	  
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	  
	  
	  
	  driver.get("http:\\www.google.com") ;
	 
	  List<WebElement> alllinks =driver.findElements(By.xpath("//a"));
	  
	  int countlinks= alllinks.size();
	 
	  System.out.println(countlinks);
	  
	  int j =0;
	  
	  
	  
	  for(int i =0 ;i <countlinks ;i++){
	  
		  WebElement link = alllinks.get(i);
	  
		  String linktext = link.getText();
		  
 		  
		int linksize =linktext.length();
		  
		 
		  
	   System.out.println(linktext);
	   	  
		
		  if(linksize >0){
		  
		  j+= 1 ;
		  
		  System.out.println(j);
	//	  System.out.println(linktext); }
		 
	  }
	  
	  
  
	  
	  
  
	  Reporter.log("Login test pass");
	  
	  }
	  
  }
  
  @Test( priority = 1)
  
  public void linkstr01() throws InterruptedException {
	  
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	  
	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  
	  List<WebElement> chbox =driver.findElements(By.xpath("//input[@type='checkbox']")) ;
	 
	  //Select the check box
	
	  for(int i=0 ; i <chbox.size(); i++)
	  {
	 
		  chbox.get(i).click();
	  }
	  
	  //Deselect the checbox using foreach
	 
		
		  for(WebElement chbox1:chbox){
		  
		  chbox1.click(); }
		 
	  
	  Thread.sleep(5000);
	
	  
  }
  
  }
  

