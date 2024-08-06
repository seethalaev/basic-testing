package testngprgrms;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VrlTravelspgm 
{
	ChromeDriver driver;
@BeforeTest
 public void setup()
 {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
 }
@BeforeMethod
public void get()
{
	driver.get("https://www.vrlbus.in/vrl2013/booking_home_v4.aspx");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"main_div1\"]/div[1]/div/div/div[3]/div/a")).click();
}
@Test
public void test1()
{
	String title=driver.getTitle();
	System.out.println(title);
}
@Test
public void test2()
{
	String src=driver.getPageSource();
	if(src.contains("Register"))
	System.out.println("pass2");
	else
		System.out.println("fail2");
}
@Test
public void test3()
{
	List<WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println(li.size());
	if(li.size()==40)
		System.out.println("pass3");
	else
		System.out.println("fail3");
}
@Test
public void test4()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
	WebElement value=driver.findElement(By.xpath("//*[@id=\"Button1\"]"));
	String s=value.getAttribute("value");
			System.out.println(s);
			String exp="Register";
			if(s.equalsIgnoreCase(exp))
				System.out.println("pass4");
			else
				System.out.println("fail4");
}
@Test
public void test5()
{
	WebElement drpdwn=driver.findElement(By.xpath("//*[@id=\"CITYID\"]"));
	Select s=new Select(drpdwn);
	List<WebElement> li = s.getOptions();
	System.out.println(li.size());
}
@Test
public void test6()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
	WebElement ref=driver.findElement(By.xpath("//*[@id=\"terms_conditions\"]"));
	Boolean b=ref.isSelected();
	if(b)
System.out.println("Enabled");
	else
		System.out.println("Disabled");
}
@Test
public void test7() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"FIRSTNAME\"]")).sendKeys("sheethal");
	driver.findElement(By.xpath("//*[@id=\"LASTNAME\"]")).sendKeys("EV");
	driver.findElement(By.xpath("//*[@id=\"MOBILENUMBER\"]")).sendKeys("098765432");
	driver.findElement(By.xpath("//*[@id=\"COMPANY\"]")).sendKeys("DANCE");
	driver.findElement(By.xpath("//*[@id=\"ADDRESS\"]")).sendKeys("GDFJK,kollam");
	driver.findElement(By.xpath("//*[@id=\"POSTALCODE\"]")).sendKeys("987656");
	driver.findElement(By.xpath("//*[@id=\"LOGINNAME\"]")).sendKeys("sheethalkh@gmail.com");
	WebElement cityelement=driver.findElement(By.xpath("//*[@id=\"CITYID\"]"));
	Select city=new Select(cityelement);
	city.selectByValue("56");
	WebElement stateelement=driver.findElement(By.xpath("//*[@id=\"STATEID\"]"));
	Select state=new Select(stateelement);
	state.selectByValue("4");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)", "");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"terms_conditions\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();
	Alert a=driver.switchTo().alert();
	String txt=a.getText();
	a.accept();
	System.out.println(txt);
	String exp="Please enter number";
	if(txt.equalsIgnoreCase(exp))
		System.out.println("pass");
	else
		System.out.println("fail");
	}
@Test
public void test8() throws Exception
{
	WebElement ref1=driver.findElement(By.xpath("//*[@id=\"main_div1\"]/div[2]/div/table/tbody/tr/td[1]/div[1]/a/img"));
	Boolean b1=ref1.isDisplayed();
	if(b1)
	{
		System.out.println("Displayed");
	}
	else
	{
		System.out.println("Not displayed");
	}}
@Test
public void test9() throws Exception
	{
	File scrnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(scrnshot, new File("D://VRL.png"));
	}
@AfterMethod
public void after()
{
	System.out.println("Executed the method");
}

@AfterTest
public void aftertest()
{
	System.out.println("Closed the test");
	
}}






























