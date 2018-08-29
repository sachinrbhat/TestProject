package WebTableConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.xpath("//label[text()=\"Onward Date\"]")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[3]")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		
		int total_node = dates.size();
		
		for(int i=0;i<total_node;i++) {
			
			String date = dates.get(i).getText();
			if(date.equalsIgnoreCase("29")) {
				dates.get(i).click();
				System.out.println("I am inside if block");
				break;
			}
			
			
		}
	    
	
	}

}
