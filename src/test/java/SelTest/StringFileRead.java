package SelTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringFileRead {
	
	
	
	public String filepath2="./test1.txt.txt";
	
	

	
		
  @Test
  public void readstring() throws FileNotFoundException {
	 
		String url = strobj(filepath2);
		
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	
	driver.navigate().to(url);
	 
	
	  
  }
  	
    //File path location
  
  

public String strobj(String path1) throws FileNotFoundException 
  {
	  //Initialize string object to null
	  
	String str =null;
	  
	 	  //File reader using File into com language
	  
   File file1 = new File(path1);
   
   Scanner sc = new Scanner(file1);
	  
   while(sc.hasNextLine())

	str =sc.nextLine();
	  	  		  
	return str;
	  
  }



@Test
public Map<String, String> getSensorValue(){

// Creating an empty HashMap 
 Map<String, String> sensorvalues = new HashMap<>(); 

    sensorvalues.put("url1", "https://www.google.com"); 
    sensorvalues.put("url2", "https://www.gmail.com"); 
  
          
  
  
// Displaying the HashMap 
  System.out.println("Initial Mappings are: " + sensorvalues);

 return(sensorvalues);
}



public  Map<String, String> iterateUsingForEachIteration(Map<String, String> map) {
	
	Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
	
	while(iterator.hasNext()) {
		Map.Entry<String, String> entry = iterator.next();
		String key = entry.getKey();
		String value = entry.getValue();
		System.out.println("Key=" + key + ", Value=" + value);
		
	}
	return map;
	
}


}


