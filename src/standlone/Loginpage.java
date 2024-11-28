package standlone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='userEmail']")
	WebElement username;
	@FindBy(xpath="//*[@id='userPassword']")
	WebElement password;
	@FindBy(xpath="//*[@id='login']")
	WebElement loginbutton;
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	}
	public ProductCatalogue login(String usrname,String pssword)
	{
		username.sendKeys(usrname);
		password.sendKeys(pssword);
		loginbutton.click();
		return new ProductCatalogue(driver);
		
	}
}
