
package com.qa.demo_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;

public class Objectrepos extends BrowerBase{

	

	public Objectrepos(WebDriver driver) {
		this.driver=driver;
		
		//super(driver);
		// TODO Auto-generated constructor stub
	}

	//public static void commonMethod() {
	//public static void linkedInpage() {
	
	public static void openMultipleWindows() throws Exception{
	
		   
        
         WebElement hr = driver.findElement(By.xpath(GenericOperation.readpropertiesfile("HRM_XPATH")));
          GenericOperation.ClickOpertion(hr, 2);
		 
 
		   WebElement linkedIn =  driver.findElement(By.xpath(GenericOperation.readpropertiesfile("linkedInXPath")));
		   GenericOperation.ClickOpertion(linkedIn,2);
		  
	  // }
	//public static void facebookPage() {
		   
		   
		   WebElement fB =  driver.findElement(By.xpath(GenericOperation.readpropertiesfile("facebookXPath")));
		   GenericOperation.ClickOpertion(fB,2);
		   
	//}
	//public static void twiterPageOrX() {
		   
		   WebElement twOrX =  driver.findElement(By.xpath(GenericOperation.readpropertiesfile("twiterOrX_Xpath")));
		   GenericOperation.ClickOpertion(twOrX ,2);
		 

	//}
	//public static void youtubPage() {
		   
		   WebElement YTubepage =  driver.findElement(By.xpath(GenericOperation.readpropertiesfile("YTube_Xpath")));
		   GenericOperation.ClickOpertion(YTubepage,2);
		  
	       
	 
	}
	public static void handleMultipleWindows() throws Exception {
	Set<String>SetWindowId = driver.getWindowHandles();
	List <String>ListWindowsId = new  ArrayList<String>(SetWindowId);
	{
    for(String W: ListWindowsId) {
	String title = driver.switchTo().window(W).getTitle();
	System.out.println("windowslistof"+title);
	if ((title.equals("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook"))||((title.equals("Human Resources Management Software | OrangeHRM")))) {
		//Thread.sleep(6000);
		 driver.close();
	}
    }
	
	}
	}
}
