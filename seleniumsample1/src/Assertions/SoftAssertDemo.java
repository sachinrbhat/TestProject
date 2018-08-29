package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void testSoft() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test1 started");
		assertion.assertEquals(12, 13);
		System.out.println("Test completes");
		assertion.assertAll();
	}
	
}
