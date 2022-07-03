package crossopenbrowsers;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Test75Page {
	//elements as private properties
			private RemoteWebDriver driver;
			@FindBys({
						@FindBy(xpath = "//*")
					})
			private List<WebElement> allElements;	
			
			public Test75Page(RemoteWebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver,this);
			}
			//Operational methods for Operations & Observations on elements
			public String isBrokenLink(WebElement ele)throws Exception
			{
				//1.element has "href" attribute or not
				if(ele.getAttribute("href")!=null)
				{
					String address = ele.getAttribute("href");
					
					//2."href" attribute value starts with "http" or "https"
					if(address.startsWith("https")||address.startsWith("http"))
					{
						//connect to corresponding addressed server via API call
						URL u = new URL(address);
						HttpURLConnection con = (HttpURLConnection) u.openConnection();
						con.connect();
						Thread.sleep(5000);
					//3."200" is status code or not
						if(con.getResponseCode()!=200)
						{
							con.disconnect();
							return("Broken Link"); // return run ayiena tharvatha nik kindha statements wont run 
							
						}
						else //equal to 200
						{
							con.disconnect();
							return("working link");
						}
						
					}
				}
				return("Not a hyper link");
			}
			public List <String> findBrokenLinks() throws Exception
			{
				List<String> brokenlinks = new ArrayList<String>();
				
				for(WebElement ele : allElements)
				{
					if(ele.getAttribute("href")!=null)
					{
						String address = ele.getAttribute("href");
						//2."href" attribute value starts with "http/https" or not
						if(address.startsWith("https")||address.startsWith("http"))
						{
							//Connect to  corresponding addressed server via API call
							URL u = new URL(address);
							HttpURLConnection con =  (HttpURLConnection)	u.openConnection();
							con.connect();
							
							//3."200" is a status code or not 
							if(con.getResponseCode()!=200)
							{
								brokenlinks.add(address);
							}
							con.disconnect();
						}
					}
				} //loop closing
				
				return(brokenlinks);
			}
}
