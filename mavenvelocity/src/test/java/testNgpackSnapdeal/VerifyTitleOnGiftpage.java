package testNgpackSnapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import snapdeal.Firstpage;
import snapdeal.Giftpage;

public class VerifyTitleOnGiftpage {
	
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("before class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1) - Copy\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void gotoGiftpage() throws InterruptedException {
		System.out.println("before method");
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Firstpage firstpage=new Firstpage(driver);
		firstpage.ClickonSearchproduct();
	}
	@Test
	public void VerifytextonGiftpage() throws InterruptedException {
		Thread.sleep(2000);
		Giftpage giftpage=new Giftpage(driver);
		
		String text=giftpage.gettext();
		String actualtext="Price";
		Assert.assertEquals(actualtext, text);
		
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
}


