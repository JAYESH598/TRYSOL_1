/*package com.qa.demo_1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {
	public static WebDriver driver;
	
	//public static void main(String[] args) 
	@Test
	public static void test(){
        // Set up WebDriver and navigate to the web page
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

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
