package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchReasultAmazonPage {

	@FindBy(xpath="//div[@data-cel-widget='search_result_2']")
	private WebElement selectFirstitem;

	@FindBy(xpath="//div[@data-cel-widget='search_result_2']//h2/a/span")
	private WebElement titleOfFirstItem;

	@FindBy(xpath ="(//div[@data-cel-widget='search_result_2']//div/a//span) [5]")
	private WebElement priceOfFirstItem;

	@FindBy (xpath="//div[@data-cel-widget='search_result_2']//button")
	private WebElement accToCard;
	
	public SearchReasultAmazonPage(WebDriver driver) {
	PageFactory.initElements (driver, this);
	}
	
	public void clickönSelectItem() {

	   titleOfFirstItem.click();
}
}