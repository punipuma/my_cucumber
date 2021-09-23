package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Bookhotel;
import com.adactin.pom.Booknow;
import com.adactin.pom.Itenary;
import com.adactin.pom.Login;
import com.adactin.pom.Searchhotel;

public class PageObjectManager {

	public static WebDriver driver;
	
	private Login l;
	private Searchhotel sh;
	private Bookhotel bl;
	private Booknow bk;
	private Itenary it;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public Login getL() {
		l = new Login(driver);
		return l;
	}
	
	
	public Searchhotel getSh() {
		sh = new Searchhotel(driver);
		return sh;
	}
	
	public Bookhotel getBl() {
		bl = new Bookhotel(driver);
		return bl;
	}
	
public Booknow getBk() {
	bk = new Booknow(driver);
	return bk;
}

public Itenary getIt() {
	it = new Itenary(driver);
	return it;
}
}
