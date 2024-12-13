package com.browser.window.tab.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericClass extends Browser_Tab_Controll{

	/*;*/
	
	public static WebElement readpropertiesfile;
	public static WebElement Sigin;
	public static WebElement Gmail;
	public static WebElement fb;
	public static WebElement LinkedIn;
	public static WebElement twiterOrX;
	public static WebElement MicroSoft;
	public static WebElement apPle;
	public static WebElement gitHub;
	
	public static String readpropertiesfile(String Values)throws IOException {
		//Browser_Tab_Controll.
		fi = new File(ReusableClass.Configproperties);
		//Browser_Tab_Controll.
		fis = new FileInputStream(fi);
		//Browser_Tab_Controll.
		prop = new Properties();
		//Browser_Tab_Controll.
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
		 
	 	/*Actions act = new Actions(driver);
	     act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();*/
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		 
		 

		/* Actions act = new Actions(driver);
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.apPle).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.fb).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.gitHub).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.Gmail).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.LinkedIn).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.MicroSoft).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.Sigin).click().perform();
	     act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.twiterOrX).click().perform();
	   //  act.keyDown(Keys.CONTROL).moveToElement(ReusableClass.).click().perform();*/
		 
		// driver.switchTo().newWindow(WindowType.TAB)

		 }
}
