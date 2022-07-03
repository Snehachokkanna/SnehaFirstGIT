package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32fileattachmentAutomation {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename="
			+"tryhtml5_input_type_file");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\sneha\\OneDrive\\Pictures\\DSC04841.jpg");
		
		
			

	}

}
