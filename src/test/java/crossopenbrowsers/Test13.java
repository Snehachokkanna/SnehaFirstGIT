package crossopenbrowsers;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) throws Exception 
	{
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		
		Thread.sleep(2000);
	Set <String> S = driver.getWindowHandles();
	for(String x : S)
	{
		System.out.println(x);
	}
	
		List <String> l = new ArrayList <String> (S);
		System.out.println(l.get(1));
		System.out.println(l.get(0));
	driver.quit();
		
		
	}

}
