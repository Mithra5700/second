package com.hexa;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\madhu\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement notNow = driver.findElement(By.xpath("//button[@id='pushDenied']"));
		notNow.click();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='keyword'][1]"));
		txtSearch.sendKeys("iphone",Keys.ENTER);
		WebElement clkIphone = driver.findElement(By.xpath("//img[@class='product-image '][1]"));
		clkIphone.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> winHand = driver.getWindowHandles();
		System.out.println(winHand);
	    List<String> l = new LinkedList<String>();
		l.addAll(winHand);
		driver.switchTo().window(l.get(1));			
		WebElement addkart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addkart.click();
		WebElement trustPay = driver.findElement(By.xpath("//p[text()='TrustPay']"));
		trustPay.click();
		WebElement prntTp = driver.findElement(By.xpath("//h2[@class='accordionHeading']"));
		System.out.println(prntTp);
		
		
		
		
	}
}