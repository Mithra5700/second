package org.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\madhu\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
	WebElement txtId = driver.findElement(By.xpath("//input[@id='src']"));
	txtId.sendKeys("andhra");
	WebElement txtDest = driver.findElement(By.xpath("//input[@id='dest']"));
	txtDest.sendKeys("chennai");
	WebElement txtDate = driver.findElement(By.xpath("//label[@for='src']"));
	txtDate.sendKeys("09/12/2022");
		
	}

}
