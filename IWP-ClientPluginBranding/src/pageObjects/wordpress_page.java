package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wordpress_page extends BaseClass{
	private static WebElement element;
	   
	public wordpress_page(WebDriver driver){
   	
		super(driver);
   	}
	//content
	
	public static WebElement Wp_body_menu()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.id("wpbody-content"));
	       		
	       	}catch (Exception e){
	       		System.out.println("themebody not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
	//dashboard	
	public static WebElement Dashboard_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-dashboard']/a/div[3]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("page content ID is not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
	public static WebElement Dashboard_menu()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-dashboard']/ul"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Dashboard_menu not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
	
	public static WebElement dashboard_updates_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-dashboard']/ul/li[3]/a"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Dashboard_menu not present in the settings page");
	       		throw(e);
	       		}
	       	return element;	
	}
	
	public static WebElement dashboard_Update_val()
	{
	
       		//element= driver.findElement(By.xpath(".//span/span[@class='update-count']"));
		element= driver.findElement(By.xpath(".//*[@id='menu-dashboard']//span/span"));
       		
       		return element;
	}
	
	//theme

	public static WebElement Appearance_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-appearance']/a/div[3]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Apperarence link not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }

	public static WebElement Appearance_menu()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-appearance']/ul"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Apperarence link not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }

	public static WebElement Appearance_Editor_button()
	{
		
			 element = null;
		       	try{
		       		element= driver.findElement(By.linkText("Editor"));
		       		
		       	}catch (Exception e){
		       		System.out.println("Apperarence link not present in the settings page");
		       		throw(e);
		       		}
		       	return element;
	}
//plugin
	public static WebElement Plugin_button()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-plugins']/a/div[3]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Apperarence link not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }

	public static WebElement plugin_menu()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='menu-plugins']/ul"));
	       		
	       	}catch (Exception e){
	       		System.out.println("Apperarence link not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
	public static WebElement Plugin_Editor_button()
	{
		
			 element = null;
		       	try{
		       		element= driver.findElement(By.linkText("Editor"));
		       		
		       	}catch (Exception e){
		       		System.out.println("Apperarence link not present in the settings page");
		       		throw(e);
		       		}
		       	return element;
	}
	public static WebElement Plugin_update_count()
	{
		
   		//element= driver.findElement(By.xpath(".//span/span[@class='plugin-count']"));
		element= driver.findElement(By.xpath(".//*[@id='menu-plugins']//span/span"));
   		
   		return element;
	}
	public static WebElement edit_button_pluginpage()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='the-list']/tr[1]/td[1]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("edit_button  not present in the plugin page");
	       		throw(e);
	       		}
	       	return element;
		
	}
	public static WebElement edit_button_under_plgin()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='the-list']/tr[1]/td[1]/div/span[2]/a"));
	       		
	       	}catch (Exception e){
	       		System.out.println("edit_button  not present in the plugin page");
	       		throw(e);
	       		}
	       	return element;
		
	       	
	}
	
	public static WebElement plugin_author_location(String id)
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='"+id+"']/td[2]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("plugin_author_location  not present in the plugin page");
	       		throw(e);
	       		}
	       	return element;
		
	       	
	}
	public static WebElement plugin_author_URL_location(String id)
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='"+id+"']/td[2]/div[2]/a"));
	       		
	       	}catch (Exception e){
	       		System.out.println("plugin_author_URL_location  not present in the plugin page");
	       		throw(e);
	       		}
	       	return element;
		
	       	
	}
	public static WebElement plugin_Brandingtext_in_Update(String id)
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='"+id+"']//td/div"));
	       		
	       	}catch (Exception e){
	       		System.out.println("plugin_Brandingtext_in_Update not present in the plugin page");
	       		throw(e);
	       		}
	       	return element;
		
	       	
	}
	
	
	
}
