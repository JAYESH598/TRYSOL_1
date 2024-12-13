package HelloWord.FirstProject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement alertButton = driver.findElement(By.name("accept_all_cookies"));

        // Click the button to trigger the alert
        alertButton.click();

        // Switch to the alert
       /* Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        // Accept the alert (click OK)
        alert.accept();*/

		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("javascript:window.scrollBy(250,350)");
       /* JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
    	
    	Thread.sleep(3000);
    	
    	WebElement element = driver.findElement(By.xpath("(//span[@class='select-arrow'])[1]"));
    	element.click();
    	
    	WebElement selectelement = driver.findElement(By.xpath("//input[@class='form-check-input']"));
    	selectelement.click();
    	
    	boolean s = selectelement.isSelected();
    	System.out.println(s);
    	driver.close();
    	}
	}
