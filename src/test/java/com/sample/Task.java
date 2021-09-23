package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.com.BaseClass;

public class Task extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/index.php");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("punithaR");
		driver.findElement(By.id("password")).sendKeys("Puma0802");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Sydney");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Super Deluxe");
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomno);
		s3.selectByValue("1");
		
		driver.findElement(By.id("datepick_in")).sendKeys("02/09/2021");
		driver.findElement(By.id("datepick_out")).sendKeys("03/09/2021");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("1");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("0");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("PunithaR");
		driver.findElement(By.id("last_name")).sendKeys("Ramachandran");
		driver.findElement(By.id("address")).sendKeys("New york");
		driver.findElement(By.id("cc_num")).sendKeys("1234123412341234");
		Thread.sleep(2000);
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(cardtype);
		s7.selectByValue("AMEX");
		Thread.sleep(2000);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(expmonth);
		s8.selectByValue("3");
		Thread.sleep(2000);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(expyear);
		s9.selectByValue("2022");
		Thread.sleep(2000);
		driver.findElement(By.id("cc_cvv")).sendKeys("323");
		Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		
		driver.close();
		
				
		
	}
	

}
