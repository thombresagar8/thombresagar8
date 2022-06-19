package com.saucedemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	// Find  webelement
	@FindBy(xpath="(//input[@class='input_error form_input'])[1]")
    private WebElement username;
	//input[@class='input_error form_input'][1]
	@FindBy(xpath="(//input[@class='input_error form_input'])[2]")
	private WebElement password;
	//input[@class='input_error form_input'][1]
	
	@FindBy(xpath="(//input[@id='login-button'])")
	private WebElement loginbutton;
	
	//create constructor/
	public Loginpage(WebDriver driver)
	{
		
	PageFactory.initElements(driver,this);
	}
		
	
	// actions perform on webelement
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	
	public void sendloginbutton()
	{
		loginbutton.click();
	}
	
	

}
