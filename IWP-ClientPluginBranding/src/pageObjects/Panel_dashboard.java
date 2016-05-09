package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Panel_dashboard extends BaseClass {
	private static WebElement element;
	public Panel_dashboard(WebDriver driver){
	   	
		super(driver);
   	}
	public static WebElement Logout_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.linkText("Logout"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Logout_button ID is not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
	
	public static WebElement settings_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.linkText("Settings"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Settings ID is not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
	
	
	public static WebElement login_email_input()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.id("email"));
	       		
	       	}catch (Exception e){
	       		System.out.println("login_email_inpu is not present in the login page");
	       		throw(e);
	       		}
	       	return element;
	  }

	public static WebElement login_pass_input()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.id("password"));
	       		
	       	}catch (Exception e){
	       		System.out.println("login_pass is not present in the login  page");
	       		throw(e);
	       		}
	       	return element;
	  }
	public static WebElement login_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.id("loginSubmitBtn"));
	       		
	       	}catch (Exception e){
	       		System.out.println("login_button is not present in the login page");
	       		throw(e);
	       		}
	       	return element;
	  }
	
	public static WebElement Left_side_site_selection(int j)
	{
		
		 element = null;
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='bottom_left']/div[1]/div[1]/div["+j+"]"));
       		
       	}catch (Exception e){
       		System.out.println("Left_side_site_selection is not present in the login page");
       		throw(e);
       		}
       	return element;
	}
	
	public static WebElement open_admin_newtab()
	{
		
		 element = null;
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='bottomToolbarOptions']/ul/li[3]/a[2]"));
       		
       	}catch (Exception e){
       		System.out.println("open_admin_newtab is not present in the hover menu");
       		throw(e);
       		}
       	return element;
	}
	
	public static WebElement cancel_Button()
	{
		
	element = null;
	       	try{
	       		element= driver.findElement(By.linkText("cancel"));
	       		
	       	}catch (Exception e){
	       		System.out.println("open_admin_newtab is not present in the popup");
	       		throw(e);
	       		}
	       	return element;
       		
       
	}
	
	public static WebElement Precess_queue_button()
	{
		
	element = null;
	       	try{
	       		element= driver.findElement(By.id("process_queue"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Precess_queue is not present in the panel dashboard");
	       		throw(e);
	       		}
	       	return element;
       		
       
	}
	public static WebElement Precess_queue_recententry()
	{
		
	element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='historyQueue']/div[11]/div[2]/div[1]/div[1]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Precess_queue_recententry is not present in the process queue menu");
	       		throw(e);
	       		}
	       	return element;
       		
       
	}
	
	public static WebElement Precess_response_of_recentaction()
	{
		
	element = null;
	       	try{
	       		element= driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div[1]/div[1]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Precess_queue_recententry is not present in the process queue menu");
	       		throw(e);
	       		}
	       	return element;
       		
       
	}

	
	
	
	
}
