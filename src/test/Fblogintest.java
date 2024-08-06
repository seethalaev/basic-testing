package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Fbloginpage;
import pages.Forgotpswdpag;

public class Fblogintest 
{
	WebDriver driver;
@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();			
}
@BeforeMethod
public void url()
{
	driver.get("https:/www.facebook.com");
}
@Test
public void testlogin() throws Exception
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("abc@gmail.com","abc");
	ob.login();
	Thread.sleep(1000);
	driver.navigate().back();
	Forgotpswdpag ob1=new Forgotpswdpag(driver);
	ob1.linkclick();
	ob1.setvalues("abc");
	ob1.click();

}}































