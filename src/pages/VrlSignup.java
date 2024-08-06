package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VrlSignup 
{
WebDriver driver;
By sign=By.xpath("//*[@id=\"main_div1\"]/div[1]/div/div/div[3]/div/a");  
By first=By.xpath("//*[@id=\"FIRSTNAME\"]");
By last=By.xpath("//*[@id=\"LASTNAME\"]");
By mob=By.xpath("//*[@id=\"MOBILENUMBER\"]");
By com=By.xpath("//*[@id=\"COMPANY\"]");
By adrs=By.xpath("//*[@id=\"ADDRESS\"]");
By pin=By.xpath("//*[@id=\"POSTALCODE\"]");
By mail=By.xpath("//*[@id=\"LOGINNAME\"]");
//By city=By.xpath(" ");
//By state=By.xpath(" ");
By reg=By.name("Button1");

public VrlSignup(WebDriver driver)
{
	this.driver=driver;
}
public void signclk()
{
	driver.findElement(sign).click();
}
public void register()
{
	driver.findElement(reg).click();
}
public void set(String fir,String sec,String fon,String comp,String adr,String cod,String id)
{
	driver.findElement(first).sendKeys(fir);
	driver.findElement(last).sendKeys(sec);
	driver.findElement(mob).sendKeys(fon);
	driver.findElement(com).sendKeys(comp);
	driver.findElement(adrs).sendKeys(adr);
	driver.findElement(pin).sendKeys(cod);
	driver.findElement(mail).sendKeys(id);  
}
public void check()
{
	WebElement cityelement=driver.findElement(By.xpath("//*[@id=\"CITYID\"]"));
	Select city=new Select(cityelement);
	city.selectByValue("56");
	WebElement stateelement=driver.findElement(By.xpath("//*[@id=\"STATEID\"]"));
	Select state=new Select(stateelement);
	state.selectByValue("4");
}
}




























