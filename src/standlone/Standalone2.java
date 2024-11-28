package standlone;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Standalone2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver_win64");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("nokeshnalla@gmail.com");
		driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys("Bhagyam23@");
		driver.findElement(By.xpath("//*[@id='login']")).click();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name=\"search\"])[2]")));
		

		List<WebElement> items=driver.findElements(By.xpath("//*[@class='card-body']/h5"));
		List<WebElement> carts=driver.findElements(By.xpath("//*[@class='card-body']/button[last()]"));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("ADIDAS ORIGINAL"))
			{
				carts.get(i).click();
			} 
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'toast-message')]")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='ng-tns-c31-1 la-3x la-ball-scale-multiple ng-star-inserted']")));
	    driver.findElement(By.xpath("//*[@routerlink='/dashboard/cart']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='heading cf']/h1")));
	    List<WebElement> itemsadded=driver.findElements(By.xpath("//*[@class='cartSection']/h3"));
	    boolean flag=itemsadded.stream().anyMatch(iteamadded->iteamadded.getText().equalsIgnoreCase("ADIDAS ORIGINAL"));
	    Assert.assertTrue(flag);
	    driver.findElement(By.xpath("//*[@class='subtotal cf ng-star-inserted']//*[@class='btn btn-primary']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='payment__shipping']//*[@class='payment__title']")));
	    driver.findElement(By.xpath("//*[@placeholder='Select Country']")).sendKeys("india");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'ta-results')]")));
	    driver.findElement(By.xpath("(//*[contains(@class,'ta-item')])[2]")).click();
	    driver.findElement(By.xpath("//*[contains(@class,'action__submit')]")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'hero-primary')]")));
	    Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class,'hero-primary')]")).getText().equalsIgnoreCase("Thankyou for the order."));
	}

}
