package pom.UnifiedTaraTests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.UnifiedTara.pages.HomePage;
import pom.UnifiedTara.pages.OTPread_Page;
import pom.UnifiedTara.pages.Promotion_Page;
import pom.UnifiedTara.pages.voucher_page;
import pom.UnifiedTara.util.TMConstants;

public class AddPromotion_Test extends BaseTest {

	@Test
	public void Test1_AddPromotion() throws InterruptedException, IOException { 
		test = rep.startTest("add Voucher Test:");
		test.log(LogStatus.INFO, "Starting the add voucher test ");
		launchApp();
		Thread.sleep(4000);
		HomePage hm; 
		hm=new HomePage(aDriver, test);
		if(!hm.isElementPresent(TMConstants.Mobile_Text1)){
			hm.reportFail("login page is not not loaded");
		}
		hm.OTPValidation(TMConstants.MobileNumber,TMConstants.OTP0,TMConstants.OTP1,TMConstants.OTP2,TMConstants.OTP3,TMConstants.OTP4,TMConstants.OTP5);				
		
			
	voucher_page vou=new voucher_page(aDriver, test);
   vou.NavigationTo_voucher();
    Promotion_Page pro=new Promotion_Page(aDriver, test);
    pro.addPromotion();
   
	}
}
