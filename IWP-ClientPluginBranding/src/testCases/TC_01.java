package testCases;

import org.openqa.selenium.WebDriver;

import pageObjects.BaseClass;

import appModules.Cpb_Hidefrom_pluginlist_action;
import appModules.Cpb_normal_action;
import appModules.Login_panel;
import appModules.Panel_operations;

import utility.Utility_func;
import utility.constants;

public class TC_01 {
	public static WebDriver driver;
	public static void main(String args[]) throws Exception
	{
		
		driver=utility.Utility_func.OpenBrowser(constants.pURL);
		new BaseClass(driver);  
		Login_panel.signin("midhubala@revmakx.com", "bala@123");
		Panel_operations.wait_for_reload();
//		Cpb_normal_action.normal_option_select();
//		Cpb_normal_action.normal_wordpresschgschk();
		//hide from Plugin List
		
		Cpb_Hidefrom_pluginlist_action.Hidefrom_pluginlist_click();
		Cpb_Hidefrom_pluginlist_action.Hidefrom_pluginlist_wordpresschgschk();
		Login_panel.signout();
		//change Details
		
		
	
		
	}

}
