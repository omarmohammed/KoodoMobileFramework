package sample;

public class sample2 {
	
//	
//	
//	package com.test.automation.UIAutomation.UIActions;
//
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//
//	import java.util.concurrent.TimeUnit;
//
//
//	import org.apache.log4j.Logger;
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.JavascriptExecutor;
//	import org.openqa.selenium.support.FindBy;
//	import org.openqa.selenium.support.PageFactory;
//	import org.openqa.selenium.support.ui.Select;
//
//	import com.test.automation.UIAutomation.homePage.TC001_verifyLoginWithInvalidCredentials;
//	import com.test.automation.UIAutomation.testbase.testBase;
//
//	public class HomePage extends testBase {
//		
//		public static final Logger log = Logger.getLogger(HomePage.class.getName());
//		
//		WebDriver driver;
//		
//		
//		@FindBy(xpath="//a[@class='link menu-desktop__login-link']")
//		WebElement signIn;
//		
//		@FindBy(xpath="//input[@id='email' and @aria-label='Email']")
//		WebElement loginEmail;
//		
//		@FindBy(xpath="//input[@id='password' and @aria-label='Password']")
//		WebElement loginPasswrord;
//		
//		@FindBy(xpath="//button[@class='button button--block button--theme-base' and @aria-label='Confirm and sign in to your PC ID account']")
//		WebElement loginbutton;
//		
//		@FindBy(xpath="//span[@id='desktop-menu-account']/span")
//		WebElement accountTextAfterLogin;
//		
//		@FindBy(xpath="//ul[@class='menu-desktop__submenu']/li[5]/a/span/span")
//		WebElement logout;
//		
//		@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")
//		WebElement authenticatiofail;
//		
//		
//		@FindBy(xpath="//button[@class='button button--small button--theme-link-gray promoted-action__decline']")
//		WebElement noThanks;
//		
//		
//		
//		//Registration xpaths
//		
//		@FindBy(xpath="//a[@class='link menu-desktop__register-link' and @aria-label='Register online for a PC Optimum account']")
//		WebElement registerOnline;
//		
//		@FindBy(xpath="//input[@id='preferredName']")
//		WebElement registrationFirstName;
//		
//		@FindBy(xpath="//input[@id='email']")
//		WebElement registrationEmail;
//		
//		@FindBy(xpath="//input[@id='password']")
//		WebElement registrationPassword;
//		
//		@FindBy(xpath="//form[@id='newUserRegistration']/div[5]/div")
//		WebElement registrationTC;
//		
//		@FindBy(xpath="//button[@class='button button--block button--theme-base new-user-registration-form__submit-button']")
//		WebElement registrationSubmit;
//		
//		@FindBy(xpath="//button[@class='button button--inline button--theme-link']")
//		WebElement wizardCancel1;
//		
//		@FindBy(xpath="//button[@class='button button--inline button--theme-base button--theme-transparent activate-pc-optimum__no-button']")
//		WebElement wizardNo1;
//		
//		@FindBy(xpath="//button[@class='button button--inline button--theme-base button--theme-transparent legacy-transfer__button']")
//		WebElement wizardNo2;
//		
//		
//		
//			
//		public HomePage(WebDriver driver){
//			PageFactory.initElements(driver, this);
//			
//		}
//		
//		public void logintoApplication(String emailAddress, String password){
//			signIn.click();
//			log.info("Clicked on Sign in button and Object is" + signIn.toString());
//			loginEmail.sendKeys(emailAddress);
//			log.info("Clicked on Email in button and Object is" + emailAddress.toString());
//			loginPasswrord.sendKeys(password);
//			log.info("Clicked on Password button and Object is" + loginPasswrord.toString());
//			loginbutton.click();
//			log.info("Clicked on Submit button and Object is" + loginbutton.toString());
//			noThanks.click();
//			log.info("Clcked on No Thanks");
//			
//			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		}
//		
//		public void registrationWithExcel(String firstName, String emailAddress, String password){
//			registerOnline.click();
//			registrationFirstName.sendKeys(firstName);
//			registrationEmail.sendKeys(emailAddress);
//			registrationPassword.sendKeys(password);
//			registrationTC.click();
//			registrationSubmit.click();
//			
//			//JavascriptExecutor jse = (JavascriptExecutor)driver;
//			//jse.executeScript("window.scrollBy(0,250)", "");
//			
//			wizardNo1.click();
//			//waitForElement(20, wizardNo2);
//			//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//			wizardNo2.click();
//			//wizardCancel1.click();
//			log.info("***** Clicked on Registration Submit ******");
//					
//		}
//		
//		public String getInvalidLoginText(){
//			log.info("Error message is " + authenticatiofail.toString());
//			return authenticatiofail.getText();
//		}
//		
//		
//		public Boolean verfiyAccoutnisDisplayed(){
//			
//			try{
//				waitForElement(300, accountTextAfterLogin);
//				accountTextAfterLogin.isDisplayed();
//				log.info("******* Account button displayed after Login & object is ****** " + accountTextAfterLogin.toString());
//				return true;
//			}catch(Exception E){
//				return false;
//			}
////			
//		}
//		
//		
//		
//		
//		
//		public void clockonLogout(){
//			log.info("====== Starting Logout Process ========");
//			accountTextAfterLogin.click();
//			log.info("====== Clicked on Account Button ========");
//			
//			logout.click();
//			log.info("*** Clicked on Logout ****");
//			//waitForElement(20, logout);
//			
//		}
//		
//		
// ****************************** Test Base Sample *****************************
//	package com.test.automation.UIAutomation.testbase;
//
//	import java.io.File;
//	import java.io.IOException;
//	import java.text.SimpleDateFormat;
//	import java.util.Calendar;
//	import java.util.concurrent.TimeUnit;
//	import java.text.SimpleDateFormat;
//	import java.util.Calendar;
//	import java.util.GregorianCalendar;
//	import java.util.Iterator;
//	import java.util.Properties;
//	import java.util.Set;
//	import java.util.concurrent.TimeUnit;
//	import org.apache.commons.io.FileUtils;
//	import org.apache.log4j.Logger;
//	import org.apache.log4j.PropertyConfigurator;
//	import org.openqa.selenium.OutputType;
//	import org.openqa.selenium.TakesScreenshot;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.firefox.FirefoxDriver;
//	import org.openqa.selenium.support.FindBy;
//	import org.openqa.selenium.support.ui.ExpectedConditions;
//	import org.openqa.selenium.support.ui.WebDriverWait;
//	import org.testng.Reporter;
//
//	import com.test.automation.UIAutomation.excelReader.Excel_Reader;
//
//	public class testBase {
//		
//		public static final Logger log = Logger.getLogger(testBase.class.getName());
//		
//		public WebDriver driver;
//		String url = "https://bloyalty-dev1.loblaw.ca/";
//		String browser = "firefox";
//		Excel_Reader excel;
//		
//		public void init(){
//			selectBrowser(browser);
//			getUrl(url);
//			String log4jConfigPath = "log4j.properties";
//			PropertyConfigurator.configure(log4jConfigPath);
//			
//			
//		}
//		
//		public void selectBrowser(String browser){
//			
//			if(browser.equalsIgnoreCase("firefox")){
//				System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver");
//				log.info("Creating Object of"+browser);
//				driver = new FirefoxDriver();
//			}
//			else if(browser.equalsIgnoreCase("chrome")){
//				System.out.println(System.getProperty("user.dir"));
//				System.setProperty("webdriver.chrome.marionette", System.getProperty("user.dir") + "/drivers/chromedriver");
//				driver = new ChromeDriver();
//				
//			}
//		}
//		
//		public void getUrl(String url){
//			log.info("Navigating to "+url);
//			driver.get(url);
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		}
//		
//		public void getScreenShot(String name) {
//
//			Calendar calendar = Calendar.getInstance();
//			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
//
//			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//			try {
//				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/com/test/automation/UIAutomation/screenshots/";
//				File destFile = new File((String) reportDirectory + name + "_" + formater.format(calendar.getTime()) + ".png");
//				FileUtils.copyFile(scrFile, destFile);
//				// This will help us to link the screen shot in testNG report
//				Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		public String[][] getData(String excelName, String sheetName){
//			
//			///Users/omamoha/Documents/workspace/UIAutomation/src/main/java/com/test/automation/UIAutomation/data/TestData.xlsx
//			String path = System.getProperty("user.dir") + "/src/main/java/com/test/automation/UIAutomation/data/"+ excelName;
//			excel = new Excel_Reader(path);
//			String[][] data = excel.getDataFromSheet(sheetName, excelName);
//			return data;
//			
//		}
//		
//		
//		
//		public void waitForElement(int timeOutInSeconds, WebElement element){
//			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
//			wait.until(ExpectedConditions.visibilityOf(element));
//		}
//		
		
		
		/*public void getSimpleScreeShot() throws Exception{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "src/main/java/com/test/automation/UIAutomation/screenshots/";
			File destFile = new File((String) reportDirectory + ".png");
			FileUtils.copyFile(scrFile, destFile);
	}*/
	
		
