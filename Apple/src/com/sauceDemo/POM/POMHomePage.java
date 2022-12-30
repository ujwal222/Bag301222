package com.sauceDemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//div//div//div//div//div//button)[1]") private WebElement MenuButton;
	@FindBy(xpath="//div//div//div//div[2]//div//nav//a[3]") private WebElement logOut;
	@FindBy(xpath="(//div//div//div//div//div//div[2]//a[1])[2]") private WebElement BagpackProduct;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]") private WebElement AddToCart;
	@FindBy(xpath="(//body//div//div//div//div//div//div[3]//a)[1]") private WebElement cart;
	@FindBy(xpath="//button[text()='Add to cart']") private List<WebElement> AllProduct;
	
	
	public void clickOnMenuButton()
	{
		MenuButton.click();
	}
	
	public void clickOnLogoutButton()
	{
		logOut.click();
	}
	
	public void clickBagpackProduct()
	{
		BagpackProduct.click();
	}
	
	public void clickOnAddToCart()
	{
		AddToCart.click();
	}
	
	public void clickOnCart()
	{
		cart.click();
	}
	
	public String cartText()
	{
		String q1 = cart.getText();
		return q1;
	}
	
	public void selectAllProduct()
	{
		for(WebElement s1 : AllProduct)
		{
			s1.click();
		}
	}
	
	
	public POMHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
