package com.icicibank.loans.carloans;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Purnima\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
     ChromeDriver n=new ChromeDriver();
     n.get("https://www.snapdeals.com");
     n.manage().window().maximize();
	}

}
