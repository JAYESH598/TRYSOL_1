package HelloWord.FirstProject;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection_1 {

	public static void main(String[] args) throws Exception {
        // Set up WebDriver and navigate to the web page
       // WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        Thread.sleep(2000);
        
        WebElement alertButton = driver.findElement(By.name("accept_all_cookies"));
        alertButton.click();
        
        Thread.sleep(2000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("javascript:window.scrollBy(250,350)");
    	Thread.sleep(2000);
        // Locate the multi-select dropdown
        //WebElement dropdown = driver.findElement(By.className("(//span[@class='select-arrow'])[1]"));
        //dropdown.click();
    	WebElement element = driver.findElement(By.xpath("(//span[@class='select-arrow'])[1]"));
    	element.click();
    	Thread.sleep(2000);
        
       // WebElement one = driver.findElement(By.xpath("(//*[@class='form-check-input'])[2]"));
       // one.click();
        WebElement two = driver.findElement(By.xpath("(//*[@class='form-check-input'])[3]"));
        two.click();
        //System.out.println("two");
        WebElement three = driver.findElement(By.xpath("(//*[@class='form-check-input'])[4]"));
        three.click();
       // System.out.println("three");
        WebElement four = driver.findElement(By.xpath("(//*[@class='form-check-input'])[5]"));
        four.click();
        //System.out.println("four");
        
       // List< WebElement> chekboxes = driver.findElements(By.xpath("//*[@class='form-check-input']"));
        
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkbox: checkboxes) {
           System.out.println(checkbox.getText());
       // System.out.println(chekboxes.size());
        
      //  for(int i=1;i<chekboxes.size();i++) {
        	
     //  	chekboxes.get(i).click();
        
       
       	
       	
        //type="checkbox"
        
        	
        	
        	
        	
       // }
        
        
     // List<WebElement>  checks = driver .findElements(By.xpath("//input[@checked='true']"));
      
   /*   Integer ddSize = chekboxes.size();
      for (int i = 0; i <ddSize; i++) {
			System.out.println(chekboxes.get(i).getAttribute("Value"));*/
		
      /*System.out.println( checks.size());
      for (WebElement check : checks) {
		
    	boolean test= check.isSelected();
    	
    	System.out.println(test);
    	  WebElement s =check.findElement(By.xpath("//div[@class='select-option selected']"));
    	  System.out.println(s.getText());
    	driver.close();}*/
			
      }
	}   	  

 }

