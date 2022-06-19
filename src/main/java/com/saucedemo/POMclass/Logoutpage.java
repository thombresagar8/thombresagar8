package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Logoutpage {
	//webdriver declared as private
	
	
		

	   
	   //find elements logoutbutton 
	   
	   
	   @FindBy(xpath="(//button[@id='react-burger-menu-btn'])")
	   private WebElement MenuButton;
	   
	   @FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement clickmenu;

	   @FindBy(xpath="(//a[@id='logout_sidebar_link'])")
	   private WebElement logoutButton;
	   
	   // constructor
	   
	   public Logoutpage(WebDriver driver)
	   
	   {
		  
		   PageFactory.initElements(driver,this);
	   }
	   //actions on elements
	   
	   public void clickMenuButton()
	   {
		   //click on menubutton
		   MenuButton.click();
	   
	   
	   //mouse actions on action class
	  // act.click(MenuButton).perform();
		 
	   // TC03  click on logoutButton  
	   }
	   public void clickmenu() {
		// TODO Auto-generated method stub
		clickmenu.click();
	}

	public void logoutButton()
	   {
		   logoutButton.click();
	   }
	   
	   
	   
	   
	   }
	   
	   

