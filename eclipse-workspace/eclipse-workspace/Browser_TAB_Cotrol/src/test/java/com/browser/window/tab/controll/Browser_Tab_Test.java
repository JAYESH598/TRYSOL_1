package com.browser.window.tab.controll;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser_Tab_Test extends Browser_Tab_Controll {

	
	@BeforeTest
	//@Test
	 public static void Basetest() throws Exception {
		Browser_Tab_Controll.browserBase();
		//ObjectRepo_TabWindow.clickOnsignIn();
		//Browser_Tab_Controll.tearDown();
		 
	 }
	@Test
	public static void second_Test() throws Exception {
		ObjectRepo_TabWindow.clickOnsignIn();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnGmail();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnfaceBook();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnLinkdIn();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnTwiterOrX();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnmicroSoft();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnApple();
		Thread.sleep(3000);
		ObjectRepo_TabWindow.clickOnGithub();
		
		//ObjectRepo_TabWindow.switchNewtab();
		
		// Printing the titles of all windows
        ObjectRepo_TabWindow.printAllWindowTitles();

      /*  // Switch through all windows one by one

        ObjectRepo_TabWindow.switchToNextWindow();

        // Switch back to the main window (initial window)
        ObjectRepo_TabWindow.switchToMainWindow();*/
		
		
	}
	@AfterTest
	//@Test
	public static void tearDown_Test() {
		
		//Browser_Tab_Controll.tearDown();
		
	}
}
