package com.saucedemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.saucedemo.POMclass.Logoutpage;

public class TC02Logoutfunctionality extends Testbaseclass
{
	WebDriver driver; // declared globally

 @Test
 public void verifiylogoutfunctionality()
 {
//Homepage
Logoutpage lp = new Logoutpage(driver);
lp.clickMenuButton();
System.out.println("click menu button");

lp.clickmenu();
lp.logoutButton();
System.out.println("click logout button");
	
// condition check
System.out.println("condition checked");
String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("logOut test is passed");
	}
	else
	{
		System.out.println("logOut test is failed");
	}
	

}	
	
 
}
