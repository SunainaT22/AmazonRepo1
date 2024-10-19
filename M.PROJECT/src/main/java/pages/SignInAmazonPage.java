package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInAmazonPage {
	
	 @FindBy (xpath = "//input[@id='ap_email']")
	 private WebElement emailOrPhoneNo;

	 @FindBy (xpath = "//input[@id='continue']")
	 private WebElement continueButton;

	 @FindBy (xpath = "//input[@id='ap_password']")
	 private WebElement password;
		 
	 @FindBy (xpath = "//input[@id='signInSubmit']")
	 private WebElement signIn;

	 public SignInAmazonPage (WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }

	 public void enterEmailOrPhoneNo (String userId) {
		 emailOrPhoneNo.sendKeys (userId);
	 }
	 

	 public void enterPassword(String userPassword) {
		 password.sendKeys (userPassword);

	 }

	 public void clickOnContinue() {
		 continueButton.click();
	 }
	 public void clickOnSignIn() {
        signIn.click();

	 }	
}
		
		 

		
		
		

	
		

		

		


		  
