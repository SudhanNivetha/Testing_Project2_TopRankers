package com.pack.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pack.Util.*;
public class BaseClassCommon
{

	public static WebDriver driver;
	public static Properties prop;
	{
	 try {
			prop= new Properties();
			FileInputStream fis=new FileInputStream("C:/Users/User/Desktop/Project_Testing_1/TopRankers_Project1/src/main/java/com/pack/Config/config.properties");
			prop.load(fis);
		    } 
	    catch (Exception e)
	    {
			e.printStackTrace();
		}
}
	    
public static void initialization()
	    {
	    	String browserName=prop.getProperty("browser");
	    	 
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:/Users/User/Desktop/New folder/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browserName.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","D:/Java/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			System.out.println("Browser Opened successfully"); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(UtilClass.Page_Load_Timeout,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(UtilClass.Implicit_Wait,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url_path"));
			
	    }

}

