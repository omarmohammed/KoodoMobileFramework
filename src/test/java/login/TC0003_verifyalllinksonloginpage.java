package login;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import selfServe.loginpage;
import testbase.homepage;
import testbase.testbaseforproject;

public class TC0003_verifyalllinksonloginpage extends testbaseforproject {
	
	homepage homepage;
	loginpage loginpage;
	
	@BeforeClass
	public void setup() {
		init();
	}
	
	@Test
	public void verifyalllinksonloginpage() {
		logger = report.startTest("Verify Forgot Email Link on Login Page");
		verifyForgotEmailLinkOnLoginPage();
		init();
		verifyForgotPasswordLinkOnLoginPage();
		
	}
	public void verifyForgotEmailLinkOnLoginPage() {
		
		homepage = new homepage(driver);
		homepage.clickSelfServe();
		loginpage = new loginpage(driver);
		loginpage.verifyForgotEmailLink();
		Assert.assertEquals(loginpage.getForgotEmailUserOnTextOldpageText(), "Forgot your email/username123?");
		System.out.println("Verified Forgot your Email Text on old page");
		logger.log(LogStatus.PASS, "Verified Forgot your Email Text on old page");
		report.endTest(logger);
		report.flush();
		driver.quit();
	}
	public void verifyForgotPasswordLinkOnLoginPage() {
		logger = report.startTest("Verify Forgot password Link on Login Page");
		homepage = new homepage(driver);
		homepage.clickSelfServe();
		loginpage = new loginpage(driver);
		loginpage.verifyForgotPasswordLink();
		Assert.assertEquals(loginpage.getForgotPasswordSuccessMessageText(), "Enter your details and we'll send you a secure email.");
		System.out.println("Verified Forgot your Email Text on old page");
		logger.log(LogStatus.PASS, "Verified Forgot your Email Text on old page");
		
	}
	
	
	
	@AfterClass
	public void endTest() {
		report.endTest(logger);
		report.flush();
		driver.quit();
	}


}
