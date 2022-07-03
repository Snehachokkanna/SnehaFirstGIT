package crossopenbrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver ;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test05 {

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://www.selenium.dev");
		// TODO Auto-generated method stub
	}

}
