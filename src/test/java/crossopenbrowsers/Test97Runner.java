package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test97Runner {

	public static void main(String[] args)  throws Exception
	
	{

		//open initial browser window and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//create new window/tabs
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//collect window handle values(Strings) of those browser windows/tabs
		Set<String> S=driver.getWindowHandles();//sequential set
		List<String> a=new ArrayList<String>(S);//random list
		//switch to new tab(2nd)
		driver.switchTo().window(a.get(1));
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//switch to new window(3rd)
		driver.switchTo().window(a.get(2));
		driver.get("http://www.yahoomail.com");
		Thread.sleep(5000);
		//close all window/tabs
		driver.quit();
	}

}
