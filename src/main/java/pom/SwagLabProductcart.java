package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

public class SwagLabProductcart extends Browser{
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement Addtocart; 
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement Shoppingcart;
	@FindBy(xpath="//button[text()='Checkout']")private WebElement Checkout;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement Firstname;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement Lastname;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement zipcode;
	@FindBy(xpath="//input[@name='continue']")private WebElement Continue;
	@FindBy(xpath="//button[text()='Finish']")private WebElement Finish;
	@FindBy(xpath="//button[text()='Back Home']")private WebElement BacktoHome;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement Allitems;
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	
	
	public SwagLabProductcart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddtocart() {
		Addtocart.click();
		}

	public void clickOnshoppingcart() {
		Shoppingcart.click();
	}

	public void clickoncheckout() {
		Checkout.click();
	}
	
	public void enterfirstname(String user) {
		Firstname.sendKeys(user);
	}

	public void enterlastname(String user) {
		Lastname.sendKeys(user);
	}

	public void enterzipcode(String user) {
		zipcode.sendKeys(user);
	}

	public void clickoncontinue() {
		Continue.click();
	}
	
	public void clickOnfinish() {
		Finish.click();
	}

	public void clickonbacktohome() {
		BacktoHome.click();
	}

	public void clickonAllitems() {
		Allitems.click();
	}

	public void cliclonlogout() {
		Logout.click();
	}


}
