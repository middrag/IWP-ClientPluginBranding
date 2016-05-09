package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.Panel_dashboard;
import pageObjects.settings_Page;
import utility.Utility_func;

public class Cpb_normal_action {

	public static void normal_option_select() throws InterruptedException
	{
		
		int checkcpUpdate=Panel_operations.Get_size("cssSelector", ".cancel rep_.sprite_backup .notNowUpdate");
		if(checkcpUpdate>0)
		{
			Panel_operations.close_ClientPluginUpdate_popup();
		}
		Panel_operations.Click_settings();
		//clicking CPB
		Panel_operations.click_specifiedtext("Client Plugin Branding");
		WebElement normalselect=settings_Page.normal_opt_loc();
		normalselect.click();
		WebElement save=settings_Page.Save_settings_opt_loc();
		save.click();
		Thread.sleep(500);
		//recheck after saving
		Panel_operations.Click_settings();
		Panel_operations.click_specifiedtext("Client Plugin Branding");
		WebElement normal_selected=settings_Page.normal_opt_loc();
		Boolean normaloptionstatus=normal_selected.getAttribute("class").contains("active");
		if(normaloptionstatus==true)
		{
			System.out.println("tc:1 **normal** option UI display status active after refresh case ****passed**** ");
			
		}
		else
		{
			System.out.println("tc:1 **normal** option UI display status active after refresh case ****failed**** ");
		}
		
		
	}
	
	public static void normal_wordpresschgschk() throws InterruptedException
	{
		int cnt=Panel_operations.Get_size("cssSelector","div .ind_sites");
		for(int i=1;i<=cnt;i++)
		{
			int j=i+1;
			System.out.println(i+":\t site check");
			System.out.println("================================");
  			WebElement site=Panel_dashboard.Left_side_site_selection(j);
  			site.click();
  			WebElement openadmin=Panel_dashboard.open_admin_newtab();
  			Utility_func.mouse_hover_action(openadmin);
  			Utility_func.window_handle_open();
  			Wordpress_Operations.IWPPresent();
  			Wordpress_Operations.updatesPresent(i);
  			Wordpress_Operations.EditorOptionPresent();
  			//tc2: check changes happened in 
  			Utility_func.window_handle_close();
  			
  			
  			
		}
		
		
	}

}
