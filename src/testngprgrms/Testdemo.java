package testngprgrms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testdemo
{
@BeforeTest
public void set()
{
	System.out.println("browser open");
}
@BeforeMethod
public void urlload()
{
	System.out.println("urlload");
}
@Test(priority=3,invocationCount=3,dependsOnMethods= {"test3"})
public void test1()
{
	System.out.println("test1");
}
@Test(enabled=false)
public void test2()
{
	System.out.println("test2");
}
@Test(priority=1)
public void test3()
{
	System.out.println("test3");
}
}
