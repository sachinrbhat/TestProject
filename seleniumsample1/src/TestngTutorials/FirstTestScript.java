package TestngTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestScript {

	@Test(priority=1, description="This test case will verify login functionality")
	public void loginApplication()
	{
		//System.out.println("Login to application");
		Assert.assertEquals(12, 13);
	}
	
	@Test(priority=2, description="This test case will add certain items to the basket")
	public void selectItems()
	{
		System.out.println("Select items");
	}
	
	@Test(priority=3, description="This test case will logout from the shopping cart application")
	public void checkOut()
	{
		System.out.println("Checkout completed");
	}
	
}
