package pom.UnifiedTara.pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pom.UnifiedTara.pages.base.BasePage;

public class DeleteAccountPage extends BasePage{

	public DeleteAccountPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test){
		 super(aDriver,test);
		 
		}
	
	public void DeleteAccount() {
		 aDriver.get("https://uat.tara.app/v0.1/tara/crm/customer/delete-profile?mobileNumber=918123475956&access-key=47pPJvbL8XQMHLrVzyENVF0fZxpmkBI3");
		    test.log(LogStatus.INFO, "Enter Delete API URL");
		 
			    String pagesource=aDriver.getPageSource();
			    if(pagesource.toLowerCase().contains("customer deleted successfully".toLowerCase())) 
				{
			    	//reportPass("Account is deleted successfully");
			    	reportPass("Account is deleted successfully");
				//	System.out.println("Account is deleted successfully");
				   }
			    else if(pagesource.toLowerCase().contains("customer with given mobile number is not present".toLowerCase())) {
			    	reportPass("customer with given mobile number is not present");
			    	//System.out.println("customer with given mobile number is not present");
				    
				}else {
					reportFail("Test Failed");
				}
			    
	}
}
