package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class flightbookingeyoe {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@data-testid='to-testID-origin']//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
		driver.findElement(By.xpath("//*[text()='Agra']")).click();
		driver.findElement(By.xpath("//*[text()='Agra']"));
		driver.findElement(By.xpath("//*[@data-testid='to-testID-destination']//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
		
		driver.findElement(By.xpath("//*[text()='Jaipur']"));
		

	}

}
