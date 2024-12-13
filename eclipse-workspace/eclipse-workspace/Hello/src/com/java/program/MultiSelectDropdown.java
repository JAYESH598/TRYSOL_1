/*package com.java.program;

public class MultiSelectDropdown {
	public static void main(String[] args) {
        // Set up WebDriver and navigate to the web page
        WebDriver driver = new ChromeDriver();
        driver.get("URL_OF_YOUR_WEBPAGE_WITH_MULTIPLE_SELECT_DROPDOWN");

        // Locate the multi-select dropdown
        WebElement dropdown = driver.findElement(By.id("ID_OF_YOUR_DROPDOWN"));

        // Create an instance of the Select class
        Select select = new Select(dropdown);

        // Select multiple options
        select.selectByValue("value1");
        select.selectByValue("value2");
        select.selectByValue("value3");

        // Verify selected options
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected options are:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Deselect options if needed
        // select.deselectByValue("value1");

        // Clean up
        driver.quit();
    }
}*/
