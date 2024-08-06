package pakg;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https:/www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	String exp="oogle ";
	if(title.equalsIgnoreCase(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

	}
}
