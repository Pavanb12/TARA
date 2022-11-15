package pom.UnifiedTara_realnumber_Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.UnifiedTara.pages.AddProduct_Page;


public class AddProduct_Test extends BaseTest
{
	String testName1="addproduct";
	String testName2="EditProduct";
	String testName3="Deleteproduct";

	

	@Test
	public void Test1_addproduct() throws InterruptedException, IOException {
		test = rep.startTest(testName1);
		test.log(LogStatus.INFO, "Starting the add product test ");
		launchApp();
		Thread.sleep(4000);
		System.out.println("Started Add Product test!");
//		OTPread_Page otppage=new OTPread_Page(aDriver, test);
//	
//		otppage.OTPValidationMethod(TMConstants.RealMobileNumber);
		//Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
//		add_paymentoption_Page addpay=new add_paymentoption_Page(aDriver, test);
//		addpay.navigatetomerchantiflareadyuser();
		
		//addpay.add_creditcard();
		AddProduct_Page addprod=new AddProduct_Page(aDriver, test);
		//sp.SwithUser("Merchant");
		addprod.NavigationTo_addProduct();
		addprod.AddProduct();
	}
	@Test
	public void Test2_EditProduct() throws InterruptedException, IOException {
	
		test = rep.startTest(testName2);
		test.log(LogStatus.INFO, "Starting the edit product test ");
		
		AddProduct_Page addprod=new AddProduct_Page(aDriver, test);
		//sp.SwithUser("Merchant");
		addprod.EditProduct();
	}
	
	@Test
	public void Test3_Deleteproduct() throws InterruptedException
	{
		test = rep.startTest(testName3);
		test.log(LogStatus.INFO, "Starting the delete product test ");
		
		AddProduct_Page addprod=new AddProduct_Page(aDriver, test);
		addprod.DeleteProduct();
	}
	
	
	@Test 
	public void Test4_AddProductWithoutName() throws InterruptedException
	{
		test = rep.startTest("AddProductWithoutName and more discount than price test");
		test.log(LogStatus.INFO, "Starting the AddProduct Without Name");
		
		AddProduct_Page addprod=new AddProduct_Page(aDriver, test);
		addprod.AddProductWithoutName();
//        aDriver.navigate().back();
//        Thread.sleep(2000);

        
	}

	
	
	
	
}
		

