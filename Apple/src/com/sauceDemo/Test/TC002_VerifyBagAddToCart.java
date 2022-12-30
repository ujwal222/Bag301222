package com.sauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POM.POMHomePage;

public class TC002_VerifyBagAddToCart extends TestBase
{
	@Test
	public void verifyAddToCart()
	{
		POMHomePage home = new POMHomePage(driver);
		home.clickBagpackProduct();
		home.clickOnAddToCart();
		
		String actual = home.cartText();
		System.out.println(actual);
		String expected = "1";
		
		Assert.assertEquals(actual, expected);
		
	}
}
