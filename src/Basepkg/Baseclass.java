package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass
{
	public WebDriver driver;
@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
@BeforeMethod

public void url()
{
	driver.get("https:/www.google.com");
}
}
