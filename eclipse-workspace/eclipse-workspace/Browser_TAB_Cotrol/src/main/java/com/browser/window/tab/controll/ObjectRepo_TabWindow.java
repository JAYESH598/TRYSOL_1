package com.browser.window.tab.controll;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ObjectRepo_TabWindow extends Browser_Tab_Controll {

	public static WebElement Sigin;
	public static WebElement Gmail;
	public static WebElement fb;
	public static WebElement LinkedIn;
	public static WebElement twiterOrX;
	public static WebElement MicroSoft;
	public static WebElement apPle;
	public static WebElement gitHub;

	public static void clickOnsignIn() throws Exception {
	Sigin = driver.findElement(By.xpath(GenericClass.readpropertiesfile("SingIn")));
	GenericClass.ClickOpertion(Sigin, 2);
				//driver.get(GenericClass.readpropertiesfile(prop.getProperty("SingIn")));
				
	}

	public static void clickOnGmail() throws Exception {
		Gmail = driver.findElement(By.xpath(GenericClass.readpropertiesfile("Gmail")));
		GenericClass.tabOpennew();
	}

	public static void clickOnfaceBook() throws Exception {
		fb = driver.findElement(By.xpath(GenericClass.readpropertiesfile("facebook")));
		GenericClass.tabOpennew();
	}

	public static void clickOnLinkdIn() throws Exception {
		LinkedIn = driver.findElement(By.xpath(GenericClass.readpropertiesfile("Linkedin")));
		GenericClass.tabOpennew();
	}

	public static void clickOnTwiterOrX() throws Exception {
		twiterOrX = driver.findElement(By.xpath(GenericClass.readpropertiesfile("TwiterOrX")));
		GenericClass.tabOpennew();
	}

	public static void clickOnmicroSoft() throws Exception {
		MicroSoft = driver.findElement(By.xpath(GenericClass.readpropertiesfile("MicroSoft")));
		GenericClass.tabOpennew();
	}

	public static void clickOnApple() throws Exception {
		apPle = driver.findElement(By.xpath(GenericClass.readpropertiesfile("Apple")));
		GenericClass.tabOpennew();
	}

	public static void clickOnGithub() throws Exception {
		gitHub = driver.findElement(By.xpath(GenericClass.readpropertiesfile("GitHub")));
		GenericClass.tabOpennew();
	}

	/*// Method to handle switching to the next window
	public static void switchToNextWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windowIterator = windowHandles.iterator();

		while (windowIterator.hasNext()) {
			String window = windowIterator.next();
			driver.switchTo().window(window);
			System.out.println("Switched to window: " + driver.getTitle());
		}
	}*/
     
	public static void printAllWindowTitles()throws Exception {
		Set<String> SetWindowId = driver.getWindowHandles();
		List<String> ListWindowsId = new ArrayList<String>(SetWindowId);
		{
			for (String W : ListWindowsId) {
				String title = driver.switchTo().window(W).getTitle();
				System.out.println("windowslistof" + title);
			}
		}
	}
	// Switch to the original window (first one)
  /*  public static void switchToMainWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        String mainWindow = windowHandles.iterator().next();  // Get the first window
        driver.switchTo().window(mainWindow);
        System.out.println("Switched back to main window: " + driver.getTitle());
    }*/
	
	/*public static void switchNewtab() {
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		String newTab = winList.get(winList.size() - 1);
		driver.close(); // close the original tab
		driver.switchTo().window(newTab); // switch to new tab
	}*/
}
