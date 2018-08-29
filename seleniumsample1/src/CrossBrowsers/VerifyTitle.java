package CrossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("I am inside chrome if block");
			System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
			driver = new ChromeDriver();
		}else {
			
		}
		
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
