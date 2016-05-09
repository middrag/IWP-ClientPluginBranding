package appModules;

import org.openqa.selenium.WebElement;

import pageObjects.Panel_dashboard;
import pageObjects.settings_Page;

public class Cpb_Change_detail_action {
	public static void change_details_button_click() throws InterruptedException
	{
		int checkcpUpdate=Panel_operations.Get_size("cssSelector", ".cancel rep_.sprite_backup .notNowUpdate");
		if(checkcpUpdate>0)
		{
			Panel_operations.close_ClientPluginUpdate_popup();
		}
		Panel_operations.Click_settings();
		Panel_operations.click_specifiedtext("Client Plugin Branding");
		WebElement changedetails_button=settings_Page.change_details_opt_loc();
		changedetails_button.click();
		//cpb details Fill
		WebElement pname=settings_Page.PluginName_textbox_opt_loc();
		pname.sendKeys(utility.constants.pname);
		WebElement authorname=settings_Page.author_name_textbox_opt_loc();
		authorname.sendKeys(utility.constants.pauthor);
		WebElement authorurl=settings_Page.authorUrl_textbox_opt_loc();
		authorurl.sendKeys(utility.constants.pauthorurl);
		WebElement pdescription=settings_Page.Plugindesc_textbox_opt_loc();
		pdescription.sendKeys(utility.constants.pdescription);
		WebElement save=settings_Page.Save_settings_opt_loc();
		save.click();
		Panel_operations.wait_for_reload();
		processQueue_changes();
		Thread.sleep(500);
		// recheck after saving
		Panel_operations.Click_settings();
		Panel_operations.click_specifiedtext("Client Plugin Branding");
		WebElement changedetails_selected=settings_Page.change_details_opt_loc();
		Boolean change_selected=changedetails_selected.getAttribute("class").contains("active");
		
		
	}
	
	public static void processQueue_changes()
	{
		WebElement pqbutton=Panel_dashboard.Precess_queue_button();
		pqbutton.click();
		//Branding in the Process queue
		WebElement btext=Panel_dashboard.Precess_queue_recententry();
		Boolean brandingtext=btext.getText().contains("Brand client plugin");
		if(brandingtext==true)
		
			{
				System.out.println("Change Details:- TC: Branding process text display in  process queue **Passed**");
			}
			else
			{
				System.out.println("Change Details:- TC: Branding process text display in  process queue **Failed**");
			}
		
		btext.click();
		WebElement btext1=Panel_dashboard.Precess_response_of_recentaction();
		Boolean brandingtext1=btext1.getText().contains("View site response");
		if(brandingtext1==true)
		{
			System.out.println("Change Details:- TC: branding apply on site operation **Failed**");
		}
		else
		{
			System.out.println("Change Details:- TC: branding apply on site operation **passed**");
		}
		
		WebElement btext2=Panel_dashboard.Precess_response_of_recentaction();
		Boolean brandingtext2=btext2.getText().contains("Brand client plugin");
		if(brandingtext2==true)
		{
			System.out.println("Change Details:- TC: branding text display in the process queue  site response page **Passed**");
		}else
		{
			System.out.println("Change Details:- TC: branding text display in the process queue  site response page **Failed**");	
		}
		
	}
	

}
