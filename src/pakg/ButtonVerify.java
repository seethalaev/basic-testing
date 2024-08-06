package pakg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonVerify
{

	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void Buttonverify()
	{
	driver.get("file:///C:/Users/user/Documents/pgm1.html");
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println(alerttext);
	a.accept();
	//a.dismiss();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}
}
