package com.sauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_VefifyLogin extends TestBase
{
	@Test
	public void verifyLogin()
	{
		String expected="Swag Labs";
		String actual = driver.getTitle();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
	}
	
	
	
}
