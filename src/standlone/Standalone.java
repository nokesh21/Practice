package standlone;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Standalone extends Basetest{
   @Test
	public  void placeorder() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		Loginpage loginpage=launchapplication();
		
		
		ProductCatalogue productCatalogue=loginpage.login("nokeshnalla@gmail.com", "Bhagyam23@");
		

		
		


		productCatalogue.addtocart("ADIDAS ORIGINAL");
		Cartpage cartpage=productCatalogue.addedchk();
		System.out.println("nokesh");
		System.out.println("nokesh");
		cartpage.gotTocart();
		Checkoutpage checkoutpage=cartpage.placeorder();
		Confirmationpage confirmationpage=checkoutpage.selectCountry(); 
		confirmationpage.verfyconfirm();
//	    driver.findElement(By.xpath("//*[@routerlink='/dashboard/cart']")).click();
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='heading cf']/h1")));
//	    List<WebElement> itemsadded=driver.findElements(By.xpath("//*[@class='cartSection']/h3"));
//	    boolean flag=itemsadded.stream().anyMatch(iteamadded->iteamadded.getText().equalsIgnoreCase("ADIDAS ORIGINAL"));
//	    Assert.assertTrue(flag);
//	    driver.findElement(By.xpath("//*[@class='subtotal cf ng-star-inserted']//*[@class='btn btn-primary']")).click();
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='payment__shipping']//*[@class='payment__title']")));
//	    driver.findElement(By.xpath("//*[@placeholder='Select Country']")).sendKeys("india");
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'ta-results')]")));
//	    driver.findElement(By.xpath("(//*[contains(@class,'ta-item')])[2]")).click();
//	    driver.findElement(By.xpath("//*[contains(@class,'action__submit')]")).click();
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'hero-primary')]")));
//	    Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class,'hero-primary')]")).getText().equalsIgnoreCase("Thankyou for the order."));
	}
//   @DataProvider
//   public Object[][] getdata()
//   {
////	   String jsoncontent=FileUtils.readFileToString(new File("C:\\Users\\ravit\\eclipse-workspace\\introduction\\src"));
////	   ObjectMapper mapper=new ObjectMapper();
////	   List<HashMap<String,String>> data=mapper.readValue(jsoncontent, new TypeReference<List<HashMap<String,String>>>);
////	   
////	   HashMap<String,String> map=new HashMap<String,String>() ;
////	   map.put("email", "nokeshnalla@gmail.com");
////	   map.put("password", "Bhagyam23@");
////	   return new Object[][]{map};
//   }

}
