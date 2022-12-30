package com.sauceDemo.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POM.POMHomePage;
import com.sauceDemo.POM.POMYourCart;
import com.sauceDemo.POM.POMYourInformation;

public class TC004_VerifyOrderPlaced extends TestBase
{
	@Test
	public void VerifyOrderPlaced()
	{
		POMHomePage home = new POMHomePage(driver);
		home.selectAllProduct();
		home.clickOnCart();
		
		POMYourCart check = new POMYourCart(driver);
		check.clickOnCheckOuts();
		
		POMYourInformation info = new POMYourInformation(driver);
		info.sendFirstName("Ujwal");
		info.sendLastName("Chaudhari");
		info.sendPostalCode("400605");
		info.clickOnContinue();
		
		String expected=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")).getText();
		System.out.println(expected);
		
		String actual="FREE PONY EXPRESS DELIVERY!";
		
		Assert.assertEquals(actual, expected);
	
	}
}
