package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static Actions a;
	public static Select s;
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\seleniumNew\\Selenium\\Resources\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void waitTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public static void inputText(WebElement element,String value) {
		element.sendKeys(value);
	}
	

	public static void click(WebElement element) {
		element.click();
	}
	public static void close() {
			driver.close();
		}
	public static void selectByValue(String data) {
		s.selectByValue(data);
	}
	public static void selectByIndex(int data) {
		s.selectByIndex(data);
	}
	public static void selectDropdownByVisibleText(WebElement element, String visibleText) {
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(visibleText);	
	}
	public static void selectByvisibletext(String text) {
		s.selectByVisibleText(text);
	}
	
	
}
