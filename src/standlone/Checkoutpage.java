package standlone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage extends Reusable{
	WebDriver driver;
	public Checkoutpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='payment__shipping']//*[@class='payment__title']")
	WebElement checkoutpage;
	@FindBy(xpath="//*[contains(@class,'ta-results')]")
	WebElement results;
	@FindBy(xpath="//*[@placeholder='Select Country']")
	WebElement Country;
	@FindBy(xpath="(//*[contains(@class,'ta-item')])[2]")
	WebElement ind;
	@FindBy(xpath="//*[contains(@class,'action__submit')]")
	WebElement submit;
	public Confirmationpage selectCountry()
	{
		Country.sendKeys("india");
		waitforelementvisibile(results);
        ind.click();
	    submit.click();
	    return new Confirmationpage(driver);
	}

}
