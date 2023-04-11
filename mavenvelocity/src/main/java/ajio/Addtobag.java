package ajio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtobag {

	@FindBy(xpath = "(//div[@class='circle size-variant-item size-instock ']//span)[2]")
	private WebElement Size;

	@FindBy(xpath = "//span[text()='ADD TO BAG']")
	private WebElement AddToCart;

	@FindBy(xpath = "//div[@class='ic-cart ']")
	private WebElement AddToBag;

	WebDriver driver;

	// variable intialization
	public Addtobag(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// variable use

	public void ClickOnSize() {
		driver.manage().window().maximize();
		Size.click();
	}

	public void ClickOnAddToCart() {
		AddToCart.click();
	}

	public void ClickOnAddToBag() {
		AddToBag.click();
	}
}
