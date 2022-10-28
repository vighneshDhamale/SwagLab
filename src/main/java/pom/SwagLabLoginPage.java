package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	@FindBy(xpath="//input[@name='user-name']")private WebElement Username;
	@FindBy(xpath="//input[@type='password']")private WebElement Password;
	@FindBy(xpath="//input[@value='Login']")private WebElement Login;
	
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String user) {
		Username.sendKeys(user);
	}
	
	public void enterpassword(String pass) {
		Password.sendKeys(pass);
	}

	public void clickOnLogin() {
		Login.click();
	}

}
