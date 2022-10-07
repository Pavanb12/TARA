package pom.UnifiedTara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pom.UnifiedTara.pages.base.BasePage;

public class voucher_page extends BasePage{

	    @FindBy(xpath="//android.widget.ImageView[@content-desc='Coupons']")
	    public WebElement coupons;  

	   @FindBy(xpath="//android.widget.ImageView[@content-desc=\"Add Voucher\"]")
	    public WebElement addVoucherBtn;
	    
	    @FindBy(xpath="//android.widget.EditText[@index='2']")
	    public WebElement titleTextbox;
	    
	    @FindBy(xpath="(//android.widget.EditText[@index='0'])[2]")
	    public WebElement maxCapTextbox;
	    
	    @FindBy(xpath="(//android.widget.EditText[@index='0'])[3]")
	    public WebElement voucherValue;
	    
	    @FindBy(xpath="(//android.widget.EditText[@index='0'])[4]")
	    public WebElement min_amt;
	    
	    @FindBy(xpath="//android.view.View[12]")
	    public WebElement no_of_times;
	    
	    @FindBy(xpath="//android.view.View[@index='16']")
	    public WebElement startDate;
	    
	    @FindBy(xpath="//android.view.View[@content-desc=TMConstants.todayDate]")
	    public WebElement selectstartDate;
	    
	    @FindBy(xpath="//android.widget.Button[@index='6']")
	    public WebElement clickok; 
	    
	    @FindBy(xpath="//android.widget.Button[@index='3']")
	    public WebElement NextMonth; 
	    
	    @FindBy(xpath="//android.view.View[@index='17]")
	    public WebElement endDate;
	    
	    @FindBy(xpath="//android.view.View[@content-desc=\"Edit Voucher\"]")
	    public WebElement editvoucherTitle;
	    
	    @FindBy(xpath="//android.widget.EditText[@index='1']")
	    public WebElement editvoucheTextbox;
	    
	    @FindBy(xpath="//android.widget.ImageView[@content-desc=\"Edit Voucher\"]")
	    public WebElement editvoucheButton;
	    	    
	    @FindBy(xpath="(//android.view.View)[36]")
	    public WebElement selectendDate; 
	    
	    @FindBy(xpath= "//android.widget.ImageView[@content-desc='Profile']")
	    public WebElement SellerProfileMenu; 
	  	    
	    @FindBy(xpath="//android.widget.ImageView[@content-desc='Next']")
	    public WebElement next;
	    
	    @FindBy(xpath="//android.view.View[@content-desc=\"Select all\"]")
	    public WebElement SelectAll_Products;
	    @FindBy(xpath="//android.widget.ImageView[@content-desc=\"Continue\"]")
	    public WebElement Continue_Button;
	    
	    @FindBy(xpath="(//android.view.View[@index='4'])[1]")
	    public WebElement percent_button;
	    
	    //Edit
	    @FindBy(xpath="(//android.view.View[@content-desc=\"EDIT\"])[1]")
	    public WebElement EditButton;
	    
	    
	    	     
	    public voucher_page(AndroidDriver<AndroidElement> aDriver, ExtentTest test){
	         super(aDriver,test);
	           
	        }
	    
	    public void NavigationTo_voucher() throws InterruptedException {
	    	
	         waitForElementforClick(SellerProfileMenu, 30);
            Thread.sleep(2000);
			
            TouchAction action = new TouchAction(aDriver);
            int x = aDriver.manage().window().getSize().getWidth()/2;
	        int y = aDriver.manage().window().getSize().getHeight()/2;
            
            action.longPress(x, y).moveTo(x, y-(y)).release().perform(); 
	        Thread.sleep(3000);
	        action.longPress(x, y).moveTo(x, y-(y)).release().perform(); 
	        waitForElementforClick(coupons, 20);
		}
	     
