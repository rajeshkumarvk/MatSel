package SelTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	@Test
	public void chxbx() throws InterruptedException {
            //This is webdriver
		WebDriver driver;

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		List<WebElement> b1 = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// b1.click();

		for (int k = b1.size() - 1; k >= 0; k--) {
			
			Thread.sleep(5000);
			
		//	b1.get(k).click();
			
			b1.get(0).click();
			
			b1.get(b1.size()-1).click();
			
		}

		// for (int i = 0; i < b1.size(); i++) {

		// b1.get(i).click();

		// }

		// De-select the check boxes
//
	//	for (WebElement chxb1 : b1) {
			// chxb1.click();
			// }

		//	driver.get("https://www.geeksforgeeks.org");

			/*
			 * WebElement b2 =
			 * driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
			 * 
			 * b2.click();
			 * 
			 * System.out.println("Button is enabled");
			 */

			// links

			/*
			 * List<WebElement> linkcount = driver.findElements(By.xpath("//a"));
			 * 
			 * int count = linkcount.size();
			 * 
			 * System.out.println("the number of links is " + count);
			 * 
			 * WebElement lk = linkcount.get(1);
			 * 
			 * lk.click();
			 * 
			 * System.out.println("the clicked link is " + lk);
			 * 
			 * 
			 * driver.get("https://online.actitime.com/rkumar1/login.do");
			 * 
			 * WebElement username =
			 * driver.findElement(By.xpath("//input[@name='username']"));
			 * 
			 * if(username.isDisplayed()) {
			 * 
			 * System.out.println("username is displayed"); } else {
			 * System.out.println("username is not displayed"); }
			 * 
			 * if(b2.isEnabled()) { System.out.println("Button is enabled"); } else {
			 * System.out.println("button is not enabled"); }
			 * 
			 * 
			 * if(b1.isSelected())
			 * 
			 * { System.out.println("Check box is selected");
			 * 
			 * } else { System.out.println("Check box is un-selected"); }
			 * 
			 * // driver.close();
			 * 
			 * driver.get("https://www.google.com");
			 * 
			 * List<WebElement> linkgcount = driver.findElements(By.xpath("//a")); int
			 * gcount= linkgcount.size();
			 * 
			 * System.out.println(" The count of google link is " +gcount);
			 * 
			 * // int j=0;
			 * 
			 * for(int i = 0; i<gcount; i++) {
			 * 
			 * WebElement link= linkgcount.get(i);
			 * 
			 * String linktext = link.getText();
			 * 
			 * 
			 * System.out.println(" The link text are  " +linktext);
			 * 
			 * 
			 * int linklength = linktext.length();
			 * 
			 * 
			 * 
			 * if(linklength>0) {
			 * 
			 * j+=1;
			 * 
			 * System.out.println(" The link text are  " +linktext); }
			 * 
			 * 
			 * 
			 * }
			 * 
			 * //System.out.println(j);
			 */ }

		

//	}
}