//#####################login#################
	
//	package com.test.automation.UIAutomation.homePage;
//
//	import java.util.concurrent.TimeUnit;
//
//	import org.apache.log4j.Logger;
//	//import org.junit.AfterClass;
//	//import org.junit.Test;
//	import org.openqa.selenium.By;
//	import org.testng.annotations.BeforeClass;
//	import org.testng.Assert;
//	import org.testng.annotations.AfterClass;
//	import org.testng.annotations.Test;
//
//	import com.test.automation.UIAutomation.UIActions.HomePage;
//	import com.test.automation.UIAutomation.testbase.testBase;
//
//	public class TC001_verifyLoginWithInvalidCredentials extends testBase {
//		
//		public static final Logger log = Logger.getLogger(TC001_verifyLoginWithInvalidCredentials.class.getName());
//		
//		HomePage homepage;
//		
//		@BeforeClass
//		public void setup(){
//			init();			
//		}
//		
//		
//		@Test
//		public void verifyLoginWithInvalidCredentials(){
//			log.info("*****************Starting verifyLoginWithInvalidCredentials***************");
//			homepage = new HomePage(driver);
//			homepage.logintoApplication("test@gmail.com", "password");		
//			Assert.assertEquals(homepage.getInvalidLoginText() , "Authentication failed.");
//			log.info("*****************Finishing verifyLoginWithInvalidCredentials***************");
//		}
//			
//		@AfterClass
//		public void endTest(){
//			driver.close();
//		
//		}
//
//
//
//
//	}


//		
//
//	}


}
