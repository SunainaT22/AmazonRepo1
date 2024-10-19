package FacebookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccFbPage {

	@FindBy(xpath="//a[@href=\"/r.php?locale=en_GB&display=page\"]")private WebElement CreatenewButton ;
	@FindBy(xpath="(//input[@type=\"text\"])[1]")private WebElement firstName;
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement lastName;
	@FindBy(xpath=("//select[@title='Day']"))       private WebElement selectday;
	@FindBy(xpath=("//select[@aria-label='Month']"))private WebElement selectmonth;
	@FindBy(xpath=("//select[@aria-label='Year']"))private WebElement selectyear;
	@FindBy(xpath=("//label[@class='_58mt']"))private WebElement femaleGenderbutton;
	@FindBy(xpath=("(//input[@type='text'])[5]"))private WebElement mobileno;
	@FindBy(xpath=("//input[@type='password']"))private WebElement newPassword;
	@FindBy (xpath=("(//button[@type='submit'])[1]"))private WebElement clicktoSignup;

	
	public CreateNewAccFbPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}	
		public void clickCreatenewButton() {
			
			CreatenewButton.click();
		}	
	    public void sendfirstname() {
	    	firstName.sendKeys("Sunaina");
	    }
	   
	    public void sendlastName() {
	    	lastName.sendKeys("Masale");
	    } 
	    public void selectday() {
	    	Select s=new Select(selectday);
	    	        s.selectByVisibleText("2");
	    }
	    
	    public void selectmonth() {
	    	Select p=new Select(selectmonth);
	    			p.selectByVisibleText("Feb");
	    }
	    public void selectyear() {
	    	Select q=new Select(selectyear);
	    			q.selectByVisibleText("2000");
	    }
			public void selectgender() {
				femaleGenderbutton.click();
		}
			 
		    public void sendmobileno() {
		    	mobileno.sendKeys("8421612462");
		    } 
		    public void sendnewPassword() {
		    	newPassword.sendKeys("sunaina@123");
		    }
		    public void clicktoSignup() {
		    	clicktoSignup.click();
		    }
		
		

}



