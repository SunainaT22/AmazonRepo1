package Mpro;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CartDetailsPage;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.SearchReasultAmazonPage;
import pages.SignInAmazonPage;
import pom.modules.RecommendedAccessoriesModule;

public class TestClassUsingTestNG {
	private WebDriver driver;
    private HomePage homePage;
    private SignInAmazonPage signInAmazonPage;
    private SearchReasultAmazonPage searchReasultAmazonPage;
    private ProductDetailPage productDetailPage;
    private RecommendedAccessoriesModule recommendedAccessoriesModule;
    private CartDetailsPage cartDetailsPage;
    private List<String> browserAddress;
    
    @Parameters("browser")
	@BeforeTest
	void launchBrowser(String expectedBrowser) {
	
		System.out.println(expectedBrowser);
		if (expectedBrowser.equals("Chrome"))
		{
			driver =new ChromeDriver();
		}
//		if (expectedBrowser.equals("Firefox"))
//		{
//			driver =new FirefoxDriver();
//		}
		if (expectedBrowser.equals("Edge"))
		{
			driver =new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

    @BeforeClass
    void initializedPOM() {
    homePage=new HomePage(driver);
    signInAmazonPage=new SignInAmazonPage(driver);
    searchReasultAmazonPage=new SearchReasultAmazonPage(driver);
	cartDetailsPage=new CartDetailsPage(driver);
	productDetailPage=new ProductDetailPage(driver);
	recommendedAccessoriesModule=new RecommendedAccessoriesModule(driver);
  
} 
   @BeforeMethod
    void loginToAmazon()
   {
	   driver.get("https://www.amazon.in/"); 
	   homePage=new HomePage(driver);
	   homePage.clickOnLoginButton();
	   signInAmazonPage=new SignInAmazonPage(driver);
       signInAmazonPage.enterEmailOrPhoneNo("8421612462");
	   signInAmazonPage.clickOnContinue();
	   signInAmazonPage.enterPassword("123456789");
	   signInAmazonPage.clickOnSignIn();
	 
   }
   @Test
     void verifyingAddToCart() throws InterruptedException
     {
    	 //   homePage=new HomePage(driver);
    	    homePage.enterProductName("tv");
    		Thread.sleep(3000);
    	    homePage.clickOnFirstSuggestionOption();
    	    homePage.clickonSearchButton();
    	    searchReasultAmazonPage.clickönSelectItem();
   // child Browser
     	   browserAddress = new ArrayList<String>(driver.getWindowHandles());
          driver.switchTo().window(browserAddress.get(1));
      
       String expectedProductName=productDetailPage.getProductName();
   	String expectedProductPrice=productDetailPage.getProductPrice();
   	   productDetailPage.clickOnAddToCard();
   	   
      recommendedAccessoriesModule.goToCartPage();
      
      //Cart page
      
      
      
      
  
		cartDetailsPage=new CartDetailsPage(driver);
		String actualProductName=cartDetailsPage.getFirstProductName();
		String actualProductPrice=cartDetailsPage.getFirstProduntPrice();
      
   	   SoftAssert softAssert=new SoftAssert();
   	   softAssert.assertEquals(actualProductName, expectedProductName);
   	   softAssert.assertEquals(actualProductPrice, expectedProductPrice);
       softAssert.assertAll();		
     }	
    	
        @AfterMethod
    		void logoutFromAmazon() 
    		{
        //	cartDetailsPage.deleteProductFromCart();
        	driver.close();
        	driver.switchTo().window(browserAddress.get(0));
        	homePage.clickOnLogOutButton();
    		
    		}
    		
    	@AfterClass
    	void removePOM() {
    		homePage=null;
    		signInAmazonPage=null;
    		searchReasultAmazonPage=null;
    		cartDetailsPage=null;
    		productDetailPage=null;
    		recommendedAccessoriesModule=null;
    		
     }	
    		
		@AfterTest
			void closeBrowser() 
    		{
    			driver.quit();
    		}
		}
    		
    		
    		
    		
    		


