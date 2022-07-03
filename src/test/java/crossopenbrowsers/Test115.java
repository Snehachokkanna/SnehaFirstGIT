package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test115 {

	public static void main(String[] args) throws Exception
	{
		//take browser name from keyboard
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Browser Name");
		String bn=sc.nextLine();
		sc.close();
		//declare "driver"object to parent class and define using child class constructors
		
		RemoteWebDriver driver=null;
		if(bn.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
		else if(bn.equals("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else if(bn.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("please check given browser name");
			System.exit(0);
		}
		//launch site
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//collect browser logs for(chrome/edge/opera browsers)
		List<LogEntry>alllogs = driver.manage().logs().get("browser").getAll();
		for(LogEntry le : alllogs)
		{
			System.out.println(le.getMessage()+" "+le.getTimestamp());
			System.out.println("Hi");
		}
		//close site
		driver.close();
	}

}
