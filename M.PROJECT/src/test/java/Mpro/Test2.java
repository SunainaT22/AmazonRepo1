//package Mpro;
//
//import java.sql.Driver;
//import java.util.ArrayList;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import pages.CartDetailsPage;
//import pages.HomePage;
//import pages.ProductDetailPage;
//import pages.SearchReasultAmazonPage;
//import pages.SignInAmazonPage;
//import pom.modules.RecommendedAccessoriesModule;
//
//public class Test2 {
//	
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.amazon.in/");
//	
//	HomePage homePage=new HomePage(driver);
//	homePage.clickOnLoginButton();
//	
//	SignInAmazonPage signInAmazonPage=new SignInAmazonPage(driver);
//	signInAmazonPage.enterEmailOrPhoneNo("8421612462");
//	signInAmazonPage.clickOnContinue();
//	signInAmazonPage.enterPassword("123456789");
//	signInAmazonPage.clickOnSignIn();
//	 Thread.sleep(3000);
//       homePage=new HomePage(driver);
//       homePage.enterProductName("mobile iphone");
//  	   Thread.sleep(3000);
//       homePage.clickOnFirstSuggestionOption();
//       homePage.clickonSearchButton();
//       
//       SearchReasultAmazonPage searchReasultAmazonPage=new SearchReasultAmazonPage(driver);
//       searchReasultAmazonPage.clickönSelectItem();
//       
//       //child browser
//     ArrayList <String> addr=new ArrayList<String>(driver.getWindowHandles());
//       driver.switchTo().window(addr.get(1));
//       
//       ProductDetailPage productDetailPage=new ProductDetailPage(driver);
//       String expectedProductName=productDetailPage.getProductName();
//	   String expectedproductPrice=productDetailPage.getProductPrice();
//	   productDetailPage.clickOnAddToCard();
//	   
//	   //seprate package for module(window),popup
//	   RecommendedAccessoriesModule sideWindowforaddtocart=new RecommendedAccessoriesModule(driver);
//	   sideWindowforaddtocart.goToCartPage();
//	   
//	   //cart page
//	   CartDetailsPage cartDetailsPage=new CartDetailsPage(driver);
//	  String actualProductName= cartDetailsPage.getFirstProductName();
//	  String actualproductPrice=cartDetailsPage.getFirstProduntPrice();
//	  
//	  if (expectedProductName.equals(actualproductPrice) && expectedproductPrice.equals(actualproductPrice))
//	  {
//		  System.out.println("PASS");
//	  }
//	  else
//	  {
//		  System.out.println("FAIL");
//	  }
//
//}
//	
//}
//
