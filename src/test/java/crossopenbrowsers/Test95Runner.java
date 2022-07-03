package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test95Runner {

	public static void main(String[] args) throws Exception
	
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Thread.sleep(5000);
		//1.Switch to frame
		driver.switchTo().frame("iframeResult"); //using frame name (or) id
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		//2.switch to alert
		driver.switchTo().alert().accept();
		//the above statement accepts alert and send back "driver" object to frame
		Thread.sleep(5000);
		String x = driver.findElement(By.id("demo")).getText();
		System.out.println(x);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		//4.Switch to alert
		driver.switchTo().alert().dismiss();
		//the above statement dismiss alert & send back "driver" object focus to frame
		Thread.sleep(5000);
		String y = driver.findElement(By.id("demo")).getText();
		System.out.println(y);
		//close site
		driver.switchTo().defaultContent(); //back to page
		driver.close();

	}

}
