package com.qa.demo_1;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowerBase {
	public static WebDriver driver;
	public static Properties prop;
	public static File fi;
	public static FileInputStream fis;
	

	public static void broWser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		
		
		driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//driver.get("https://www.zoho.com/creator/apps/human-resources.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();

	}

	public static void tearDown() {

		driver.close();
	}
}
