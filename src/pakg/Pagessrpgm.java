package pakg;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagessrpgm
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String sc=driver.getPageSource();
		if(sc.contains("Gmail"))
		{
			System.out.println("pass:text is present");
		}
		else
		{
			System.out.println("fail:text is not present");
		}
	}

}
