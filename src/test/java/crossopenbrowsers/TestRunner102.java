package crossopenbrowsers;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;




import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner102 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//minimize browser
		driver.manage().window().minimize(); //new in SWD4
		Thread.sleep(5000);
		//maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get size of browser window
		int w = driver.manage().window().getSize().getWidth();
		int h = driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		//Set or change size for browser windows
		Dimension d = new Dimension(300,200);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//Get position of browser window on desktop
		int x = driver.manage().window().getPosition().getX();
		int y= driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		//Set or change position of browser window on desktop
		Point p = new Point(400,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		//full screen
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		//Automate f11 or esc to terminate from full screen (java robot)
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F11); 
		r.keyRelease(KeyEvent.VK_F11);
		Thread.sleep(10000);
		driver.close();
	}

}
