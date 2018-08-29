package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestCase {

	WebDriver driver;
	
	@Test
	public void googleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("Title:"+driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void titleMatch() {
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}
	
}
