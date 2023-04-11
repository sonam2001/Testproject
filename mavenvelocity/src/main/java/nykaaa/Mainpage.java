package nykaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpage {

	// variable declaration 
	
		@FindBy(xpath="//input[@placeholder='Search on Nykaa']")
		private WebElement Search ;
		
		@FindBy(xpath="")
		private WebElement SearchIcon ;
		
		private WebDriver driver;

}
