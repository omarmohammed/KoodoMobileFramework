package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;

public class Firefox_Test {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.koodomobile.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\x201640\\Documents\\Omar\\Automation Related\\Automation Tools Downloads\\geckodriver.exe");


File pathToBinary = new File("C:\\Users\\x201640\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
FirefoxProfile firefoxProfile = new FirefoxProfile();  
 driver = new FirefoxDriver(ffBinary,firefoxProfile);

  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
