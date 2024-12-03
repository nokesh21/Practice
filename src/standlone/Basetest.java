package standlone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Basetest {
	WebDriver driver;
	public void initializedriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\resources\\Globaldata.proprties");
		prop.load(fis);
		
		String browsername=System.getProperty("browser")!=null ? System.getProperty("browser"):prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equalsIgnoreCase("edge")) {
	System.setProperty("WebDriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver_win64");
//			WebDriverManager.edgedriver.setup();
		 driver=new EdgeDriver();
		 
		driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
//			WebDriverManager.chromedriver.setup();
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver-win64\\chromedriver-win64");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
//			WebDriverManager.chromedriver.setup();
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver-win64\\chromedriver-win64");
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	public Loginpage launchapplication() throws IOException
	{
		initializedriver();
		Loginpage loginpage=new Loginpage(driver);
		loginpage.goTo();
		return  loginpage;
	}
	public String getScreenshot(String testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File(System.getProperty("user.dir")+"//reports//"+testcasename+".png"));
		return System.getProperty("user.dir")+"//reports//"+testcasename+".png";
	}

}
