package pakg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonXpath

	{
		ChromeDriver driver;
		@Before
		public void setup()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		@Test
		public void locators()
		{
			
			
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anu123@gmail.com",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[8]")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();	
		}
}