	    public void NavigationTo_Promotion() throws InterruptedException {
	    	
         	
	    	Thread.sleep(2000);

			waitForElementforClick(SellerProfileMenu, 20);
            Thread.sleep(2000);
			
            TouchAction action = new TouchAction(aDriver);
            int x = aDriver.manage().window().getSize().getWidth()/2;
	        int y = aDriver.manage().window().getSize().getHeight()/2;
            
            action.longPress(x, y).moveTo(x, y-(y)).release().perform(); 
	        Thread.sleep(3000);

		}
	    
	    
	    public void AddVoucherRP() throws InterruptedException
	    {
	    	        
	     //   waitForElementforClick(coupons, 20);
			test.log(LogStatus.INFO, "clicking add Voucher"); 

	        waitForElementforClick(addVoucherBtn, 20);
			test.log(LogStatus.INFO, "Entering add Voucher details"); 
						
	      //  waitForElementforClick(percent_button, 20);

	        waitForElementforType(titleTextbox, 20, "DemoVoucherRP");
	        aDriver.hideKeyboard();
	        waitForElementforType(maxCapTextbox, 20, "500");
	        aDriver.hideKeyboard();
	        waitForElementforType(voucherValue, 20, "50");

	        aDriver.hideKeyboard();
	        waitForElementforType(min_amt, 20, "50");
	        Thread.sleep(3000);
	        aDriver.hideKeyboard();
	        waitForElementforClick(no_of_times, 20);
	        
	        aDriver.hideKeyboard();
	        Thread.sleep(200);
	        waitForElementforClick(startDate, 20);
	       // waitForElementforClick(selectstartDate, 20);
	        
	        waitForElementforClick(clickok, 30);
	        
	        aDriver.hideKeyboard();
	        
	        waitForElementforClick(endDate, 20);
	        
	        waitForElementforClick(NextMonth, 20);
        
	        waitForElementforClick(selectendDate, 20);
	        
	        waitForElementforClick(clickok, 20);
	        
	        aDriver.hideKeyboard();
	        waitForElementforClick(next, 10);
	        
			test.log(LogStatus.INFO, "clicking next"); 
			Thread.sleep(4000);

	        waitForElementforClick(SelectAll_Products, 10);
	        
	        waitForElementforClick(Continue_Button, 10);
			Thread.sleep(8000);

	        String voucherPage=aDriver.getPageSource();
	        if(voucherPage.contains("DemoVoucherRP")) {
	        	reportPass("voucher created");
	        	        	
	        }
	        else{
	        	reportFail("Voucher Created Failed.");
	        	
	        }
	     			
	    }
	    
	    public void AddVoucher_percent() throws InterruptedException
	    {
	    	        
			test.log(LogStatus.INFO, "clicking add Voucher to create % type voucher"); 

	        waitForElementforClick(addVoucherBtn, 20);
			test.log(LogStatus.INFO, "Entering add Voucher details"); 
            
		   waitForElementforClick(percent_button, 20);

			
	        waitForElementforType(titleTextbox, 20, "DemoVoucher%");
	        aDriver.hideKeyboard();

	        
	        waitForElementforType(maxCapTextbox, 20, "1000");

	        aDriver.hideKeyboard();

	        waitForElementforType(voucherValue, 20, "5");

	        aDriver.hideKeyboard();

	        
	        waitForElementforType(min_amt, 20, "500");

	        
	        aDriver.hideKeyboard();
	        waitForElementforClick(no_of_times, 20);
	        
	        aDriver.hideKeyboard();
	        Thread.sleep(200);
	        waitForElementforClick(startDate, 20);
	       // waitForElementforClick(selectstartDate, 20);
	        
	        waitForElementforClick(clickok, 20);
	        
	        aDriver.hideKeyboard();
	        
	        waitForElementforClick(endDate, 20);
	        waitForElementforClick(NextMonth, 20);

	        waitForElementforClick(selectendDate, 20);
	        
	        waitForElementforClick(clickok, 20);
	        
	        aDriver.hideKeyboard();
	        waitForElementforClick(next, 10);
	        
			test.log(LogStatus.INFO, "clicking next"); 
			Thread.sleep(4000);

	        waitForElementforClick(SelectAll_Products, 10);
	        
	        waitForElementforClick(Continue_Button, 10);
			Thread.sleep(8000);

	        String voucherPage=aDriver.getPageSource();
	      //  System.out.println(voucherPage);
	        if(voucherPage.contains("DemoVoucher%")) {
	        	reportPass("voucher created");
	        	        	
	        }
	        else{
	        	reportFail("Voucher Created Failed.");
	        	
	        }
	  			
	    }
	    
