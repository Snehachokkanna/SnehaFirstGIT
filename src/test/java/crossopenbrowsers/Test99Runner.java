package crossopenbrowsers;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test99Runner {

	public static void main(String[] args) throws Exception
	{
		//open initial browser window and launch site
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("http:///www.magnitia.com");
				Thread.sleep(5000);
				URL u=new URL("http://www.gmail.com");
				driver.navigate().to(u);
				Thread.sleep(5000);
				driver.navigate().back();//magnitia page
				Thread.sleep(5000);
				driver.navigate().forward(); //gmail.com
				Thread.sleep(5000);
				driver.navigate().refresh();//gmail page
				driver.quit();

	}

}
