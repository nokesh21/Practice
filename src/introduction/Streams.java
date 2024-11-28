package introduction;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;



import org.testng.asserts.SoftAssert;

public class Streams {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("nokesh");
		names.add("Adam");
		names.add("Adi");
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		names.stream().filter(s->s.startsWith("A")).limit(1).
		forEach(s->System.out.println("in stream"+s));
		List<String> names2=Arrays.asList("ravi","kishore");
		Stream<String> s=names.stream();
		Stream<String> s2=names2.stream();
		Stream<String> s3=Stream.concat(s, s2);
		s3.forEach(e->System.out.println(e));
		
		
}

	





}
