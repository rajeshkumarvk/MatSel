package SelTest;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import MatSel.Loginpage;
import MatSel.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscript01 {
	
	
	
	
	String filepath ="./test.json.txt"; 
	
	 ExtentSparkReporter extentSparkReporter;
	   ExtentReports extentReports;
	   ExtentTest extentTest;
 
	
	
	   @BeforeTest
	  public void startReporter()
	   {
	       extentSparkReporter  = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extentReport.html");
	       extentReports = new ExtentReports();
	       extentReports.attachReporter(extentSparkReporter);


	       //configuration items to change the look and feel
	       //add content, manage tests etc
	       extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
	       extentSparkReporter.config().setReportName("Test Report");
	       extentSparkReporter.config().setTheme(Theme.STANDARD);
	       extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	   }

	 

	    @Test
	    public void TestLogin() throws IOException, ParseException, InterruptedException {
	    	Loginpage loginpage = new Loginpage();	
	    	JSONObject testdata = loginpage.loadTestData(filepath);	   
		      	
	    			 
	    	loginpage.navigateToUrl(testdata.get("url7").toString());
	    	loginpage.enterUsernameAndPass(testdata.get("USERNAME_XPATH").toString(), testdata.get("PWD_XPATH").toString(), testdata.get("USERNAME").toString(), testdata.get("PWD").toString());
	    	loginpage.loginAndLogut(testdata.get("LOGIN_XPATH").toString(), testdata.get("LOGOUT_XPATH").toString());
	      	extentTest = extentReports.createTest("Login Test Validation Now", "Login test case has passed Now");
	        Assert.assertTrue(true);
	    	
	    }
	 
	    
	    
	    @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            extentTest.log(Status.FAIL,result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            extentTest.log(Status.PASS, result.getTestName());
	        }
	        else {
	            extentTest.log(Status.SKIP, result.getTestName());
	        }
	    }
	    
	    
	    @AfterTest
	    public void tearDown() {
	        //to write or update test information to the reporter
	        extentReports.flush();
	    }
	    
	    
	
}
