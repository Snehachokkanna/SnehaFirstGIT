package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17InvalidselectorException {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//Wrong syntax for xpath
		driver.findElement(By.xpath("//[@name='q']"));
		

	}

}
