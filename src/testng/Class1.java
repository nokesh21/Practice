package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
    @Parameters({"url"})
//	@Test(groups={"smoke"})
    @Test(dependsOnMethods= {"method12"})
	public void method11(String url)
	{
		System.out.println("method11");
		System.out.println(url);
	}
	@Test(dataProvider="getData")
	public void method12(String user,String pass)
	{
		System.out.println("method12");
		System.out.println(user);
		System.out.println(pass);
	}
	
	public void method13()
	{
		System.out.println("method13");
	}
	@BeforeMethod
	public void method14()
	{
		System.out.println("method14");
	}
	@AfterMethod
	public void method15()
	{
		System.out.println("method15");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="user1";
		obj[0][1]="user1";
		
		obj[1][0]="user1";
		obj[1][1]="user1";
		
		obj[2][0]="user1";
		obj[2][1]="user1";
		return obj;
		
				
	}
}
