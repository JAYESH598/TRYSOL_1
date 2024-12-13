package HelloWord.FirstProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountryDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        Thread.sleep(2000);

        // Handle cookies alert if any
        WebElement alertButton = driver.findElement(By.name("accept_all_cookies"));
        if (alertButton != null) {
            alertButton.click();
            Thread.sleep(2000);
        }

        // Scroll to the dropdown
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)");
        Thread.sleep(2000);

        // Locate and click the dropdown to expand options
        WebElement dropdown = driver.findElement(By.xpath("(//span[@class='select-arrow'])[1]"));
        dropdown.click();
        Thread.sleep(2000);

        // Select the country checkboxes
        WebElement country1 = driver.findElement(By.xpath("(//*[@class='form-check-input'])[2]"));
        country1.click();
        WebElement country2 = driver.findElement(By.xpath("(//*[@class='form-check-input'])[3]"));
        country2.click();
        WebElement country3 = driver.findElement(By.xpath("(//*[@class='form-check-input'])[4]"));
        country3.click();
        WebElement country4 = driver.findElement(By.xpath("(//*[@class='form-check-input'])[5]"));
        country4.click();

        // Verify selected options using a Map
        Map<String, Boolean> selectionStatus = new HashMap<>();
        List<WebElement> checks = driver.findElements(By.xpath("//input[@checked='true']"));

        System.out.println("Selected countries:");
        for (WebElement check : checks) {
            if (check.isSelected()) {
                String countryName = check.findElement(By.xpath("./following-sibling::label")).getText();
                selectionStatus.put(countryName, true);
            }
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
