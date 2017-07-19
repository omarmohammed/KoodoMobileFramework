package testbase;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import support.ConfiguratorSupport;

public class testbaseforproject {
	
	public static WebDriver driver;
	public ConfiguratorSupport config= new ConfiguratorSupport("config.properties");
	//String url = "https://www.koodomobile.com/";
	//String browser = "firefox";
	
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeTest
	public void report()
	{
		report = new ExtentReports("Reports/MyReports.html");
	}
	
	public void init(){
		selectBrowser(config.getProperty("browser"));
		//Read url from Property File
		getUrl(config.getProperty("url"));
		//getUrl("https://digital:notwebchannel@koodo-my-account.qa11-prod.wctest.telus.com/my-account/");
		
	}
	
	public void selectBrowser(String browser){
		
		if(browser.equalsIgnoreCase("firefox")){
			//System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\x201640\\Documents\\Omar\\Automation Related\\Automation Tools Downloads\\geckodriver.exe");
			 //DesiredCapabilities d = new DesiredCapabilities();
			  //d.acceptInsecureCerts();
			  driver= new FirefoxDriver();
			 
		}
		else if(browser.equalsIgnoreCase("chrome")){
			//System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.marionette", System.getProperty("user.dir") + "/drivers/chromedriver");
			driver = new ChromeDriver();
			
		}
	}
	
	public void getUrl(String url){
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public static String screenshot()
	{
		String src_path=System.getProperty("user.dir")+"Screenshot\\";
		UUID uuid = UUID.randomUUID();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(src_path+uuid+".jpeg"));
			// TODO: handle exception
		}
		catch(Exception e)
		{
			System.out.println("Unable tp capture screenshot");
		}
		return src_path+uuid+".jpeg";
	}
	
		

}
