package pakg;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.close();

	}

}
