package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test09 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		String x = driver.getPageSource();
		System.out.println(x);
		driver.close();
		// TODO Auto-generated method stub

	}

}
