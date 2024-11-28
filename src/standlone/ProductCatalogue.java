package standlone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductCatalogue extends Reusable{
	WebDriver driver;
	public ProductCatalogue(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	


	@FindBy(xpath="(//*[@name='search'])[2]")
	WebElement search;
	@FindBy(xpath="//*[@class='card-body']/h5")
	List<WebElement> items;
	@FindBy(xpath="//*[@class='card-body']/button[last()]")
	List<WebElement>  carts;
	@FindBy(xpath="//*[contains(@class,'toast-message')]")
	WebElement toastmsg;
	@FindBy(xpath="//*[@class='ng-tns-c31-1 la-3x la-ball-scale-multiple ng-star-inserted']")
	WebElement spin;
	
	public void addtocart(String product)
	{
		waitforelementvisibile(search);
		
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals(product))
			{
				carts.get(i).click();
			} 
		}
		
	    
	}
	public Cartpage addedchk()
	{
		waitforelementvisibile(toastmsg);
		waitforelementinvisibile(spin);
		return new Cartpage(driver);
	}
	
	

}
