package crossopenbrowsers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.io.*;



public class Test54Page 
{
	//Elements as properties
	private RemoteWebDriver driver;
	
	@FindBy(xpath="//div[@class='button-align-center']/ul")
	private WebElement e;
	
	//constructor method
	public Test54Page(RemoteWebDriver driver)
	{
	this.driver=driver;
	AjaxElementLocatorFactory afdriver=new AjaxElementLocatorFactory(driver,20);
	PageFactory.initElements(afdriver, this);
	}
	
	//Operational methods to operate elements and observe elements
	public String getElementScreenshot() throws Exception
	{
		SimpleDateFormat sf = new SimpleDateFormat("dd-mmm-yyyy-hh-mm-ss");
		Date dt = new Date();
		String filename = sf.format(dt)+".png";
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("target\\"+filename);
		FileHandler.copy(src, dest);
		return(dest.getAbsolutePath());
		
		
		
	}
	
	
}
