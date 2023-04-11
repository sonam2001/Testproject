package browserSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1) - Copy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 return driver;
	}
	public static WebDriver OpenFireFoxBrowser() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	return driver;
	}
	}