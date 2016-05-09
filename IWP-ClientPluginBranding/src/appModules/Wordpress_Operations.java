package appModules;

import org.openqa.selenium.WebElement;

import pageObjects.wordpress_page;

public class Wordpress_Operations {
	public static void noraml_option_chk()
	{
		
		
		

	
	
	}
	
	public static void IWPPresent()
	{
		
		WebElement plugsel=wordpress_page.Plugin_button();
		plugsel.click();
		WebElement iwpchk=wordpress_page.Wp_body_menu();
		Boolean chkiwppresent=iwpchk.getText().contains("InfiniteWP - Client");
		if(chkiwppresent==true)
		{
			System.out.println("TC02: Case for Finding IWP plugin name not changed ***passed***");
		}
		else
		{
			System.out.println("TC02: Case for Finding IWP plugin name not changed ***failed***");
		}
	}
	public static void IWPPresentnotPresent()
	{
		
		WebElement plugsel=wordpress_page.Plugin_button();
		plugsel.click();
		WebElement iwpchk=wordpress_page.Wp_body_menu();
		Boolean chkiwppresent=iwpchk.getText().contains("InfiniteWP - Client");
		if(chkiwppresent==false)
		{
			System.out.println("TC02: Case for Hide IWP plugin name in the plugin page ***passed***");
		}
		else
		{
			System.out.println("TC02: Case for Hide IWP plugin name  in the plugin page  ***failed***");
		}
	}
	
	

	public static void updatesPresent(int sitenum) throws InterruptedException
	{
		
		switch(sitenum)
		{
		
		case 1:
		WebElement plugsel=wordpress_page.Plugin_button();
		plugsel.click();
		Thread.sleep(1000);
		WebElement pudate=wordpress_page.Wp_body_menu();
		Boolean pudatepresent=pudate.getText().contains("update now.");
		if(pudatepresent==true){
			
			System.out.println("TC03 case update not showing in Plugin page ***failed***");
		}
		else{
			System.out.println("TC03 case update not showing in Plugin page ***passed***");
		}
		
		//dashboard Update page
		
		WebElement dashboardbut=wordpress_page.Dashboard_button();
		dashboardbut.click();
		Thread.sleep(1000);
		WebElement updatebutton=wordpress_page.dashboard_updates_button();
		updatebutton.click();
		Thread.sleep(1000);
		WebElement updatePage=wordpress_page.Wp_body_menu();
		Boolean pluginUpdate=updatePage.getText().contains("Your plugins are all up to date.");
		Boolean themeUpdate=updatePage.getText().contains("Your themes are all up to date.");
		Boolean wpUpdate=updatePage.getText().contains("You have the latest version of WordPress");
		System.out.println(pluginUpdate+"\t"+themeUpdate+"\t"+wpUpdate);
		
		if(pluginUpdate==true && themeUpdate== true && wpUpdate==true )
		{
			System.out.println("TC04 case updates not showing in dashboard Update page ***passed***");
		}
		else{
			
			System.out.println("TC04 case updates not showing in dashboard Update page ***failed***");
			
		}
		//theme page Update display
		
		WebElement Appearance=wordpress_page.Appearance_button();
		Appearance.click();
		Thread.sleep(1000);
		WebElement tudate=wordpress_page.Wp_body_menu();
		Boolean tudatepresent=tudate.getText().contains("update now.");
		if(tudatepresent==true){
			
			System.out.println("TC05 case update not  showing in theme page ***failed***");
		}
		else{
			System.out.println("TC05 case update not showing in theme page ***passed***");
		}
		//plugin page  update count class display
		
	WebElement pupdatecnt=wordpress_page.Plugin_update_count();
		String gette2=pupdatecnt.getText();
//		System.out.println("String to print\t"+gette2);
//		int val2=Integer.parseInt(gette2);
		//System.out.println("After conversion \t"+val2);
		if(gette2=="")
		{
			System.out.println("TC06 case update  count not showing in Plugin page ***failed***");
		}
		else
		{
			System.out.println("TC06 case update count not showing in Plugin page ***passed***");
			
		}
		//
		WebElement dashbutton=wordpress_page.Dashboard_button();
		dashbutton.click();
		Thread.sleep(1000);
	WebElement dasupdatecnt=wordpress_page.dashboard_Update_val();
		
		String gette1=dasupdatecnt.getText();
//		System.out.println("String to print\t"+gette1);
//		int val1=Integer.parseInt(gette1);
//		System.out.println("After conversion \t"+val1);
		if(gette1=="")
		{
			System.out.println("TC07 case update  count not showing in dashboard updates  button  ***failed***");
		}
		else
		{
			System.out.println("TC07 case update  count not showing in dashboard updates button ***passed***");
			
		}
		break;
		
			
		case 2:	//update showing in Plugin home page
		WebElement plugsel1=wordpress_page.Plugin_button();
		plugsel1.click();
		Thread.sleep(1000);
		WebElement pudate1=wordpress_page.Wp_body_menu();
		Boolean pudatepresent1=pudate1.getText().contains("update now.");
		if(pudatepresent1==true){
			
			System.out.println("TC08 case update showing in Plugin page ***passed***");
		}
		else{
			System.out.println("TC08 case update showing in Plugin page ***failed***");
		}
		
		//dashboard Update page
		
		WebElement dashboardbut1=wordpress_page.Dashboard_button();
		dashboardbut1.click();
		Thread.sleep(1000);
		WebElement updatebutton1=wordpress_page.dashboard_updates_button();
		updatebutton1.click();
		Thread.sleep(1000);
		WebElement updatePage1=wordpress_page.Wp_body_menu();
		Boolean pluginUpdate1=updatePage1.getText().contains("The following plugins have new versions available");
		Boolean themeUpdate1=updatePage1.getText().contains("The following themes have new versions available");
		Boolean wpUpdate1=updatePage1.getText().contains("An updated version of WordPress is available.");
		
		if(pluginUpdate1==true && themeUpdate1== true && wpUpdate1==true )
		{
			System.out.println("TC09 case updates showing in dashboard Update page ***passed***");
		}
		else{
			
			System.out.println("TC09 case updates showing in dashboard Update page ***Failed***");
			
		}
		//theme page Update display
		
		WebElement Appearance1=wordpress_page.Appearance_button();
		Appearance1.click();
		Thread.sleep(1000);
		WebElement tudate1=wordpress_page.Wp_body_menu();
		Boolean tudatepresent1=tudate1.getText().contains("update now.");
		if(tudatepresent1==true){
			
			System.out.println("TC10 case update showing in theme page ***passed***");
		}
		else{
			System.out.println("TC10 case update showing in theme page ***failed***");
		}
		//plugin page  update count class display
		
		WebElement pupdatecnt1=wordpress_page.Plugin_update_count();
		String gette4=pupdatecnt1.getText();
		System.out.println("String to print\t"+gette4);
		int val4=Integer.parseInt(gette4);
		if(val4>=0)
		{
			System.out.println("TC11 case update count showing in Plugin page ***passed***");
		}
		else
		{
			System.out.println("TC11 case update count showing in Plugin page ***Failed***");
			
		}
		//
		WebElement dashbutton1=wordpress_page.Dashboard_button();
		dashbutton1.click();
		Thread.sleep(1000);
//		int dasupdatecnt1=Panel_operations.Get_size("ClassName", "update-count");
//		System.out.println("count \t"+dasupdatecnt1);
		WebElement dasupdatecnt1=wordpress_page.dashboard_Update_val();
		
		String gette=dasupdatecnt1.getText();
		System.out.println("String to print\t"+gette);
		int val=Integer.parseInt(gette);
		System.out.println("After conversion \t"+val);
		if(val>0)
		{
			System.out.println("TC012 case update count showing in dashboard updates  button  ***passed***");
		}
		else
		{
			System.out.println("TC012 case update count showing in dashboard updates button ***Failed***");
			
		}
		break;
		
		
		
		}
		
	}
	
