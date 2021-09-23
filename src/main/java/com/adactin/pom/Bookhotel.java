package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	
	public static WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement cont;
	

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getCont() {
		return cont;
	}

	public Bookhotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
}
