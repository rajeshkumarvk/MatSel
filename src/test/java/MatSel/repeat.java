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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class repeat {
	
	//public JSONObject testdata;
	
	public String filepath1 = "./test1.txt.txt";
	
	//String filepath = "./test.json.txt";
	 
  @Test
  public void testrepeat() throws IOException, ParseException {
	 
	  
	 // testdata= jsonreader(filepath);
	  
	  String url =str(filepath1);
	  
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  //driver.get(testdata.get("url 1").toString());
	  
	  driver.get(url);
	  
	  System.out.println(url);
  }
  
  /*public JSONObject jsonreader(String path) throws IOException, ParseException {
	  
	  JSONObject Jobj = null;
	  
	  //Create Json parser object
	  
	 JSONParser Jpar= new JSONParser();
	  
	  //Read the file in com language using FileReader
	  
	  FileReader file = new FileReader(path);
	  
	  //Convert the file into Json readable format using json parser 
	  
	  Jobj=(JSONObject) Jpar.parse(file);
	  
	return Jobj;
	  
  } .*/
  
  public String str(String path1) throws FileNotFoundException {
	  
	  // initialise string obj with null;
	  
	 String st1 = null;
	 
	 //Use Filereader to read the file 
	 
	 File f1 = new File(path1);
	 
	 // To scan the contents of file
	 
	 Scanner sc = new Scanner(f1);
	 
	 //To read and return the contents of the file
	 
	 while(sc.hasNextLine()) 
		 
		 st1= sc.nextLine();
	 	   
	return st1;
	  
  }
}
