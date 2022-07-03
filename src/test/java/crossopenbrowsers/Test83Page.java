package crossopenbrowsers;

import java.util.List;

import org.checkerframework.checker.units.qual.mm;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test83Page 
{
	//elements as private properties
	
	private RemoteWebDriver driver;
	
	@FindBy(name="identifier")
	private WebElement uid;
	
	@FindBy(xpath="//span[text()='Weiter']/parent::button")
	private WebElement uidnext;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//span[text()='Weiter']/parent::button")
	private WebElement pwdnext;
	
	@FindBys({
		
		@FindBy(xpath ="(//table[@role='grid'])[2]/tbody/tr")
	})
	private List <WebElement> mails;
	
	@FindBy(xpath="//div[@aria-label='Older']")
	private WebElement nextbox;
	

	@FindBy(xpath="//a[starts-with(@aria-label,'Google Account:')]/img")
	private WebElement profilepic;
	
	@FindBy(linkText = "Sign out")
	private WebElement logout;
	
	   public Test83Page(RemoteWebDriver driver) 
		{
			  this.driver=driver;
			  AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
			  PageFactory.initElements(afdriver, this);
		}
	   //operational methods for Operations and observations
	   
	   public void fillUid(String value)
	   {
		   uid.clear();
		   uid.sendKeys(value);
	   }
	   
	   public void clickUidNext()
	   {
		   uidnext.click();
	   }
	   
	   public void fillPwd(String value)
	   {
		   pwd.clear();
		   pwd.sendKeys(value);
	   }
	   
	   public void clickPwdNext()
	   {
		   pwdnext.click();
	   }
	
	public int getCountofAllmails() throws Exception
	{
		//come to home page
		driver.navigate().refresh();
		Thread.sleep(5000);
		//pagination
		int amc=0;
		while(true) //infinite loop
		{
			amc=amc+mails.size();
			try
			{
				if(nextbox.getAttribute("aria-disabled").equals("true"))
				{
				break;
				}
			}
			catch(Exception ex)
			{
				nextbox.click();
				Thread.sleep(3000);
			}
		}
		return(amc);
	}
	public int getCountofReadMails() throws Exception
	{
				//come to home page
				driver.navigate().refresh();
				Thread.sleep(5000);
				//pagination
				int rmc=0;
				while(true) //infinite loop
				{
					//Test each mail for read in currents page's mailbox table
					for(WebElement mail:mails)
					{
						WebElement e=mail.findElement(By.xpath("child::td[4]/div[1]"));
						String text = (String)driver.executeScript("return(arguments[0].textContent);",e);
						if(!text.startsWith("unread"))
						{
							rmc++;
						}
					}
					//Go to next page
					try
					{
					if(nextbox.getAttribute("aria-disabled").equals("true"))
					{
						break;
					}
				 }
					catch(Exception ex)
					{
						nextbox.click();
						Thread.sleep(3000);
					}
				}
				
				return(rmc);
	}
	public int getCountofUnreadmails() throws Exception
	{
		//come to home page
		driver.navigate().refresh();
		Thread.sleep(5000);
		//pagination
		int urmc=0;
		while(true) //infinite loop
		{
			//Test each mail for unread in currents page's mailbox table
			for(WebElement mail:mails)
			{
				WebElement e=mail.findElement(By.xpath("child::td[4]/div[1]"));
				String text = (String)driver.executeScript("return(arguments[0].textContent);",e);
				if(text.startsWith("unread"))
				{
					urmc++;
				}
			}
			//Go to next page
			try
			{
			if(nextbox.getAttribute("aria-disabled").equals("true"))
			{
				break;
			}
		 }
			catch(Exception ex)
			{
				nextbox.click();
				Thread.sleep(3000);
			}
		}
		
		return(urmc);	
	}
		public int getCountofMailswithAttachments() throws Exception
		{
			//come to home page
			driver.navigate().refresh();
			Thread.sleep(5000);
			//pagination
			int atmc=0;
			while(true) //infinite loop
			{
				//Test each mail for attachments in current pages mail box table
				for(WebElement mail:mails)
				{
					List<WebElement> divs =mail.findElements(By.xpath("child::td[5]/div"));
					if(divs.size()==2)
					{
						atmc++;
					}
				}
				//Go to next page
				try
				{
				if(nextbox.getAttribute("aria-disabled").equals("true"))
				{
					break;
				}
			 }
				catch(Exception ex)
				{
					nextbox.click();
					Thread.sleep(3000);
				}
			}
			
			return(atmc);
			
		}
		public int getCountofMailsFromId(String emailid)throws Exception
		{
			//come to home page
			driver.navigate().refresh();
			Thread.sleep(5000);
			//pagination
			int fmc=0;
			while(true) //infinite loop
			{
				//Test each mail for given emailid in currents page's mailbox table
				for(WebElement mail:mails)
				{
					String from =mail.findElement(By.xpath("child::td[4]/div[2]/span/span")).getAttribute("email");
					if(from.equalsIgnoreCase(emailid))
					{
						fmc++;
					}
				}
				//Go to next page
				try
				{
				if(nextbox.getAttribute("aria-disabled").equals("true"))
				{
					break;
				}
			 }
				catch(Exception ex)
				{
					nextbox.click();
					Thread.sleep(3000);
				}
			}
			
			return(fmc);	
		}
		public int getCountofmailsOnDate(int year,String monthname,int day) throws Exception
		{

			//come to home page
			driver.navigate().refresh();
			Thread.sleep(5000);
			//pagination
			int dmc=0;
			while(true) //infinite loop
			{
				//Test each mail for given date in currents page's mailbox table
				for(WebElement mail:mails)
				{
					String text =mail.findElement(By.xpath("child::td[8]/span")).getAttribute("title");
					String[] p1=text.split(",");
					p1[2]=p1[2].trim();
					int y=Integer.parseInt(p1[2]);
					p1[1]=p1[1].trim();
					String[] p2=p1[1].split(" ");
					int d=Integer.parseInt(p2[1]);
					String mn =p2[0];
					
					if(day==d&&monthname.toLowerCase().startsWith(mn.toLowerCase())&&year==y)
					{
						dmc++;
					}
				}
				//Go to next page
				try
				{
				if(nextbox.getAttribute("aria-disabled").equals("true"))
				{
					break;
				}
			 }
				catch(Exception ex)
				{
					nextbox.click();
					Thread.sleep(3000);
				}
			}
			return(dmc);		
		}
		public int deleteMailFromId(String emailid)throws Exception
		{
			//come to home page
			driver.navigate().refresh();
			Thread.sleep(5000);
			//pagination
			int dmc=0;
			while(true) //infinite loop
			{
				//Test each mail for given email-id in currents page's mailbox table
				for(int i=0;i<mails.size();i++)
				{
					String from =mails.get(i).findElement(By.xpath("child::td[4]/div[2]/span/span")).getAttribute("email");
					if(from.equalsIgnoreCase(emailid))
					{
						dmc++;
						//delete that mail
						mails.get(i).findElement(By.xpath("child::td[2]/div[@role='checkbox']")).click();
						Thread.sleep(3000);
						mails.get(i).findElement(By.xpath("child::td[9]/ul/li[@data-tooltip='Delete']")).click();
						Thread.sleep(4000);
						driver.findElement(By.xpath("//div[@role='alert']/descendant::button")).click();
						Thread.sleep(4000);
						i--;
					}

				}
				//Go to next page
				try
				{
				if(nextbox.getAttribute("aria-disabled").equals("true"))
				{
					break;
				}
			 }
				catch(Exception ex)
				{
					nextbox.click();
					Thread.sleep(3000);
				}
			}
			return(dmc);		
			
		}
	public void clickProfilePic()
	{
		profilepic.click();
		
	}
	public void clickSignOut()
	{
		logout.click();
	}

}
	
	
	
	
	
	

	

