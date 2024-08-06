package pakg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkpgm
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void linkcount()
	{
	driver.get("https:/www.google.com");	
	List<WebElement> as=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+as.size());
     
	for(WebElement s:as)
	{
	  String link=s.getAttribute("href");
	 // String text=s.getText();
	 // System.out.println(link+"....."+text);
	  verify(link);
	}	
}
	private void verify(String link) 
	{
		try 
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("VALID----"+link);
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("Broken link---"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

















