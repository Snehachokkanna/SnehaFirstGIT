package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.DefaultHttpObject;
import pages.GooglePage;

public class Test71 {

	public static void main(String[] args)   throws Exception
	{
		// open Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch site
		driver.get("http://www.google.co.in");
		
		//Create Object to page class
		GooglePage pobj = new GooglePage(driver);
		
		//Get text of link 1000 times
		long x =System.currentTimeMillis(); //12
		
		for(int i=1;i<=1000;i++)
		{
			//locate and operate element everytime(1000 times)
			pobj.getElement1Text();
		}
		
		long y =System.currentTimeMillis();
		System.out.println("Time taken in seconds without cache is "+(float)(y-x)/1000);
		
		//Get Text  of link 1000 times
		
		long z = System.currentTimeMillis();
		for(int i=1;i<=1000;i++)
			
		{
			//locate element for 1st time & refer corresponding cache for 999  times
			pobj.getElement2Text();
		}
		long w = System.currentTimeMillis();
		System.out.println("Time Taken in seconds with cache is "+(float)(w-z)/1000);
		//close site 
		driver.close();
	}

}
