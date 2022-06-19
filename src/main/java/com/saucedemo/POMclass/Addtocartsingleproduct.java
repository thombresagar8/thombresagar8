package com.saucedemo.POMclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartsingleproduct {
	
	//1) WebDriver declared
		private WebDriver driver;
		
		//2) find elements  menubutton, logout button
		
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement MenuButton;
		 
		@FindBy(xpath="//input[@id='password']")
		private WebElement logoutButton;
		
		//by id 
		//@FindBy(xpath= "//input[@id='login-button']")
		//private WebElement addtocartsingleproduct;
		
		//Tc-4, add to cart single product
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement addtocartsingleproduct;

		// TC- 5 add to cart all product
		@FindBy(xpath="//button[text() = 'Add to cart']")
		private List<WebElement> addtocartallproduct;

		//button[@id = 'add-to-cart-sauce-labs-backpack']
		// cerate constructor
		public void homepage(WebDriver driver)
		{
			this.driver = driver;
			 
			PageFactory.initElements(driver,this);
			

		}	//	actions on elements
	public void clickmenuButton()
		{
			MenuButton.click();
		}
	public void clicklogoutbutton()

	{
		logoutButton.click();

	}
	public void addtocartsingleproduct()
	{
		addtocartsingleproduct.click();
	}

	public void allproduct()
	{
		for(int i=0; i<addtocartallproduct.size(); i++)
			addtocartallproduct.get(i).click();
	}
		public void allchecktext()
		{
			for(int i=0; i<addtocartallproduct.size(); i++)
			{
			if(addtocartallproduct.get(i).getText().contains("remove"))
			{
			System.out.println("add to cart all product test case is get passed");
		        }
			else
		        {
		        	System.out.println("add to cart all product test case is get failed");
		        }
			}
		
		
		}
}