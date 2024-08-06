package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Fbpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Excelutil;
 
public class Fbtest extends Baseclass
{
@Test	
public void verifyLoginWithValidCred() throws Exception
{
	Fbpage p1=new Fbpage(driver);
	String xl="C:\\Users\\user\\Documents\\Book1.xlsx"; 
	String Sheet="Sheet1";
	int rowCount=Excelutil.getRowCount(xl,Sheet);
	for(int i=1;i<=rowCount;i++)
	{
		String UserName=Excelutil.getCellValue(xl,Sheet,i,0);
		System.out.println("username---"+UserName);
		String Pwd=Excelutil.getCellValue(xl,Sheet,i,1);
		System.out.println("password---"+Pwd);
		
		p1.setvalues(UserName,Pwd);
		p1.login();
	}
}
}	
