package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotpswdpag 
{
WebDriver driver;
By forgottenlink=By.xpath("//*[contains(text(),'Forgotten password?')]");
By forgottenpasswordmobile=By.id("identify_email");
By forgottenpasswordsearch=By.name("did_submit");

public void linkclick()
{
	driver.findElement(forgottenlink).click();
}
public Forgotpswdpag(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String mobilenumber)
{
	
	driver.findElement(forgottenpasswordmobile).sendKeys(mobilenumber);
}
public void click()
{
	driver.findElement(forgottenpasswordsearch).click();
}
}
