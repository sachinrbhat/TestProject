package seleniumsample1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverClass {
	public static void main(String args[]){

		try {
			System.setProperty("webdriver.chrome.driver", "/Users/sachin.rb/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
			//driver.get("https://www.facebook.com");
			/*driver.findElement(By.id("email")).sendKeys("sachinrbhatkumta@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("isitcorrect85");
			WebElement element = driver.findElement(By.className("item-page"));
			WebElement element1 = element.findElement(By.xpath("//h3[1]"));
			System.out.println("text:"+element1.getText());*/
			/*driver.findElement(By.id("u_0_6")).click();*/
			/*WebElement element = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
			System.out.println("text:"+element.getText());*/
			/*List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]/following-sibling::*"));
			for(int i=0;i<elements.size();i++) {
				WebElement element = elements.get(i);
				System.out.println("text:"+element.getText());
			}*/
			/*List<WebElement> cols = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
			System.out.println("Number of columns are :"+cols.size());
			List<WebElement> rows = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
			System.out.println("Number of rows are :"+rows.size());*/
		    /*WebElement element = driver.findElement(By.xpath(".//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/descendant-or-self::*"));
			System.out.println("text::"+element.getText());*/
			
			/*WebElement element = driver.findElement(By.xpath("//input[@type=\'email\']"));
			element.sendKeys("sachinrbhatkumta@gmail.com");
			WebElement element2 = driver.findElement(By.xpath("//input[@type=\'password\']"));
			element2.sendKeys("isitcorrect85");
			WebElement element3 = driver.findElement(By.xpath("//input[@value=\'Log In\']"));
			element3.submit();*/
			/*WebElement radio = driver.findElement(By.id("vfb-7-1"));
			radio.click();*/
			/*WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
			checkbox.click();
			if(checkbox.isSelected()) {
				System.out.println("Checkbox is selected");
			}
			driver.switchTo().defaultContent();*/
			Thread.sleep(5000);
			//driver.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
