package pakg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffLinkpgm 

{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void scrnsht()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
	    if(b)
	    {
	    	System.out.println("Selected");
	    }
	    else
	    {
	    	System.out.println("not selected");
	    }
	
	Boolean b1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	{
	if(b1)
	{
		System.out.println("displayed");
	}
	else
	{
		System.out.println("not displayed");
	}}
	
Boolean c=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
{
	if(c)
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
}}}











