package crossopenbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode;

public class Selectdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		
		driver.findElement(By.id("accept-choices")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		System.out.println("before findelem");
		
		//List <WebElement> e = driver.findElements(By.xpath("//*[@name='cars']/option"));
		WebElement e =driver.findElement(By.name("cars"));
		System.out.println("after cars are identfied");
		Select s = new Select(e);
		System.out.println("after creation of select s");
		e.click();
		//s.selectByVisibleText("Audi");
		String x = s.getFirstSelectedOption().getText();
		System.out.println("sending the text from s to string x");
		System.out.println("first item"+x);
		/*List<WebElement> items = s.getAllSelectedOptions();
		System.out.println("parsing all the selected options from s to items");
		System.out.println("sneha3");
		for(WebElement item:items)
		{
			System.out.println("sneha4");
			System.out.println(item.getText());
			Thread.sleep(5000);
			//s.selectByVisibleText("Audi");
		}*/
		Thread.sleep(5000);
		driver.close();
	}

}
