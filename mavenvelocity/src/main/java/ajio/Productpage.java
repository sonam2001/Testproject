package ajio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	
	// variable declaration 
	 
	@FindBy(xpath="(//span[@class='facet-left-pane-label'])[2]")
	private WebElement category;

	@FindBy(xpath="(//div[text()='Lace-Up Chunky Sole Sneakers with Contrast Inserts'])[1]")
	private WebElement Sneakers; 
	
    WebDriver driver;
	//variable intialization
	 public Productpage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	 public void switchtoframe() {
		 driver.switchTo().frame(Sneakers);
		
	 }
	  // variable use
		public String gettext() {
			String s= category.getText();
			return s;
			
		}
		 
		public String getURLOfProductpage() {
			String URL=driver.getCurrentUrl();
			return URL;
			
		}
	
		 public void ClickOnSneakers() {
	    Sneakers.click();
}}