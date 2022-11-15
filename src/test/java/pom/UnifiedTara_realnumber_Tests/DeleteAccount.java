package pom.UnifiedTara_realnumber_Tests;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import pom.UnifiedTara.pages.DeleteAccountPage;

public class DeleteAccount extends BaseTest{  
		 
		 
		String testName="DeleteAccount";
		 
		@Test
		public void Delete_Account() throws MalformedURLException {
			
			test = rep.startTest(testName);
			test.log(LogStatus.INFO, "Starting the test ");
			launchBrowser();
		    test.log(LogStatus.INFO, "Launch Chrome Browser");
		    DeleteAccountPage del=new DeleteAccountPage(aDriver, test);
		    del.DeleteAccount();
			    }

			
		}
		 
	 

