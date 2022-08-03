package utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverSetup {

	public static WebDriver driver;
	public static String url = "https://tide.com/en-us";
	public static String browsertype;

	public static WebDriver driverInstantiate(String browser) {
		browsertype = browser;

		// instantiate chrome browser
		if (browsertype.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91849\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().deleteAllCookies();
		
		return driver;

	}

	public static void driverClose() {
		DriverSetup.driver.quit();
	}
	
}
