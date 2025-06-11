package com.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;



public class RepositoryClass extends BaseClass{
	public static WebElement byId(String idValue) {
		return driver.findElement(By.id(idValue));
	}
	public static WebElement byName(String nameValue) {
		return driver.findElement(By.name(nameValue));
	}
	public static WebElement byClassName(String classValue) {
		return driver.findElement(By.className(classValue));
	}
	public static WebElement byTagName(String tagValue) {
		return driver.findElement(By.tagName(tagValue));
	}
	public static WebElement byLinkText(String linkValue) {
		return driver.findElement(By.linkText(linkValue));
	}
	public static WebElement byPartialLinkText(String partialValue) {
		return driver.findElement(By.partialLinkText(partialValue));
	}
	public static WebElement byCssSelector(String cssValue) {
		return driver.findElement(By.cssSelector(cssValue));
	}
	public static WebElement byXpath(String xpathValue) {
		return driver.findElement(By.xpath(xpathValue));
	}

}
