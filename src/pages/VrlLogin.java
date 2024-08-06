package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VrlLogin
{
WebDriver driver;
By source=By.id("source_city");
By destination=By.id("destination_city");
//By date=By.id("TRIPSTARTDATE");
By search=By.name("Button2");
public VrlLogin(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String src,String destn)
{
	driver.findElement(source).sendKeys(src);
	driver.findElement(destination).sendKeys(destn);
	//driver.findElement(date).sendKeys(day);
}
public void login()
{
	driver.findElement(search).click();
}
}
