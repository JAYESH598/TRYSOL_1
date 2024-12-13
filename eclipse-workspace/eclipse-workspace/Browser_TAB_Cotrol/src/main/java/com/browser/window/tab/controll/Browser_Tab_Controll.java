package com.browser.window.tab.controll;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Tab_Controll {
	
	public static WebDriver driver;
	public static File fi ;
	public static FileInputStream fis;
	public static Properties prop;
	
	public static void browserBase() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.zoho.com/creator/apps/human-resources.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
	}

	
	 public static void tearDown() {
		 
		 driver.close();
	 }
}
