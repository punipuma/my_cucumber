package com.adactin.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itenary {
	
	public static WebDriver driver;
	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//h4[text() = 'Adactin.com']")
	private WebElement itenary;
	
	public Itenary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2 , this);
	}

	public WebElement getItenary() {
	
		return itenary;
	}
	

}
