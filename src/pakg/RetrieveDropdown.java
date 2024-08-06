package pakg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveDropdown
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
			driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
			WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select day=new Select(dayelement);
			day.selectByValue("04");
			
			List<WebElement> li = day.getOptions();
			System.out.println(li.size());
			
			
			WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
			Select month=new Select(monthelement);
			month.selectByIndex(7);
			
			List<WebElement> li1 = month.getOptions();
			System.out.println(li1.size());
			
			WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			Select year=new Select(yearelement);
			year.selectByVisibleText("2001");
			
				List<WebElement> li2 = year.getOptions();
				System.out.println(li2.size());		
		}
}

