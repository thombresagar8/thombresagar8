package com.saucedemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.Homepage;


public class TC03Homepagefuctionality extends Testbaseclass
{
WebDriver driver;

		@Test 
		public void verifyHomepage()
		{
		
		
		Homepage hp= new Homepage(driver);
		hp.clickMenuButton();
	System.out.println("8'click to homepage button");
	
	System.out.println("checking condtion");
	String expectedhomepageTitle = "swag labs";
		String  actualhomepageTitle = driver.getTitle();
		if(expectedhomepageTitle.equals(actualhomepageTitle))
		{
			System.out.println("Homepage functionality pass");
		}
		else 
		{
			System.out.println("homepage functionality failed");
		}
		
		}	
		 
}  
		
		
