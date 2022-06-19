package com.saucedemo.TestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.POMclass.Homepage;

	public class TC01Loginfuntionality extends Testbaseclass
	{
		
	 @Test
	 
		public void Verifiyloginfunctionality()
		{
		String expectedHomepageurl = "https://www.saucedemo.com/inventory.html";
		//"https://www.saucedemo.com/inventory.html";
 		

	 String actualHomepageurl = driver.getCurrentUrl(); // Checking urlAssert.assertEquals(actualHomepageur,expectedHomepageurl);
	 
	 Assert.assertEquals(actualHomepageurl,expectedHomepageurl);
	 
	 System.out.println("6. Checking login test case");
	 
	 if (expectedHomepageurl.equals(actualHomepageurl))
	 {
		 System.out.println("7. test case is passed- we have login succesfully on saucedemo site");
	 } else
	 
	 System.out.println("8. test case failed");
		
	
	
Homepage hp= new Homepage(driver);
hp.clickmenu();
hp.clickOnLogOut();
System.out.println("9. end of program");
	 
		}
	 }