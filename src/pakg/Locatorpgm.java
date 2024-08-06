package pakg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorpgm {
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
		//driver.get("https:/www.google.com");	
		//driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();//don't get
			
			
			//driver.get("https:/www.facebook.com");
			//driver.findElement(By.name("email")).sendKeys("lkj@gmail.com");
			//driver.findElement(By.name("pass")).sendKeys("mnj");
			//driver.findElement(By.name("login")).click();
			

			//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("seethu@123");   
		//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sheethl5");   
		//	driver.findElement(By.xpath("//button//input[@name='login']")).click(); 
			
			
			driver.get("https:/www.amazon.in");
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
			}}


