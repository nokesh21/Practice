package testng;

import org.testng.annotations.Test;

public class Class2 {
	@Test
	public void method21()
	{
		System.out.println("method21");
	}
	@Test(groups={"smoke"})
	public void method22()
	{
		System.out.println("method22");
	}
	@Test
	public void method23()
	{
		System.out.println("method23");
	}

}
