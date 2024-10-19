package FacebookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	@FindBy(xpath="//input[@type='text']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@type='password']")private WebElement passWord;
	@FindBy(xpath="//button[@value='1']")private WebElement loginButton;
    
	public SigninPage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	}
	public void senduserName() {
		userName.sendKeys("sunaina1@gmail.com");
	}
		public void sendPassword() {
			passWord.sendKeys("123456789");
		}	
			public void clickloginButton() {
			loginButton.click();
			
//			public void Login() {
//				userName.sendKeys("sunainatalpe51@gmail.com");
//				passWord.sendKeys("sunaina123");
//				loginButton.click();
			}
			
			}	
			

