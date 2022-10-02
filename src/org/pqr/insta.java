package org.pqr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");

		WebElement txtPhn = driver.findElement(By.xpath("//input[@type='text']"));
		txtPhn.sendKeys("mithraa");
	}
}