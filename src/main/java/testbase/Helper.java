package testbase;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper extends testbaseforproject{
	
	public static String screenshot(WebDriver driver)
	{
		String src_path="/SShot/";
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
