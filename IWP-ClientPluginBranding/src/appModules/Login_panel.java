package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.Panel_dashboard;

public class Login_panel{


	public static void signout()
	{
		WebElement signout=Panel_dashboard.Logout_button();
		signout.click();
		
	  }
	public static void signin(String mail,String pass)
	{
		WebElement email=Panel_dashboard.login_email_input();
		email.sendKeys(mail);
		WebElement password=Panel_dashboard.login_pass_input();
		password.sendKeys(pass);
		WebElement loginbutton=Panel_dashboard.login_button();
		loginbutton.click();
		
	
	}
}
