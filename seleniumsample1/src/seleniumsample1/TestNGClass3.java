package seleniumsample1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class TestNGClass3 {
		public static WebDriver driver;
        @BeforeTest
		public void setBaseUrl() {
        	System.out.println("I am inside setBaseUrl");
			System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
        }
        
        @Test
        public void dragAndDrop() {
        	System.out.println("I am inside dragandDrop");
        	WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        	WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
        	Actions builder = new Actions(driver);
        	Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
        	dragAndDrop.perform();
        	 
        }
        
        @AfterTest
        public void endSession() {
        	System.out.println("I am inside endSession");
        	//driver.quit();
        }
        
}

