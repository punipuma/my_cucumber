package baseclass.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class BaseClass {
	public static WebDriver driver;
public static WebDriver browserLaunch(String browsername) {
	try {
		if(browsername.equalsIgnoreCase("chrome")) {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Punitha\\eclipse-workspace\\AdactinCucumber\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
}else if (browsername.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.Internetexplorer.driver", "C:\\Users\\Punitha\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver = new InternetExplorerDriver();
		
}else {
		System.out.println("Invalid browser");
}
	} catch (Exception e) {
		e.printStackTrace();
	}
	driver.manage().window().maximize();
	return driver;
}

public static void getUrl(String url) {
try {
	driver.get(url);
} catch (Exception e) {
	e.printStackTrace();
}
}

public static void getUrl1(String url) {
 {
	driver.get(url);

}

}




public static void explicitWait(WebElement element) {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
public static void inputData(WebElement element, String value) {
	explicitWait(element);
	
	try {
		element.sendKeys(value);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	

}
public static void clickElement(WebElement element) {
	
	try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
public static void selectDropdown(WebElement element, String value, String option) {
	Select s = new Select(element);
	if(option.equalsIgnoreCase("value")) {
		s.selectByValue(value);
	}else if (option.equalsIgnoreCase("visibletext")) {
		s.selectByVisibleText(value);
		
	}else if (option.equalsIgnoreCase("index")) {
		s.selectByIndex(Integer.parseInt(value));
	}
	

}

public static void getTitle() {

	String title = driver.getTitle();
	
	System.out.println(title);
	
}
public static void scroll(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguements[0].scrollIntoView();", element);
	
}

	public static void gotoBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		

	}
}

