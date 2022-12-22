package com_inetBanking_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com_inetBanking_TestBase.TestBase;

public class ScreenShot extends TestBase {
	
	public void screenshot(String filename)
	{    String path = "C:\\Users\\admin\\eclipse-workspace\\inetBanking\\Screenshots\\";
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File Source = ts.getScreenshotAs(OutputType.FILE);
		 File Destination = new File (path+filename+".png");
		 try
		 {
			 FileUtils.copyFile(Source, Destination);
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("SCREENSHOT SAVED SUCCESSFUL");
	}

	
	
}
	