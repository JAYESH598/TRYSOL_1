package HelloWord.FirstProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection_2 {
	
	    public static void main(String[] args) throws Exception {
	        // Set up WebDriver and navigate to the web page
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
	        WebElement element = driver.findElement(By.xpath("(//span[@class='select-arrow'])[1]"));
	        element.click();
	        Thread.sleep(2000);

	        WebElement one = driver.findElement(By.xpath("(//*[@class='form-check-input'])[2]"));
	        one.click();
	        WebElement two = driver.findElement(By.xpath("(//*[@class='form-check-input'])[3]"));
	        two.click();
	        WebElement three = driver.findElement(By.xpath("(//*[@class='form-check-input'])[4]"));
	        three.click();
	        WebElement four = driver.findElement(By.xpath("(//*[@class='form-check-input'])[5]"));
	        four.click();

	        // Verify selected options using a Map
	        Map<String, Boolean> selectionStatus = new HashMap<>();

	        List<WebElement> checks = driver.findElements(By.xpath("//input[@checked='true']"));
	        System.out.println("Selected options:");
            Thread.sleep(2000);
	        for (WebElement check : checks) {
	            boolean isSelected = check.isSelected();
	            selectionStatus.put(check.getAttribute("value"), isSelected);
	        }

	        // Display already selected options
	        for (Map.Entry<String, Boolean> entry : selectionStatus.entrySet()) {
	            if (entry.getValue()) {
	                System.out.println(entry.getKey() + " is already selected.");
	            }
	        }

	        // Clean up
	         driver.quit();
	    }
}
