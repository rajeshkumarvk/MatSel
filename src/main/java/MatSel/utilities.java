package MatSel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilities {
	

	public static JSONObject testdata;
	
	
	  WebDriver driver;
	  
	  String filepath ="./test.json.txt"; 
	
	  public utilities() {
	
		 JSONObject testdata;
	// WebDriverManager.chromedriver().setup(); 
	// driver = new ChromeDriver(); }
	  
	  WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver(); 
		 
		 
		 
	  }

	  
 
	 public JSONObject jobject(String path) throws IOException, ParseException {

		  
	  		//Initialise json object with null value
		  
	  		//	JSONObject Obj = null;
	  
	  		//Create JSON parser object to parse read file
	  
	  			JSONParser j_parser = new JSONParser();
	  
	  			//Read the file using ReaderFile in comp language
	  
	  			FileReader file = new FileReader(path);
	  			
	  			//Convert File to change to jsonobject
	  			
	  			testdata = (JSONObject) j_parser.parse(file);
				
	  			return testdata;
	}
	  
	 public JSONObject loadTestData(String path) throws IOException, ParseException {
		 
		 return testdata = jobject(filepath);
		 
	 }
	 
	
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
	 
	 
}
