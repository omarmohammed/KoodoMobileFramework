package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

public class homepage extends testbaseforproject {
	
	//@FindBy(xpath=" //li[@id='li-self-serve-4423-1']")
	
	@FindBy(xpath="//a[@title='Self Serve']")	
	WebElement selfServe;
	
	@FindBy(xpath="//input[@id='IDToken1']")
	WebElement loginEmail;
	
	@FindBy(xpath="//input[@id='IDToken2']")
	WebElement loginPassword;
	
	@FindBy(xpath="//div[@class='submit-button']")
	WebElement loginSubmit;
	
	@FindBy(xpath="//div[@class='loginPage-globalErrorHeading']/h2")
	WebElement loginAuthFailed;
	
	
	@FindBy(xpath="//div[@class='overview-card-links']/a[1]/div")
	WebElement successfullLoginText1;
	
	@FindBy(xpath="//div[@class='overview-card-links']/a[2]/div")
	WebElement successfullLoginText2;
	
	@FindBy(xpath="//div[@class='overview-card-links']/a[3]/div")
	WebElement successfullLoginText3;
	
	
		
	public homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickSelfServe() {
		selfServe.click();
		System.out.println("Clicked on Self Serve");
		
	}
	
	public void logintoapplication(String emailAddress, String password) {
		try {
			selfServe.click();
			System.out.println("Clicked on Self Serve");
			
			loginEmail.sendKeys(emailAddress);
			loginPassword.sendKeys(password);
			logger.log(LogStatus.PASS, "Entered Email address " + emailAddress +" and Password "+password);
			System.out.println("Entered Email address and Password");
			loginSubmit.click();
			logger.log(LogStatus.PASS, "Clicked on Login Submit Button");
			
			System.out.println("Clicked on Login Submit Button");
			
		} catch (Exception e) {
			//logger.log(LogStatus.FAIL, "Invalid email address and password");
			logger.log(LogStatus.FAIL, "Invalid email address and password " +logger.addScreenCapture(testbaseforproject.screenshot()));
			logger.log(LogStatus.INFO, e);
		}
				
	}
	
	public String getInvalidLoginText() {
		
		return loginAuthFailed.getText();
	}
	
	public String getSuccessfullLoginText1() {
		
		return successfullLoginText1.getText();
		
	}
	
	public String getSuccessfullLoginText2() {
		
		return successfullLoginText2.getText();
		
	}

	public String getSuccessfullLoginText3() {
	
		return successfullLoginText3.getText();
	
}
	
	

}




