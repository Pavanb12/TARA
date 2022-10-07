package pom.UnifiedTara_realnumber_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.UnifiedTara.pages.AddProduct_Page;
import pom.UnifiedTara.pages.OTPread_Page;

public class practice  extends BaseTest {

	@Test
	public void Login_readOTP() throws InterruptedException, IOException {
		test = rep.startTest("loginotp_read");
		test.log(LogStatus.INFO, "Starting the test ");
		launchApp();
		Thread.sleep(4000);
//		OTPread_Page OT=new OTPread_Page(aDriver, test);
//		//PageFactory.initElements(aDriver, this);
//		Thread.sleep(10000);
//		OT.OTPValidationMethod("8884254279");
		
		test = rep.startTest("AddProductWithoutName");
		test.log(LogStatus.INFO, "outofstock");
		
		AddProduct_Page addprod=new AddProduct_Page(aDriver, test);
		addprod.NavigationTo_addProduct();

		addprod.PracticeuploadCSVFile();
		
		
			
    }

	}
