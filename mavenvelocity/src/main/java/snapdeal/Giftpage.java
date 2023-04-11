package snapdeal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftpage {
	// variable declaration 
	
	@FindBy(xpath="//div[text()='Wall Decor']")
	private WebElement WallDecor  ;
	

	@FindBy(xpath="//input[@placeholder='Enter your pincode']")
	private WebElement Pincode  ;
	

	@FindBy(xpath="//button[text()='Check']")
	private WebElement Check  ;
	
	@FindBy(xpath="(//div[@class='filter-type-name lfloat'])[1]")
    private WebElement Price;
	
	@FindBy(xpath="//span[text()='Cart']")
    private WebElement Cart;
	
	@FindBy(xpath="//p[@class='text-center browse-category-text']")
	private WebElement Message;
	
	WebDriver driver;
	
   //variable intialization
//		driver123=driver=new chromedriver
		public Giftpage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
  //variable use
		public void ClickOnWallDecors() {
			WallDecor.click();
		}
		public void EnterPincode() throws InterruptedException {
			
			Pincode.sendKeys("410507");
		}
		public void CheckPincode() throws InterruptedException {
			
			Check.click();
		}
		public 	String gettext() {
		String title=Price.getText();
		return title;	
		}
		public void ClickOnCartbutton() {
			Cart.click();
		}
		public String getmessage() {
			String m=Message.getText();
			return m;
		}
			

}