	    public void EditVoucher() throws InterruptedException
	    {
	    	        
			test.log(LogStatus.INFO, "clicking Edit Voucher"); 

	        waitForElementforClick(EditButton, 20);
			Thread.sleep(6000);
			
			if(isElementDisplayed(editvoucherTitle))
			{
				System.out.println("in voucher edit block");
				test.log(LogStatus.INFO, "Editing Voucher details"); 
					
		        waitForElementforType(editvoucheTextbox, 20, "voucherEdited");
                
		        aDriver.hideKeyboard();

		        waitForElementforType(maxCapTextbox, 20, "501");
		        
		        aDriver.hideKeyboard();

		        waitForElementforType(voucherValue, 20, "5");
	        
		        aDriver.hideKeyboard();

		        waitForElementforClick(min_amt, 20);
		        typeText(min_amt, "100");
		        
		        aDriver.hideKeyboard();
//		        waitForElementforClick(no_of_times, 20);
//		        
//		        aDriver.hideKeyboard();
//		        Thread.sleep(200);
//		        waitForElementforClick(startDate, 20);
//		       // waitForElementforClick(selectstartDate, 20);
//		        
//		        waitForElementforClick(clickok, 20);
//		        
//		        aDriver.hideKeyboard();
//		        
//		        waitForElementforClick(endDate, 20);
//		        waitForElementforClick(selectendDate, 20);
//		        
//		        waitForElementforClick(clickok, 20);
//		        
//		        aDriver.hideKeyboard();
		        
				test.log(LogStatus.INFO, "clicking editvoucher"); 
	          waitForElementforClick(editvoucheButton, 10);

				Thread.sleep(4000);

		        waitForElementforClick(SelectAll_Products, 10);
		        
		        waitForElementforClick(Continue_Button, 10);
				Thread.sleep(4000);

		        String voucherPage=aDriver.getPageSource();
		        if(voucherPage.contains("voucherEdited")) {
		        	reportPass("Voucher Edited");
		        	        	
		        }
		        else{
		        	reportFail("Voucher Edit Failed.");
		        	
		        }
			}
			else
			{
				reportFail("Edit Page Not Loaded");
			}
  
	        Thread.sleep(7000);

			
	    }
	    
	    public void AddVoucherRP_mapcategory() throws InterruptedException
	    {
	    	        
	      //  waitForElementforClick(coupons, 20);
			test.log(LogStatus.INFO, "clicking add Voucher to map with category"); 

	        waitForElementforClick(addVoucherBtn, 40);
			test.log(LogStatus.INFO, "Entering add Voucher details"); 
						
	        waitForElementforClick(titleTextbox, 20);
	        

	       titleTextbox.sendKeys("mapcategory");
	        aDriver.hideKeyboard();


	        waitForElementforType(maxCapTextbox, 20, "500");
	        aDriver.hideKeyboard();


	        waitForElementforType(voucherValue, 20, "50");

	        aDriver.hideKeyboard();
	        waitForElementforType(min_amt, 20, "50");
     
	        aDriver.hideKeyboard();
	        waitForElementforClick(no_of_times, 20);
	        no_of_times.click();
	        
	        aDriver.hideKeyboard();
	        Thread.sleep(2000);
	        waitForElementforClick(startDate, 20);
	       // waitForElementforClick(selectstartDate, 20);
	        
	        waitForElementforClick(clickok, 20);
	        
	        aDriver.hideKeyboard();
	        
	        waitForElementforClick(endDate, 20);
	        waitForElementforClick(NextMonth, 20);

	        waitForElementforClick(selectendDate, 20);
	        
	        waitForElementforClick(clickok, 20);
	        
	        aDriver.hideKeyboard();
	        waitForElementforClick(next, 10);
	        
			test.log(LogStatus.INFO, "clicking next"); 
			Thread.sleep(4000);

	        waitForElementforClick(SelectAll_Products, 10);
	        
	        waitForElementforClick(Continue_Button, 10);
			Thread.sleep(8000);

	        String voucherPage=aDriver.getPageSource();
	        if(voucherPage.contains("mapcategory")) {
	        	reportPass("voucher created");
	        	        	
	        }
	        else{
	        	reportFail("Voucher Created Failed.");
	        	
	        }
	     			
	    }
	    
}
	

