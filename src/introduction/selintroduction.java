//package introduction;
//
//
//import java.time.Duration;
//import java.util.ArrayList;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class selintroduction {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravit\\Downloads\\chromedriver_win32 (3)");
//		WebDriver driver = new ChromeDriver();
//		//driver.get("https://www.bigbasket.com/");
//		//System.out.println(driver.getTitle());
//		//driver.close();
//		//WebDriver driver = new  EdgeDriver();
//		//driver.get("https://www.bigbasket.com/");
//		ArrayList<String> arr=new ArrayList<String>();
//		arr.add("nokesh");
//		arr.add("is bad");
//		arr.add(" boy");
//		System.out.println(arr.get(0));
//		for(int inc=0;inc<arr.size();inc++)
//		{
//			System.out.println(arr.get(inc));
//		}
//		for(String val:arr)
//		{
//			System.out.println(val);
//		}
//		System.out.println(arr.contains("nokesh"));
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
//		
////		Wait<WebDriver> w=new FluentWait(null)<WebDriver>(driver)
////		.
////		{
////			public WebElement apply()
////			{
////				if()
////				else
////				{}
//				
//			}
//		}
//
//	}
//
//
//			
//    
//}
