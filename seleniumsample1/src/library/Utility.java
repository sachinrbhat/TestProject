package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		}catch(Exception e) {
			System.out.println("Exception while taking screenshot:"+e.getMessage());
		}
		System.out.println("Screenshot Taken");
	}
	
}
