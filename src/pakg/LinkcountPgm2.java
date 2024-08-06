package pakg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkcountPgm2
{

	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void linkcount()
	{
	driver.get("https://www.netflix.com");	
	List<WebElement> ma=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+ma.size());
     }
}
