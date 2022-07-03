package crossopenbrowsers;

import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test04 {

	public static void main(String[] args) 
	{
		
			//get opera driver software as per opera version in our computer(WDM)
			WebDriverManager.operadriver().setup();
			//open opera browser using opera driver software(SWDD)
			OperaDriver driver=new OperaDriver();
			//do operations
			driver.get("http://www.google.co.in");

		}

	}


