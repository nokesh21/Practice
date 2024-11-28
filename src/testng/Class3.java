package testng;

import org.testng.annotations.Test;

public class Class3 {

	@Test
	public void method31()
	{
		System.out.println("method31");
	}
	@Test(groups={"smoke"})
	public void method32()
	{
		System.out.println("method32");
	}
	@Test
	public void method33()
	{
		System.out.println("method33");
	}
}
