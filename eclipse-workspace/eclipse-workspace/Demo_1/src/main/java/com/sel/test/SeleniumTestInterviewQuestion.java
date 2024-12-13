package com.sel.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SeleniumTestInterviewQuestion{

	@Test
	 private static void test() {
		
		 
		 WebDriver  driver = new ChromeDriver();
		 
		 driver.get("https://mail.google.com/mail/u/1/?ogbl#inbox");
		WebElement username = driver.findElement(By.xpath(""));
		username.sendKeys("jayeshkumar2590@gmail.com");
		
		WebElement password = driver.findElement(By.xpath(""));
		password .sendKeys("XXXXX");
		
		WebElement button = driver.findElement(By.xpath(""));
		button.click();
		
		WebElement leftclick = driver.findElement(By.xpath(""));
		leftclick.click();
		
		for (WebElement click : leftclick) {
			
			//if (usernameandsubject == usernamesubject) {
				//}
			
			assertEquals("usernameandsubjecttitle", "usernameandsubjecttitle");
			System.out.println("usernameandsubjecttitle");
		}
		 
	}
}
