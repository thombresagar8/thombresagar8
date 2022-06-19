package com.saucedemo.TestClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.saucedemo.POMclass.Loginpage;

public class Testbaseclass {
	WebDriver driver;  // globaly declared
   Logger log;

@BeforeMethod
public void setUpMethod()

{
	log = Logger.getLogger("saucedemo");
	PropertyConfigurator.configure("log4j.properties");
	
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
 log.info("chrome browser is open");

//else if(browsername.equals("firefox"))
//{ 
//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
 //log.info(" firefox is open");
//}

	

	
		driver= new ChromeDriver();
		log.info("browser is open");
		driver.manage().window().maximize();
 		driver.get("https://www.saucedemo.com/");
 		log.info(" sauce demo url is open");
 		log.info("URL is opened");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		
 		//login to page
 		Loginpage lp = new Loginpage(driver);
 		lp.sendusername();
 		log.info("Username Entered");
 		
 		lp.sendpassword();
 		log.info("Password Entered");
 		
 		lp.sendloginbutton();
 		log.info("Login button is clicked ");
       }
	
	
	
	@AfterMethod
 	public void tearDownMethod()
 	{
 		driver.quit();
 		log.info("Browser is closed");
 	}
	

		
}