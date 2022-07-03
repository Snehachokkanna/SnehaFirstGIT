package crossopenbrowsers;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.BlockedCookieWithReason;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test96Runner {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		Thread.sleep(5000);
		
		// in 1st browser
		
		driver.findElement(By.xpath("(//a[contains(text(),'Try it')])[1]")).click();
		Thread.sleep(5000);
		
		//1. get window handles and move to 2nd window/tab
		Set <String> s = driver.getWindowHandles();
		List <String> l = new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		//2.switch to frame in 2nd window/tab
		driver.switchTo().frame("iframeResult"); // using frame index or name
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		//3.switch to alert
		driver.switchTo().alert().dismiss();
		//4 the above statement dismisses the alert and send back "driver" object focus to frame
		Thread.sleep(5000);
		//5.Back to 2nd window/tab from frame
		driver.switchTo().defaultContent();
		//close 2nd window/tab
		driver.close();
		Thread.sleep(5000);
		//6.back to 1st window/tab
		driver.switchTo().window(l.get(0));
		//close 1st window/tab
		driver.close();
		
		
		
		
		

	}

}
