package selfServe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.homepage;
import testbase.testbaseforproject;

import com.relevantcodes.extentreports.LogStatus;

public class loginpage extends testbaseforproject {
	
	homepage homepage;
	
	@FindBy(xpath="//form[@id='login']/div[1]/a")
	WebElement forgotEmail;
	
	@FindBy(xpath="//h1[@id='pageTitle1']")
	WebElement forgotEmailUserOnTextOldpage;
	
	
	@FindBy(xpath="//form[@id='login']/div[2]/a")
	WebElement forgotPassword;
	
	@FindBy(xpath=" //li[@id='li-self-serve-4423-1']")
	WebElement registerNow;
	
	@FindBy(xpath="//div[@class='page-header']/h2")
	WebElement confirmForgotPasswordSuccessLandingText;
	
	@FindBy(xpath=" //li[@id='li-self-serve-4423-1']")
	WebElement letsDoThisOnRegistration;
	
	@FindBy(xpath=" //li[@id='li-self-serve-4423-1']")
	WebElement prepaidCustomerTab;
	
	@FindBy(xpath=" //li[@id='li-self-serve-4423-1']")
	WebElement loginRegisterOnPrepaid;
	
	@FindBy(xpath=" //li[@id='li-self-serve-4423-1']")
	WebElement activateYourPhoneOnPrepaid;
	

	public loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
	public void verifyForgotEmailLink() {
		forgotEmail.click();
		
	}
	
	public void verifyForgotPasswordLink() {
		forgotPassword.click();
		
	}
	
	public void verifyRegisterNowLink() {
		
	}
	
	public void verifyLoginOnPrepaid() {
		
	}
	
	public void verifyActivateOnPrepaid() {
		
	}
	
	//Return Text to verify
	
	public String getForgotEmailUserOnTextOldpageText() {
		
		return forgotEmailUserOnTextOldpage.getText();
	}
	
	
	public String getForgotPasswordSuccessMessageText() {
		
		return confirmForgotPasswordSuccessLandingText.getText();
	}
	
	
	
	
	
	
	
	
	
	
}
