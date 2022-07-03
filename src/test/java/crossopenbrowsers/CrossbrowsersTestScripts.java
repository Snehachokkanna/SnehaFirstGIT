package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossbrowsersTestScripts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Browser Name");
		String bn=sc.nextLine();
		sc.close();
		
		RemoteWebDriver driver;
		if(bn.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(bn.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
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

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.google.com");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
