package crossopenbrowsers;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test01 
{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	}
}
