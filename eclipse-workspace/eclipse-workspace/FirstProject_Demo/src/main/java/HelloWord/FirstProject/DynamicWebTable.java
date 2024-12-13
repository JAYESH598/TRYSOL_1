package HelloWord.FirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String[] args) {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        
        // Initialize the web driver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the page with the web table
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        
        // Locate the table
        WebElement table = driver.findElement(By.id("//table[@class='dataTable']"));
        
        // Fetch all rows of the table
        List<WebElement> rows = table.findElements(By.tagName("//tbody/tr[1]"));
        
        // Iterate through each row
        for (int i = 0; i < rows.size(); i++) {
            // Fetch all columns of the current row
            List<WebElement> columns = rows.get(i).findElements(By.tagName("//tbody/tr[1]/td[1]"));
            
            // Iterate through each column
            for (int j = 0; j < columns.size(); j++) {
                // Print the cell value
                System.out.print(columns.get(j).getText() + " ");
            }
            System.out.println();
        }
        
        // Close the browser
        driver.quit();
    }
}
