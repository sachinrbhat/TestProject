package YahooMailCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooMailCheck {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//label[text()='Stay signed in']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
	
	}

}
