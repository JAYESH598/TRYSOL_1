package com.qa.demo_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericOperation extends BrowerBase{
	

	public static WebElement readpropertiesfile;
	public static String readpropertiesfile(String Values)throws IOException {
		
		prop = new Properties();
		fi = new File(ReusableClass.Configproperties);
		fis = new FileInputStream(fi);
		prop.load(fis);
		return prop.getProperty(Values);
		
	}
	
	
	 public static void enterValueintotextbox (WebElement element, String text) {
		 element.click();
		 element.clear();
		 element.sendKeys("");
	}
	 
	 public static void ClickOpertion(WebElement element,long WaitTimeInSeconds ) {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(WaitTimeInSeconds) );
		 wait.until(ExpectedConditions.elementToBeClickable(element));
     	 element.click();
	 }
	 
	 public static void tabOpennew() { 
	 
	 Actions act = new Actions(driver);
     act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
     
	 }
}
