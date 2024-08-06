package testngprgrms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker 
{

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void url()
	{
		driver.get("https://www.expedia.co.in/?locale=en_GB&siteid=27&semcid=IN.B.GOOGLE.BT-c-EN.GT&SEMDTL=a118255096863.b1141899702539.g1kwd-12670071.l1.e1c.m1Cj0KCQiAveebBhD_ARIsAFaAvrHt2U80m_O9P-d1B6yddISSlGNdmvT3OuRogAoV6cEI_TuQSqRp8M8aAmkREALw_wcB.r1ea9bcdebce2815402ebf2bd02353ca917be42750b1f2cc8ae52a2db6b718f2f9.c1SD6l1kQU6GVkRdQbNOryMA.j11007777.k1.d1624927912422.h1e.i1.n1.o1.p1.q1.s1.t1.x1.f1.u1.v1.w1&gclid=Cj0KCQiAveebBhD_ARIsAFaAvrHt2U80m_O9P-d1B6yddISSlGNdmvT3OuRogAoV6cEI_TuQSqRp8M8aAmkREALw_wcB");
	}
	@Test
	public void test() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		Thread.sleep(1000);
		while(true)
		{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
		String MonthText=month.getText();
			if(MonthText.equals("January 2023"))
			{
				System.out.println(MonthText);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}
			List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
			for(WebElement date:dates)
			{
				String actdate=date.getAttribute("data-day");
				if(actdate.equals("1"))
				{
					date.click();
				}
			}
		
		
	}
	}
}

