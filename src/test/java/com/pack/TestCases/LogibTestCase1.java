package com.pack.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.BaseClass.BaseClassCommon;
import com.pack.ChildClass.LoginPage;

public class LogibTestCase1 extends BaseClassCommon {
	LoginPage Lp;
	
	@BeforeMethod()
	public void launch()  
	{
		initialization();
		//Robot rr=new Robot();
		//rr.keyPress(KeyEvent.VK_DOWN);
		Lp=new LoginPage();
		//Lp.clickLogin();
	}
	@Test
	public void LoginCase_1() throws InterruptedException
	{
		Lp=new LoginPage();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//html")).click();
		//Lp.loginButtonclick(prop.getProperty("email"),prop.getProperty("pass"));

 		
	}
	@AfterMethod()
	public void quit()
	{
		driver.quit();
	}
}
