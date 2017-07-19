package login;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.homepage;
import testbase.testbaseforproject;

public class TC0001_loginwithInavlidCredentials extends testbaseforproject {
	
	homepage homepage;

	@BeforeClass
	public void setup(){
		init();			
	}
	
	
	@Test
	public void verifyLoginWithInvalidCredentials(){
		logger = report.startTest("Login Test1");
		homepage = new homepage(driver);
		homepage.logintoapplication("abcd@test.com", "password");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Something went wrong!");
		logger.log(LogStatus.PASS, "Login failed Authentication Assert successful.....");
		System.out.println("Login failed Authentication Assert successful.....");
		
		
	}
		
	@AfterClass
	public void endTest(){
		report.endTest(logger);
		report.flush();
		driver.quit();
		
	
	}

}
