package crossopenbrowsers;

import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test73 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		//locate Gmail link & test in
		WebElement e = driver.findElement(By.linkText("Gmail")); 
		
		String address = e.getAttribute("href"); //a link should consist "href" attribute
		//connect to corresponding addressed server via API call
		URL u = new URL(address);
		HttpURLConnection con = (HttpURLConnection) u.openConnection();
		con.connect();
		Thread.sleep(5000);
		if(con.getResponseCode()==200)
		{
			System.out.println("Link is working link");
		}
		else
		{
			System.out.println("link is broken link due to "+con.getResponseMessage());
		}
		con.disconnect();
		
		//close site
		driver.close();

	}

}
