package crossopenbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test116 {

	public static void main(String[] args) throws Exception
	{
		//Run in Linux OS with firefox browser only as of now
		//launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Site 
		driver.get("https://www.google.co.jp");
		Thread.sleep(5000);
		ImeHandler ime = driver.manage().ime();
		List<String> l = ime.getAvailableEngines();
		for(String x:l)
		{
			System.out.println(x);
		}
		//choose japanese
		ime.activateEngine("anthy");
		//send "tokyo" to textbox in japanese
		driver.findElement(By.name("q")).sendKeys("toukyou",Keys.ENTER);
		//here the space at end of value instructs IME to convert the word
		//close site
		driver.close();

	}

}
