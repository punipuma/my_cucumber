package com.adactin.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties p;
	
	
	public ConfigReader() throws IOException {
		//path setting
	File f = new File("C:\\Users\\Punitha\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\property\\Configuration.property");	
	//Reading the file using input stream
	FileInputStream fis = new FileInputStream(f);
	//Creating object for properties(package)
	 p = new Properties();
	//loading input file
	p.load(fis);
	
	
	}
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	private String getUrl() {

		String url = p.getProperty("url");
		return url;
	
	}
}
