package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilePage {
	final WebDriver driver;
	//JavascriptExecutor js;
	public MobilePage(WebDriver driver) {
		this.driver = driver;
	//	this.js=js;
		
	}

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
	WebElement mobileCategory;
	
	@FindBy(xpath = "//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span")
	WebElement mobile_and_accessories;
	
	//Locating element by link text and store in variable "Element"        		
//    @FindBy(xpath="//*[@id=\"103_dealView_0\"]/div/div[2]/div/div/div[2]/div/span[1]")
//    WebElement deal_of_the_day_Element;
//    
    @FindBy(xpath = "//*[@id=\"100_dealView_0\"]")
    WebElement view_deal;

	
	  @FindBy(xpath ="//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]")
	  WebElement add_to_cart;
	  
    
    
	public void click_mobile_category() {
		mobileCategory.click();
	}
	
	public void click_and_accessories() {
		mobile_and_accessories.click();
	}
	public void click_deal_of_the_day() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Scrolling down the page till the element is found		
	js.executeScript("arguments[0].scrollIntoView();", view_deal);
	    view_deal.click();
	}
	
	
	public void add_item_to_cart() {
		
	    add_to_cart.click();
	}
}
