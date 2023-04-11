package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ajio.Homepage;
import ajio.Productpage;

public class Verifyurlofproductpage {
WebDriver driver;
Homepage homepage;
Productpage productpage;

@Parameters("browser")
@BeforeTest
public void openBrowser(String browserName) {
	System.out.println("Before Test");
	if(browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1) - Copy\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	if(browserName.equals("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@BeforeClass
	public void openBrowser() {
		Homepage homepage = new Homepage(driver);
		Productpage productpage=new Productpage(driver);
		}
	@BeforeMethod
	public void gotoproductpage() throws InterruptedException {
		System.out.println("before method");
		driver.get("https://www.ajio.com");
		Thread.sleep(4000);
		homepage.MoveOnWomen();
		homepage.MoveOnBrands();
		homepage.ClickOnArmaniExchange();
	}
	 @Test
	 public void Verifycurrenturlofproductpage() {
		 
		String 	url= productpage.getURLOfProductpage();
		String actualurl ="https://www.ajio.com/s/armani-exchange-4042-53541";
		Assert.assertEquals(actualurl, url);
	 }
	 @AfterMethod
     public void gotomainpage()
	{
		System.out.println("after method");
	}
	 
	@AfterClass
	public void closebrowse() {
		System.out.println("close");
	}
	@AfterTest
	public void Quit() {
		System.out.println("quit");
	}
}


	 
	
