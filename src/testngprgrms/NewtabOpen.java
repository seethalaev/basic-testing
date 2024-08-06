package testngprgrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewtabOpen
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void newtab()
	{
	//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
	WebDriver driver2=driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https:/www.google.com");
	//driver1.close();
	}
}
