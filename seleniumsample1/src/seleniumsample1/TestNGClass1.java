package seleniumsample1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGClass1 {
		WebDriver driver = null;
        @BeforeTest
		public void setBaseUrl() {
        	System.out.println("I am inside setBaseUrl");
			System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
			/*try {
				takeSnapShot(driver, "/Users/sachin.rb/Downloads/test.png") ;
			}catch(Exception e) {
				System.out.println("I am inside exception:");
				e.printStackTrace();
			}*/
		}
        
        @Test
        public void verifyHomepageTitle() {
        	System.out.println("I am inside verifyHomepageTitle");
        	WebElement element = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i/u"));
        	if(element.getText().equalsIgnoreCase("facebook")) {
        		System.out.println("Found title:");
        	}
        }
        
        @Test
        public void verifyLogin() {
        	System.out.println("I am inside verifyLogin");
        	driver.findElement(By.name("email")).sendKeys("sachinrbhatkumta@gmail.com");
        }
        
        @BeforeMethod
        public void beforeMethod() {
        	System.out.println("I am inside beforeMethod");
        }
        
        @AfterMethod
        public void afterMethod() {
        	System.out.println("I am inside afterMethod");
        }
        
        @AfterTest
        public void endSession() {
        	System.out.println("I am inside endSession");
        	//driver.quit();
        }
        
       /* @Test
        public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

            //Convert web driver object to TakeScreenshot
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

        }*/
        
}

