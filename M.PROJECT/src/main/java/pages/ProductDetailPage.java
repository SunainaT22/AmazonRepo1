package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	 @FindBy (xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
      private WebElement productName;

	 @FindBy (xpath = "(//span[@class='a-price-whole'])[1]")
	 private WebElement productPrice;

	 @FindBy (xpath = "(//button[@class='a-button-text'])[1]")
		 private WebElement addToCart;
		
	 @FindBy (xpath= "//input[@name='proceedToRetailCheckout']")
	 private WebElement buyNow;

	 private WebDriver driver;

	 public ProductDetailPage (WebDriver driver) {
		 PageFactory.initElements (driver, this);
		 this.driver= driver;
	 }
	 public void goToFrame () {
		 driver.switchTo().frame (buyNow);
	 }
		
	 public String getProductName() {
		 return productName.getText().trim();
	 }
	 
	 public String getProductPrice() {
		 return productPrice.getText().trim();
	 }
	 
	 public void clickOnAddToCard() {
			addToCart.click();
	 }
	 
	 public void clickOnBuyNow() {
		 buyNow.click();
		
	 }
	}

		

		

		

		

		

		
		
			

			

			

			

			

		

			

			

			

			




		
		
		
		

		
		

		

		

		

		
		

		