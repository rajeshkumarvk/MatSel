package SelTest;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsonFileRead {
  public JSONObject testdata;
//File location
  String filepath="./test.json.txt";
  
	@Test
  
  public void readjson() throws IOException, ParseException, InterruptedException {
	  
	  //JSON Object creation to assign to the JSONObject method to execute the path
	   testdata= jobj(filepath);
	  
	   //To Access the chrome browser
	   
	   WebDriver driver;
	   
	   WebDriverManager.chromedriver().setup();
	   
	   driver = new ChromeDriver();
	   
	   //to access the file 
	   driver.get(testdata.get("url3").toString());
	   
	   //Maximizing window
       driver.manage().window().maximize();
       
       WebElement listbox  = driver.findElement(By.xpath("//select[@id='oldSelectMenu']")); 
  
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listbox);
       Thread.sleep(500); 
       
       Select select = new Select(listbox);
      

       select.selectByValue("3");
       
       select.selectByIndex(6);
       
       
       //To get the list of options from the drop down
    
       //Get list of web elements
       List<WebElement> lst = select.getOptions();
       System.out.println(lst.size());
       
       //Looping through the options and printing dropdown options
       
       System.out.println("The dropdown options are:");
       
       for(WebElement options: lst)
    	   
        System.out.println(options.getText());
       
       
      //System.out.println(options.getSize());
       
       
       Thread.sleep(3000);

       
       
       
       
      
       
      
       
     
	
	 	
	  	  
  }
	
	
	  
  public JSONObject jobj(String path) throws IOException, ParseException {
  
  		//Initialise json object with null value
	  
  			JSONObject Obj = null;
  
  		//Create JSON parser object to parse read file
  
  			JSONParser j_parser = new JSONParser();
  
  			//Read the file using ReaderFile in comp language
  
  			FileReader file = new FileReader(path);
  			
  			//Convert File to change to jsonobject
  			
  			Obj = (JSONObject) j_parser.parse(file);
			
  			return Obj;
}
  
}