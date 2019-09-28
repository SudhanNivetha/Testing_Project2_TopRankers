package com.pack.ChildClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.BaseClass.BaseClassCommon;

public class LoginPage extends BaseClassCommon
{
	@FindBy(xpath="//button[@class='btn btn-default    ']")
	WebElement login_btn;
	@FindBy(xpath="//input[@id='txt_login_email']")
	WebElement email;
	@FindBy(xpath="//input[@id='txt_login_password']")
	WebElement pass;
	@FindBy(xpath="//input[@id='btn btn-primary']")
	WebElement login_1;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickLogin()
	{
		login_btn.click();
	}
	public void popup()
	{
		if(driver.switchTo().frame("notification-frame-22a337308")==null)
		{
		driver.findElement(By.xpath("//*[@class='close']")).click();
		}
	}
	public void loginButtonclick(String email1,String pass1)
	{
	
		Actions action1=new Actions(driver);
		action1.moveToElement(email).build().perform();
		action1.sendKeys("email1");

		Actions action2=new Actions(driver);
		action2.moveToElement(email).build().perform();
		action2.sendKeys("pass1");
		
		Actions action3=new Actions(driver);
		action3.moveToElement(email).build().perform();
		action3.click();
		login_1.click();
	}
	
	

}
