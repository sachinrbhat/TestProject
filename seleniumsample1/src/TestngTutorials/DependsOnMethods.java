package TestngTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
    @Test
	public void startApp() {
    	
		driver.get("http://enterprise-demo.orangehrmlive.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("auth/login"));
	}

    @Test(dependsOnMethods="startApp")
    public void loginApp() {
    	driver.findElement(By.id("txtUsername")).sendKeys("admin");
    	driver.findElement(By.id("txtPassword")).sendKeys("admin");
    	driver.findElement(By.xpath("//input[@name='Submit']")).click();
    }
    
    @Test(dependsOnMethods="loginApp")
    public void logoutApp() {
    	
    }
    
    @AfterClass
    public void closeApp() {
    	driver.quit();
    }
    
}
