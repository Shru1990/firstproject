package day01_1009;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before Suite Method");
	}
	@BeforeTest
	public void btest()
	{
		System.out.println("Before test Method");
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("Before Class Method");
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before method Method");
	}
	@Test
	public void T1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void T2()
	{
		System.out.println("Test2");
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("After Method Method");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("After Class Method");
	}
	@AfterTest
	public void atest()
	{
		System.out.println("After test Method");
	}
	@AfterSuite
	public void asuite()
	{
		System.out.println("After Suite Method");
	}
	

}
