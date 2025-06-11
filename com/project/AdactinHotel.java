package com.project;

import com.baseclass.BaseClass;
import com.repository.RepositoryClass;

public class AdactinHotel extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		BaseClass.browserLaunch();
		BaseClass.maxWindow();
		BaseClass.getUrl("https://adactinhotelapp.com/index.php");
		BaseClass.inputText(RepositoryClass.byId("username"), "bharathi7");
		BaseClass.waitTime(2000);
		BaseClass.inputText(RepositoryClass.byId("password"), "Bharathi@21");
		BaseClass.waitTime(2000);
		BaseClass.click(RepositoryClass.byId("login"));
		BaseClass.waitTime(2000);
		BaseClass.click(RepositoryClass.byId("location"));
		BaseClass.waitTime(2000);
		BaseClass.selectDropdownByVisibleText(RepositoryClass.byId("location"),"London");
		BaseClass.waitTime(2000);
		//BaseClass.waitTime(4000);
	}
	
	

}
