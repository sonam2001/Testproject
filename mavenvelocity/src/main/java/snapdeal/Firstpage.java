package snapdeal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstpage {
	// variable declaration 
	
		@FindBy(xpath="//input[@placeholder='Search products & brands']")
		private WebElement SearchProduct ;
		
		@FindBy(xpath="//i[@class='sd-icon sd-icon-search-under-catagory lfloat']")
		private WebElement SearchIcon ;
		
	 WebDriver driver;
		
	 //variable intialization
//		driver123=driver=new chromedriver
		public Firstpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
	 // variable use
			
			public void ClickonSearchproduct() throws InterruptedException {
			SearchProduct.sendKeys("gifts");
			Thread.sleep(2000);
			SearchIcon.click();
			
			}
}	
			
		
		
		 


