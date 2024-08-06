package pakg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitPgm 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void titleverification()
	{
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String exp="Online shoppin site in india";
		if(title.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
	}
	@After
	public void browserclose()
	{
		driver.quit();
	}
}
