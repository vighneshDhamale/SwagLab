package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifcation");
		options.addArguments("headless");
		
		driver.navigate().to("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	return driver;
	
}
}