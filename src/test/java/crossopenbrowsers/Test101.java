package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test101 {

	public static void main(String[] args) throws Exception
	{
		//open initial browser window and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		long st=System.currentTimeMillis();
		driver.navigate().to("http://www.google.com");
		long et=System.currentTimeMillis();
		System.out.println("Duration is"+(et-st));
		driver.close();
	}

}
