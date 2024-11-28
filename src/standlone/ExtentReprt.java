package standlone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public  class ExtentReprt {
	
	@BeforeTest
	public static ExtentReports extentreport()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter ext=new ExtentSparkReporter(path);
		ext.config().setReportName("Web automation reports");
		ext.config().setDocumentTitle("reports");
		
		ExtentReports extrepo= new ExtentReports();
		extrepo.attachReporter(ext);
		extrepo.setSystemInfo("tester", "nokesh");
		return extrepo;
		
	}
	
	}
	
	

