package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPageNew1 {
	@FindBy(xpath="//input[@name='user-name']")private WebElement Username;
	@FindBy(xpath="//input[@type='password']")private WebElement Password;
	@FindBy(xpath="//input[@value='Login']")private WebElement Login;
	@FindBy(xpath="//a[text()='Twitter']")private WebElement Twitter;
	@FindBy(xpath="//a[text()='Facebook']")private WebElement FaceBook;
	@FindBy(xpath="//a[text()='LinkedIn']")private WebElement Linkdin;
	
	
	public SwagLabLoginPageNew1 (WebDriver driver) {
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

	public void clickonTwitter() {
		Twitter.click();
	}

	public void clickonfacebook() {
		FaceBook.click();
	}

	public void clickonlinkdin() {
		Linkdin.click();
	}



}
