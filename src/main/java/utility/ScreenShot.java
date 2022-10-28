package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver,String name) throws IOException { 
	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	File Destination=new File("D:\\.metadata\\.plugins\\SwagLab\\Screenshot\\"+name+".png");
	
	FileHandler.copy(Source, Destination);
	
}
}
