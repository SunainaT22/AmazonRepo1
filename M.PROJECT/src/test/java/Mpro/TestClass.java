//package Mpro;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.AmazonaddtocartproductPage;
//import pages.AmazonsignupPage;
//import pages.CreatenewaccfbPage;
//import pages.DropDownPage;
//import pages.LoginOrSignUpPage;
//
//public class TestClass {
//public static void main(String[] args) throws InterruptedException {
//		
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/login/");
// 1.   Login for Facebook;
//		LoginOrSignUpPage x=new LoginOrSignUpPage(driver);
//		x.senduserName();
//		x.sendPassword();
//		x.clickloginButton();
		
//		LoginOrSignUpPage y=new LoginOrSignUpPage(driver);
//		y.Login();

//	2.	DropDown 
//		DropDownPage x=new DropDownPage(driver);
//		x.selectDay();
//		x.selectMonth();
//		x.selectYear();
//			DropDownPage s=new DropDownPage(driver);
//			s.DOB();
//   3.Create Account 
//		CreatenewaccfbPage x=new CreatenewaccfbPage(driver);
//		x.clickCreatenewButton();
//		
//		x.sendfirstname();
//		x.sendlastName();
//		Thread.sleep(2000);
//		x.selectday();
//		Thread.sleep(2000);
//		x.selectmonth();
//		Thread.sleep(2000);
//		x.selectyear();
//		Thread.sleep(2000);
//		x.selectgender();
//		Thread.sleep(2000);
//		x.sendmobileno();
//		Thread.sleep(2000);
//		x.sendnewPassword();
//		Thread.sleep(2000);
//		x.clicktoSignup();		
// ============================================================================================    
//		1.Amazon Create New Account
	
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.com/sign/s?k=sign+in");
//		
//		AmazonsignupPage y=new AmazonsignupPage(driver);
//		y.clicksigninAccList();
//		Thread.sleep(2000);
//		y.clickAmazoncreatenewAcc();
//		Thread.sleep(2000);
//		y.sendfullname();
//		Thread.sleep(2000);
//		y.sendmobileno();
//		Thread.sleep(2000);
//		y.sendpassword();
//		Thread.sleep(2000);
//		y.sendreenterpassword();
//		Thread.sleep(2000);
//		y.clicktocontinue();
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.amazon.com/");
//		
	//	AmazonaddtocartproductPage addtocart=new AmazonaddtocartproductPage(driver);
//		addtocart.clicksearchbox();
//		addtocart.writenameonsearch();
//		addtocart.clickSearchMobile();
//		String actualProductName=addtocart.getRatingofMobile().trim();
//		addtocart.productAddtocart();
//}
//}