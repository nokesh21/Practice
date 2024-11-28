package introduction;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;



import org.testng.asserts.SoftAssert;

public class example {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver=new EdgeDriver();

      

        //broken URL

        //Step 1 - IS to get all urls tied up to the links using Selenium

        //  Java methods will call URL's and gets you the status code

        //if status code >400 then that url is not working-> link which tied to url is broken

        //a[href*="soapui"]'

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        

        

     List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

     SoftAssert a = new SoftAssert();

    

     for(WebElement link : links)

     {

      

         String url= link.getAttribute("href");
         HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
         conn.setRequestMethod("HEAD");
        conn.connect();
        conn.getResponseCode();

//         HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
//
//         conn.setRequestMethod("HEAD");
//
//         conn.connect();

         int respCode = conn.getResponseCode();

         System.out.println(respCode);

         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

        
//       Stream.of("nokesh","ajay","ajith").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    

     }

     Stream.of("nokesh","ajay","ajith").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

     a.assertAll();
}

	





}
