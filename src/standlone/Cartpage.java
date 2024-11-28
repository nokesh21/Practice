package standlone;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cartpage extends Reusable {
	WebDriver driver;
	public Cartpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@routerlink='/dashboard/cart']")
	WebElement cartbutton;
	@FindBy(xpath="//*[@class='heading cf']/h1")
	WebElement cartpagechk; 
	@FindBy(xpath="//*[@class='cartSection']/h3")
	List<WebElement> itemsadded; 
	@FindBy(xpath="//*[@class='subtotal cf ng-star-inserted']//*[@class='btn btn-primary']")
	WebElement btncheckout; 
	
	public void gotTocart() throws InterruptedException
	{
		cartbutton.click();
		waitforelementvisibile(cartpagechk);
		Thread.sleep(3000);
	    boolean flag=itemsadded.stream().anyMatch(iteamadded->iteamadded.getText().equalsIgnoreCase("ADIDAS ORIGINAL"));
	    Assert.assertTrue(flag);
	}
	public Checkoutpage placeorder()
	{
		btncheckout.click();
		return new Checkoutpage(driver);
	}


}