	public static void EditorOptionPresent() throws InterruptedException
	{
		//editor option in plugin left side menu
		WebElement pbutton=wordpress_page.Plugin_button();
		pbutton.click();
		Thread.sleep(1000);
		WebElement peditor=wordpress_page.plugin_menu();
		Boolean textpresent=peditor.getText().contains("Editor");
		if(textpresent==true)
		{
			System.out.println("TC013 case editor button  presence in the  plugin menu  ***passed***");
			WebElement peditor1=wordpress_page.Plugin_Editor_button();
			peditor1.click();
			Thread.sleep(1000);
			WebElement plugineditpage=wordpress_page.Wp_body_menu();
			Boolean  editorpage=plugineditpage.getText().contains("Edit Plugins");
			if(editorpage==true)
			{
				System.out.println("TC014 case edit page traverse to plugin editor ***passed***");
			}
			else
			{
				System.out.println("TC014 case edit page traverse to plugin editor ***failed***");
			}
		}
		else
		{
			System.out.println("TC013 case editor button  presence in the  plugin menu  ***Failed***");
			
		}
		
		//editor option in Appearance left side menu
		
		WebElement tbutton=wordpress_page.Appearance_button();
		tbutton.click();
		Thread.sleep(1000);
		WebElement teditor=wordpress_page.Appearance_menu();
		Boolean textpresent1=teditor.getText().contains("Editor");
		if(textpresent1==true)
		{
			System.out.println("TC013 case editor button  presence in the  Appearance menu  ***passed***");
			WebElement peditor1=wordpress_page.Appearance_Editor_button();
			peditor1.click();
			Thread.sleep(1000);
			WebElement appeaeditpage=wordpress_page.Wp_body_menu();
			Boolean  editorpage=appeaeditpage.getText().contains("Edit Themes");
			if(editorpage==true)
			{
				System.out.println("TC014 case editor button traverse to appearance editor ***passed***");
			}
			else
			{
				System.out.println("TC014 case editor button traverse to appearanc editor ***failed***");
			}
		}
		else
		{
			System.out.println("TC013 case editor button  presence in the Appearance menu  ***Failed***");
			
		}
		
		//edit button present in the taking first plugin xpath to justify editor button present status
		WebElement pbutton1=wordpress_page.Plugin_button();
		pbutton1.click();
		Thread.sleep(1000);
		WebElement ebutton=wordpress_page.edit_button_pluginpage();
		Boolean buttonpresent=ebutton.getText().contains("Edit");
		if(buttonpresent==true)
		{
			System.out.println("TC015 case edit button  presence in the  plugin page  ***passed***");
			WebElement edbutton=wordpress_page.edit_button_under_plgin();
			edbutton.click();
			Thread.sleep(1000);
			WebElement peditpage=wordpress_page.Wp_body_menu();
			Boolean editorpagechk=peditpage.getText().contains("Edit Plugins");
			if(editorpagechk==true)
			{
				
				System.out.println("TC016 case edit button  traverse page to  plugin editor page  ***Passed***");
			}
			else
			{
				System.out.println("TC016 case edit button  traverse page to  plugin editor page  ***Failed***");
			}
			
		}
		else
		{
			System.out.println("TC015 case edit button  presence in the  plugin page  ***Failed***");
		}
		
		
	}
	

	
	
}
