package testngprgrms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploadpgm 
{
WebDriver driver;
@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.ilovepdf.com/pdf_to_word");
}
@Test
public void test1() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	fileUpload("\"C:\\Users\\user\\Documents\\Aptitude\\Aptitude-Test (1).pdf\"");
}
public void fileUpload(String p)throws AWTException
{
	//to copy path to clipboard
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	//to paste into syswindow
	Robot robot=new Robot();
	//robot.delay(3000)
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	//robot.delay(200);
	//thread.sleep(5000);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}































