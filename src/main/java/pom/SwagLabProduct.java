package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

	public class SwagLabProduct extends Browser {
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement Addtocart;
	//	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement Addtocart; 
		@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement Shoppingcart;
		@FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
		@FindBy(xpath="//button[@id='continue-shopping']")private WebElement ContinueShopping;

	public  SwagLabProduct(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public void clickOnAddtocart() {
	Addtocart.click();
	}

	public void clickOnshoppingcart() {
		Shoppingcart.click();
	}

	public void clicknOnremove() {
		Remove.click();
	}
	
	public void clickOncontinueshoping() {
		ContinueShopping.click();
	}









}
