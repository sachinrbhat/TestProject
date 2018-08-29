package seleniumsample1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGClass2 {
		WebDriver driver = null;
        @BeforeTest
		public void setBaseUrl() {
        	System.out.println("I am inside setBaseUrl");
			System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/V4/");
			try {
				takeSnapShot(driver, "/Users/sachin.rb/Downloads/test.png") ;
			}catch(Exception e) {
				System.out.println("I am inside exception:");
				e.printStackTrace();
			}
		}
        
        @Test
        public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        	try {
            TakesScreenshot scrShot =((TakesScreenshot)webdriver);

            //Call getScreenshotAs method to create image file

                    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

                //Move image file to new destination

                    File DestFile=new File(fileWithPath);

                    //Copy file at destination

                    FileUtils.copyFile(SrcFile, DestFile);
        	}catch(Exception e) {
        		System.out.println("I am inside exception1:");
        		e.printStackTrace();
        	}

        }
        
        @AfterTest
        public void endSession() {
        	System.out.println("I am inside endSession");
        	//driver.quit();
        }
        
}

