package com.demo.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.baseclass.TestBase;
import com.demo.pages.Registraton;

public class LoginTest extends  TestBase{
	
	
	@BeforeMethod
	public void before() throws InterruptedException
	{
		initialization();
	}
	@Test
	public void LoginTest() throws InterruptedException
	{
		Registraton reg = new Registraton();
		reg.signinng();
		Thread.sleep(3000);
		reg.enteremail();
		Thread.sleep(3000);
		reg.submitClick();
		reg.createAccount();
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}
	
	
	

}
