package HiddenElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FFHiddenWebElements {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		List<WebElement> radio = driver.findElements(By.id("male"));
		System.out.println("Total radio buttons are : "+radio.size());
		
		for(int i=0; i<radio.size(); i++) {
			int x = radio.get(i).getLocation().getX();
			if(x!=0) {
				radio.get(i).click();
				break;
			}
		}
		
		
	}

}
