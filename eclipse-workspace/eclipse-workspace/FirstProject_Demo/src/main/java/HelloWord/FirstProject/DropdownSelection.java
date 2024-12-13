package HelloWord.FirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
	

	public static void main(String[] args) {
        // Set up WebDriver and navigate to the web page
       // WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        WebElement alertButton = driver.findElement(By.name("accept_all_cookies"));
        alertButton.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("javascript:window.scrollBy(250,350)");

        // Locate the multi-select dropdown
        WebElement dropdown = driver.findElement(By.className("(//span[@class='select-arrow'])[1]"));

        // Create an instance of the Select class
        Select select = new Select(dropdown);

        // Select 10 options by their index
        for (int i = 0; i < 4; i++) {
            select.selectByIndex(i);
        }
        
      //  System.out.println(i);

        // Verify and display already selected options
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Already selected options are:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText() + " is already selected.");
        }

        // Clean up
        driver.quit();
    }

}
