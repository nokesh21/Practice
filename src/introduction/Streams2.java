package introduction;

import java.io.File;
import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;



import org.testng.asserts.SoftAssert;

public class Streams2 {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
//		List<String> price;
		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver_win64");
		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		List<WebElement> rows=driver.findElements(By.xpath("//tbody/tr/td[1]"));
//	  do{
//		  
//		 price = rows.stream().filter(s -> s.getText().contains("Orange"))
//
//				.map(s -> getprice(s)).collect(Collectors.toList());
//		if(price.size()<1)
//
//		{
//
//		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
//
//		}
//
//		}while(price.size()<1);
//
//
//
//}
//
//	private static String getprice(WebElement s) {
//		// TODO Auto-generated method stub
//		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
//		
//		return price;
//	}
		
		
		
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    driver.switchTo().newWindow(WindowType.TAB);
    Set<String> windows=driver.getWindowHandles();
    Iterator<String> it=windows.iterator();
    String parent=it.next();
    String child=it.next();
    driver.switchTo().window(child);
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    String input=driver.findElement(By.xpath("//*[@class='jumbotron text-center header_style']/following-sibling::h1")).getText();
	driver.switchTo().window(parent);
//	Thread.sleep(3000);
	WebElement t=driver.findElement(By.xpath("(//*[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"));
			t.sendKeys(input);
    File file=t.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("t.png"));
    




}
}
