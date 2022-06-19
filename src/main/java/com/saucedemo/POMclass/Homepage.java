package com.saucedemo.POMclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	//private WebDriver driver;
	private Actions act;
	private Select s;
	
	//elements finds --> menuButton, logout button
	//TC-03 elements - logout functionality
	
//	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
//	private WebElement menuButton;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement clickmenu;

//	@FindBy(xpath="//a[text()='Logout']")
//	private WebElement logOutButton;
	//a[text()='Logout']
	//a[@id='logout_sidebar_link']
	   @FindBy(xpath="(//button[@id='react-burger-menu-btn'])")
	   private WebElement MenuButton;
	   
	   @FindBy(xpath="(//a[@id='logout_sidebar_link'])")
	   private WebElement logoutButton;
	
	//TC-04 elements -all products
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> addToButton;
	
	
	//TC-02 elements - add to cart single element
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton;
	
   





	//constructor
	public Homepage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
//		act = new Actions(driver);
//		s = new Select(menuButton);
	}
	
	//action on the elements
	//TC-03
	public void clickmenu()
	{
		clickmenu.click();
	}
	
	public void clickMenuButton()
	{
		//webelement method
		menuButton.click();
		}
	
	
	//TC-03
	public void clickOnLogOut()
	{
		logOutButton.click();
	}
	
	//TC-04 
	public void addToCart() throws InterruptedException
	{
		for(int i=0; i<addToButton.size(); i++)
		{
			addToButton.get(i).click();
			Thread.sleep(3000);
		}
	}

	}


