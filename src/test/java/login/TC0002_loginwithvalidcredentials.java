package login;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import testbase.homepage;
import testbase.testbaseforproject;

public class TC0002_loginwithvalidcredentials extends testbaseforproject {
	
	homepage homepage;
	
	@BeforeClass
	public void setup() {
		init();
	}
	
	@Test
	public void verifyLoginWithValidCredentials() {
		logger = report.startTest("Login Test2");
		homepage = new homepage(driver);
		homepage.logintoapplication("john.smith5@telusinternal.com", "Koodouat123");
		Assert.assertEquals(homepage.getSuccessfullLoginText1(), "View usage");
		System.out.println("**************************************");
		System.out.println("Successfull Login Text1 verified.....*");
		Assert.assertEquals(homepage.getSuccessfullLoginText2(), "View Tab balance");
		System.out.println("Successfull Login Text2 verified.....*");
		Assert.assertEquals(homepage.getSuccessfullLoginText3(), "View rate plan");
		System.out.println("Successfull Login Text3 verified.....*");
		System.out.println("**************************************");
	}
	
	@AfterClass
	public void endTest() {
		report.endTest(logger);
		report.flush();
		driver.quit();
	}

}
