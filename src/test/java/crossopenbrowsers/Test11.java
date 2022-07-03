package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.sentia.in");
		String x=driver.getCurrentUrl();
		
		if(x.startsWith("https"))
		{
			System.out.println("Secured Site");
			
		}
		else
		{
			System.out.println("Not Secured Site");
		}
		// TODO Auto-generated method stub
driver.close();
	}

}
