package standlone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Confirmationpage extends Reusable{
	WebDriver driver;
	public Confirmationpage(WebDriver driver)
	{
	super(driver);
    this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//*[contains(@class,'hero-primary')]")
	WebElement confirmsg;
	public void verfyconfirm() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementinvisibile(confirmsg);
		Assert.assertTrue(confirmsg.getText().equalsIgnoreCase("for the order."));	
	}
	
}
