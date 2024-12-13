package com.qa.Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Flipkart {

	public static WebDriver driver;
	
	public static void broWser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		
		WebElement Electronices = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Electronices.click();
		
		WebElement BluetoothHedphones = driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"));
		BluetoothHedphones.click();
		
		WebElement element2 = driver.findElement(By.xpath("//a[contains(@class,'VJA3rP')]//following::img[contains(@alt,'TRIGGR Kraken X1 with Battery Display, 40ms Latency, Quad Mic ENC, 40 Hr, v5.3 Bluetooth')]"));
				//driver.findElement(By.xpath("//*[ contains(@class,'x1UMqG')]//following::img[ contains(@alt,'boAt Airdopes Alpha with 35 HRS Playback, 13mm Drivers, Dual Mics ENx & Beast Mode Bluetooth')]"));
		element2.click();
		
	}
}
