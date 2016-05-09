package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.BaseClass;

public class Utility_func  {
	
	private static WebElement element;
	public static  String winHandleBefore;
	public static WebDriver driver = null;
	
	public static WebDriver OpenBrowser(String url) throws Exception{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	    return driver;
	}
	
	
	public static void mouse_hover_action(WebElement elementaction)
	{
		Actions actions = new Actions(driver);
		WebElement subMenu =elementaction ;
		actions.moveToElement(subMenu);
		actions.click().build().perform();
	}
	
	public static void window_handle_open()
	{
		
		winHandleBefore= driver.getWindowHandle();
	    for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	    }
	   }
	    
	    public static void window_handle_close()
	    {
	    	driver.close();
	    	driver.switchTo().window(winHandleBefore);
	    	
	    }
	    
		 public static void waitForElement(WebElement element){
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10);
		     wait.until(ExpectedConditions.elementToBeClickable(element));
		 	}
	
		 public static boolean ElementPresent(WebElement element)
		 {
			 if(element!= null){
				return true;
				 }else{
				 return false;
				 }
	 
		 }
		 
}
