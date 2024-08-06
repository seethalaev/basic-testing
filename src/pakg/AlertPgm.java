package pakg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPgm 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void Alert()
	{
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		//a.accept();
		a.dismiss();
		driver.switchTo().alert().accept();	
		}
}
