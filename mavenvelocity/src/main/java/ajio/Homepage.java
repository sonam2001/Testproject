package ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	Actions act;
	@FindBy(xpath = "//a[@href='/shop/women']")
	private WebElement Women;

	@FindBy(xpath = "(//a[text()='BRANDS'])[2]")
	private WebElement Brands;

	@FindBy(xpath = "(//a[text()='Armani Exchange'])[2]")
	private WebElement ArmaniExchange;

	// variable intialization

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act =   new Actions(driver);
	}
	// variable use

	public void MoveOnWomen() {
		act.moveToElement(Women).perform();
	}

	public void MoveOnBrands() {
		act.moveToElement(Brands).perform();
	}

	public void ClickOnArmaniExchange() {
		ArmaniExchange.click();
	}
}