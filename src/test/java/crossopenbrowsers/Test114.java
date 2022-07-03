package crossopenbrowsers;

import java.io.File;

import java.io.FileInputStream;
import java.sql.Date;
import java.util.Set;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test114 {

	public static void main(String[] args) throws Exception
	 
	{
		// Create a new session cookie only using "Cookie" class(way-1)
		Cookie nc1 = new Cookie("session","magnitia");
		//Create any type of cookie (7 types)using "Cookie.Builder" class(way-2)
		Date today = new Date(0);
		Date tomorrow = new Date(today.getTime()+(1000*60*60*24));
		Cookie.Builder b = new Cookie.Builder("session-id-time","magnitia");
		Cookie nc2=b.domain("www.youtube.com").path("/").expiresOn(tomorrow).isSecure(true).build();
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site and take screenshot
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		File dest1 = new File("target\\screenbeforereadingcookies.png");
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,dest1);
		//Add our cookies to browser ,refresh and take screenshot
		driver.manage().addCookie(nc1);
		driver.manage().addCookie(nc2);
		driver.navigate().refresh();
		Thread.sleep(5000);
		File dest2 = new File("target\\screenafteraddingcookies.png");
		File src2 = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2,dest2);
		//collect all loaded cookies
		Set<Cookie> s = driver.manage().getCookies();
		System.out.println("count of cookies is "+s.size());
		for (Cookie c:s)
		{
			System.out.println(c.getName()+"---------"+c.getValue()+"----------"+c.getDomain());
		}
		driver.close();
		

	}

}
