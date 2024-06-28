package MatSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Loginpage extends utilities{
	
		
	 public void validatelogintogoogle(String url1) {

		 
		 
		 WebDriver driver;	  
		  WebDriverManager.firefoxdriver().setup();
		  
		  driver = new FirefoxDriver();
		  
		 driver.get(url1);
		 
		  url1 =driver.findElement(By.linkText("Gmail")).getAttribute("href");
		 
		 System.out.println ("The link is " +url1);
		 
		 driver.close();
		 
	 }

	 
	 
    public void validatelogintogmail(String anyurliwilltake) {
		 
		 WebDriver driver;	  
		  WebDriverManager.firefoxdriver().setup();
		  
		  driver = new FirefoxDriver();
		  
		 driver.get(anyurliwilltake);
		 
		 driver.close();
		 
		// String url1 =driver.findElement(By.linkText("Gmail")).getAttribute("href");
		 
		// System.out.println ("The link is " +url1);
		 
	 }

 
 
   public void validatelogintofacebook(String path1) {
	 
	 WebDriver driver;	  
	  WebDriverManager.firefoxdriver().setup();
	  
	  driver = new FirefoxDriver();
	  
	 driver.get(path1);
	 
	// String url1 =driver.findElement(By.linkText("Gmail")).getAttribute("href");
	 
	// System.out.println ("The link is " +url1);
	 driver.close();
	 
 }

 
   public void chxbx(String url4, String xpath) throws InterruptedException {

		WebDriver driver;

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get(url4);

		List<WebElement> b1 = driver.findElements(By.xpath(xpath));

		// b1.click();

		for (int k = b1.size() - 1; k >= 0; k--) {
			
			Thread.sleep(5000);
			
		//	b1.get(k).click();
			
			b1.get(0).click();
			
			b1.get(b1.size()-1).click();
			
		}
		driver.close();
}

  
   public void Images(String junk, String xpath) {
	   
	   WebDriver driver;
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   
	   driver.get(junk);
	   
	   List<WebElement> imgs = driver.findElements(By.xpath(xpath));
	   
	  int imgscount = imgs.size();
	      
	   for(int i = 0; i<=imgscount; i++) {
		   
		   String imgdetails = imgs.get(i).getAttribute("title");
		   
		   System.out.println(imgdetails);
		   
		   
		   
	   }
	   driver.close();
	   
	   
   }

   public void Gcount(String junks, String xpath) {
	   
	   WebDriver driver;
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   
	   driver.get(junks);
	   
	   List<WebElement> glinks= driver.findElements(By.xpath(xpath));
	   
	   int gc= glinks.size();
	   
	   System.out.println(gc);
	   
	   int j=0;
	   for(int i =0; i<gc; i++) {
		   
		   
		 WebElement glink  = glinks.get(i);
		 
		 String gtext = glink.getText();
		   
		int gnc= gtext.length();
		 
		 if(gnc>0) {
			 
			 j+=1;
			 
			 System.out.println(gtext);
			 
			 System.out.println(j);
			 
		 }
		 
		
	   }
	   
	   driver.close();
   }

   public void dropd(String dp1, String xpath) {
	   
	   WebDriver driver;
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
   
	   driver.get(dp1);
	   
	   WebElement el = driver.findElement(By.xpath(xpath));
	   
	   Select sel = new Select(el);
	   
	   int countl= sel.getOptions().size();
	   
	   for (int i=0; i<countl; i++) {
		   
		   System.out.println(sel.getOptions().get(i).getText());
		   
		   
	   }
 
	   
	   
   }

  // public void actlg(String URL, String Username_xpath, String passwd_xpath, String Login_xpath, String Logout_xpath, String Username, String Passwd) throws InterruptedException {
	   
		/*
		 * WebDriver driver; WebDriverManager.firefoxdriver().setup();
		 * 
		 * driver = new FirefoxDriver();
		 * 
		 * driver.get(URL);
		 * 
		 * WebElement user = driver.findElement(By.xpath(Username_xpath));
		 * 
		 * user.sendKeys(Username);
		 * 
		 * WebElement pwd = driver.findElement(By.xpath(passwd_xpath));
		 * 
		 * pwd.sendKeys(Passwd);
		 * 
		 * WebElement logi = driver.findElement(By.xpath(Login_xpath)); logi.click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement ld = driver.findElement(By.xpath(Logout_xpath)); ld.click();
		 */
	   
		/*
		 * navigateToUrl(""); enterUsernameAndPass("", "", "", "" ); loginAndLogut("",
		 * "");
		 */
	   
  // }

  public void navigateToUrl(String URL) {
	  	 
	   
	   driver.get(URL);
  }
  
  
  public void enterUsernameAndPass(String Username_xpath, String passwd_xpath, String Username, String Passwd ) {
	 
   WebElement user = driver.findElement(By.xpath(Username_xpath));
	  
	  user.sendKeys(Username);
	   
	  WebElement pwd = driver.findElement(By.xpath(passwd_xpath));
	  
	  pwd.sendKeys(Passwd);
  }

  public void loginAndLogut(String Login_xpath, String Logout_xpath) throws InterruptedException {
	  
	  
	  WebElement logi = driver.findElement(By.xpath(Login_xpath));
	  logi.click();
	  
	  Thread.sleep(5000);
	  
	  WebElement ld = driver.findElement(By.xpath(Logout_xpath));
	  ld.click();
  }
  
  
}



