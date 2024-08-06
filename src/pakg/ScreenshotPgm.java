package pakg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotPgm
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void scrnsht() throws Exception
	{
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src, new File("D://erro3.png"));
		
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshott//Elementscreenshot.png"));
		
		
	}
}