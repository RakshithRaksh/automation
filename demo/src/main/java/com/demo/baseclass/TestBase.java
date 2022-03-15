package com.demo.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public static WebDriver driver;
	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh S\\Desktop\\Seljar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(3000);
		
		
		
		
	}

}
