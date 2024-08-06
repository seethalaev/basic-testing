package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script
{
WebDriver driver;
@BeforeTest
public void setup()
{

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://www.wappalyzer.com/");
}
@Test
public void scr()
{
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[2]")).click();    
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div/span[2]/span")).click();
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[3]/div/div[2]/button/span")).click();
	WebElement p=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span"));
    p.isSelected();
	driver.findElement(By.xpath("//*[@id=\"input-441\"]")).sendKeys("java");
}
}






















