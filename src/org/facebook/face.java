package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class face {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\madhu\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtId = driver.findElement(By.id("email"));
		txtId.sendKeys("9087070036");
		WebElement txtPass = driver.findElement(By.name("pass"));
		txtPass.sendKeys("umashankar");
		WebElement clkBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		clkBtn.click();
		
	
	}

}
