package ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderdetails {
	public class OrderDetails {
		WebDriver driver;
		// variable use
		@FindBy(xpath = "//span[text()='My Bag']")
		private WebElement mybag;

		// variable initialization
		public OrderDetails(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}

		// variable use
		public String gettitleofmybagpage() {
			String text = mybag.getText();
			return text;
		}
	}
}
