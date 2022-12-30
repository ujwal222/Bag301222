package com.sauceDemo.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sauceDemo.POM.POMHomePage;
import com.sauceDemo.POM.POMLogin;

public class TestBase 
{
WebDriver driver;
	
	@BeforeClass //Browser& URL Open
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Browser is open");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");	
	}
	
	@BeforeMethod //Login
	public void setUp() throws InterruptedException
	{
		POMLogin logIn = new POMLogin(driver);
		logIn.sendUsername("standard_user");
		logIn.sendPassword("secret_sauce");
		logIn.clickOnLoginButton();
	}
	
	
	@AfterMethod  //logOut
	public  void tearDown()
	{
		POMHomePage logOut = new POMHomePage(driver);
		logOut.clickOnMenuButton();
		logOut.clickOnLogoutButton();
	}
	
	@AfterClass //BrowserClose
	public void afterMethod()
	{
		driver.close();
	}
	
	
}
