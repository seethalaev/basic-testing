package Exam;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkcount
{
ChromeDriver driver;
@Before
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
@Test
public void Linkcount()
{
	driver.get("https://www.yatra.com/");
	List<WebElement> yatra = driver.findElements(By.tagName("a"));
	System.out.println("Total no of links="+yatra.size());
	
}
}

















