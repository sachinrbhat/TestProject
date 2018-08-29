package seleniumsample1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGClass4 {
		public static WebDriver driver;
        @BeforeTest
		public void setBaseUrl() {
        	try {
        	System.out.println("I am inside setBaseUrl");
			System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
        	}catch(Exception e) {
        		System.out.println("I am inside exception:");
        		e.printStackTrace();
        	}
		}
        
        @Test
        public void verifyHomepageTitle() {
        	System.out.println("I am inside verifyHomepageTitle");
        	WebElement element = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i/u"));
        	if(element.getText().equalsIgnoreCase("facebook")) {
        		System.out.println("Found title:");
        	}
        }
       
       /* @AfterTest
        public void endSession() {
        	System.out.println("I am inside endSession");
        	driver.quit();
        }*/
        
}

