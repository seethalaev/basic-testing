package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.VrlLogin;
import pages.VrlSignup;

public class VrlTest
{
WebDriver driver;
@BeforeTest
public void set()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
@BeforeMethod
public void get()
{
	driver.get("https://www.vrlbus.in/vrl2013/booking_home_v4.aspx");
	driver.manage().window().maximize();
}
@Test
public void test() throws Exception
{
	VrlLogin ob=new VrlLogin(driver);
	ob.setvalues("kannur", "kochin");
	ob.login();
	VrlSignup ob2=new VrlSignup(driver);
	ob2.signclk();
	ob2.set("sheethu", "sanj", "123456789","abc", "ghfgfs", "6687","gdse@gmail.com");
	ob2.check();
	//Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)","");
	driver.findElement(By.xpath("name=\"terms_conditions\"")).click();
	ob2.register();
}}

////*[contains(@id,'terms_conditions
























