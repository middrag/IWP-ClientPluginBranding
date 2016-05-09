package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import pageObjects.Panel_dashboard;
import pageObjects.settings_Page;

public class Panel_operations extends BaseClass{
	
	public Panel_operations(WebDriver driver) {
		super(driver);
		}
	public static WebElement settings;
	public static void Click_settings(){
		
		settings=Panel_dashboard.settings_button();
		settings.click();
	}
	public static void wait_for_reload()
	{
	      int te=driver.findElements(By.cssSelector("div.in_progress")).size();
	    
	      while(te!=0)
	      {
		     te=driver.findElements(By.cssSelector("div.in_progress")).size();
		     }
	}

	public static int Get_size(String type,String value)
	{
		int cnt=0;
		if(type=="cssSelector")
		{
		 
			
		List<WebElement> elemen=driver.findElements(By.cssSelector(value));
		cnt=elemen.size();
  		return cnt;
		
		}
		
		else  if(type=="ClassName"){
  			List<WebElement> elemen1=driver.findElements(By.className(value));
			cnt=elemen1.size();
	  		return cnt;
		}
	  		
		return cnt;
	
	  		
	  		

	
		  		
}
	//ignoring Clinet Plugin Update popup window
	public static void close_ClientPluginUpdate_popup()
	{
		WebElement cancelbutton=Panel_dashboard.cancel_Button();
		cancelbutton.click();
	}
	

	// finding client plugin position and selecting 
	public static void click_specifiedtext(String texttoclick)
	{
	int listcnt=Get_size("cssSelector","ul.settings_nav li");
	System.out.println(listcnt);
	//client Plugin Branding Selection
	for(int i=1;i<=listcnt;i++)
	{
		Boolean test=settings_Page.position_Cpb(i).getText().contains(texttoclick);
		if(test==false)
		{
			if(i==listcnt)
			{
				System.out.println("Client Plugin Branding is not in settings page");
			}
		}
		else{
			
			WebElement clickcpb=settings_Page.position_Cpb(i);
			clickcpb.click();
			i=listcnt+1;
		}
			
	}
	}
	
//process queue check
	
	
}
