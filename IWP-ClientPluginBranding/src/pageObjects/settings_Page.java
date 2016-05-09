package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class settings_Page extends BaseClass {
	
		private static WebElement element;
		   
		public settings_Page(WebDriver driver){
	   	
			super(driver);
	   	}
		
		
			public static WebElement position_Cpb(int i)
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='pageContent']/div/ul/li["+i+"]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("position_Cpb  not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }

			
			public static WebElement normal_opt_loc()
	{
		 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='brandingTab']/div/div[1]/div/div[2]"));
	       		
	       	}catch (Exception e){
	       		System.out.println("position_Cpb  not present in the settings page");
	       		throw(e);
	       		}
	       	return element;
	  }
			
			public static WebElement hide_from_pluginlst_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.xpath(".//*[@id='brandingTab']/div/div[1]/div/div[3]"));
			       		
			       	}catch (Exception e){
			       		System.out.println(" hide_from_pluginlst_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}

			public static WebElement change_details_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.xpath(".//*[@id='brandingTab']/div/div[1]/div/div[4]"));
			       		
			       	}catch (Exception e){
			       		System.out.println("change_details_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement PluginName_textbox_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.id("pluginName"));
			       		
			       	}catch (Exception e){
			       		System.out.println("PluginName_textbox_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement author_name_textbox_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.id("authourName"));
			       		
			       	}catch (Exception e){
			       		System.out.println("author_name_textbox_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement authorUrl_textbox_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.id("authourURL"));
			       		
			       	}catch (Exception e){
			       		System.out.println("authorUrl_textbox_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement Plugindesc_textbox_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.id("description"));
			       		
			       	}catch (Exception e){
			       		System.out.println("position_Cpb  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement hide_updates_dashboard_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.xpath(".//*[@id='brandingTab']/div/div[2]/div/div[3]"));
			       		
			       	}catch (Exception e){
			       		System.out.println("hide_updates_dashboard_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement Disablefileediting_WP_Dashboard_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.xpath(".//*[@id='brandingTab']/div/div[3]/div/div[3]"));
			       		
			       	}catch (Exception e){
			       		System.out.println("Disablefileediting_WP_Dashboard_opt_loc  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
			public static WebElement Save_settings_opt_loc()
			{
				
				 element = null;
			       	try{
			       		element= driver.findElement(By.id("saveSettingsBtn"));
			       		
			       	}catch (Exception e){
			       		System.out.println("position_Cpb  not present in the settings page");
			       		throw(e);
			       		}
			       	return element;
			}
}
