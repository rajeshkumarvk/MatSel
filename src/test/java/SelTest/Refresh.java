package SelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh {
  @Test
  public void refresh() throws InterruptedException{  
	  
	  WebDriver driver;
  WebDriverManager.chromedriver().setup();
  
  driver= new ChromeDriver();
  
  driver.get("http://www.google.com");

  driver.navigate().to("http://www.bing.com");
  
  driver.navigate().refresh();
  
  driver.manage().window().maximize();
  
  String title = driver.getTitle();
  
  if(title.equalsIgnoreCase("bing")) {
	  
	  System.out.println("Bing title is present");
  }
  else {
	  System.out.println("Bing title is not present");
  }
    String URL=driver.getCurrentUrl();
  
    System.out.println(URL);
    
  Thread.sleep(5000) ;
   
  driver.close();
  }
}
