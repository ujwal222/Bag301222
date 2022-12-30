package com.sauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POM.POMHomePage;

public class TC003_VerifyAllProduct extends TestBase
{
	@Test
	public void VerifyAllProduct()
	{
		POMHomePage home = new POMHomePage(driver);
		home.selectAllProduct();
		
		String actual = home.cartText();
		System.out.println(actual);
		
		String expected="6";
		Assert.assertEquals(actual, expected);
		
	}
	
	
	
}
