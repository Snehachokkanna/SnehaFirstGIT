package crossopenbrowsers;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test113 {

	public static void main(String[] args) throws Exception
	{
		//open browser (opens without any history and cookies by default)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch Site and do login
		driver.get("https://www.gmail.com");
		//Collect all loaded cookies along with added cookie
		Set <Cookie> s =driver.manage().getCookies();
		ArrayList<Cookie> l = new ArrayList(s);
		System.out.println("count of cookies is"+s.size());
		for(Cookie c:l)
		{
			System.out.println(c.getName()+"---------"+c.getValue()+"----------"+c.getDomain());
		}
		//Get specific COokie using cookie's name
		Cookie c = driver.manage().getCookieNamed("NID");
		System.out.println(c.getName()+"---------"+c.getValue()+"----------"+c.getDomain());
		//Delete specific cookie (ex :2nd cookie)using cookie's name
		driver.manage().deleteCookie(l.get(1));
		//Delete specific cookie (ex :1st cookie)using cookie's name
		driver.manage().deleteCookieNamed(l.get(0).getName());
		//Add Cookie
		Cookie cc = new Cookie("magnitia", "abdulkalam");
		driver.manage().addCookie(cc);
	//Cookie ccCookie=	driver.manage().getCookieNamed("magnitia");
	//System.out.println(c.getName()+"---------"+c.getValue()+"----------"+c.getDomain());
	//	System.out.println("cookie added");
		//delete all cookies
		driver.manage().deleteAllCookies();
		//close site
		driver.close();

	}

}
