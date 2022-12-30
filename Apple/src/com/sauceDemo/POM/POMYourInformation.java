package com.sauceDemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMYourInformation
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]") private WebElement firstName;
	@FindBy(xpath="//*[@id=\"last-name\"]") private WebElement lastName;
	@FindBy(xpath="//*[@id=\"postal-code\"]") private WebElement postalCode;
	@FindBy(xpath="//*[@id=\"continue\"]") private WebElement Continue;
	@FindBy(xpath="//*[@id=\"finish\"]") private WebElement finished;
	
	public void sendFirstName(String a)
	{
		firstName.sendKeys(a);
	}
	
	public void sendLastName(String a)
	{
		lastName.sendKeys(a);
	}
	
	public void sendPostalCode(String a)
	{
		postalCode.sendKeys(a);
	}
	
	public void clickOnContinue()
	{
		Continue.click();
	}
	
	public void clickOnFinished()
	{
		finished.click();
	}
	public POMYourInformation(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
