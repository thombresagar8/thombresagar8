package com.saucedemo.TestClass;

import org.testng.annotations.Test;

import com.saucedemo.POMclass.Addtocartsingleproduct;
import com.saucedemo.POMclass.Homepage;


public class TC04Addtocartfunctionality extends Testbaseclass
{ 
	@Test 
	public void verifyaddtocartf() throws InterruptedException
	{
	Homepage hp= new Homepage(driver);
	hp.addToCart();
	System.out.println("homepage activity");
	
	Addtocartsingleproduct  at= new Addtocartsingleproduct();
	at.clicklogoutbutton();
	
		System.out.println("check product are added to cart are not");
	
}
}