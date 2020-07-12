package discoverDollors.discoverDollor_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest implements IAutoconstants {
	public static WebDriver driver;
	@BeforeClass
	public void openthebrowserentertheurl() throws Throwable
	{
		FileLibrary fl=new FileLibrary();
		String browser = fl.getPropValue(PROP_PATH,"browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("enter proper browser name");
		}
		driver.manage().window().maximize();	
		String appUrl=fl.getPropValue(PROP_PATH, "url");
		driver.get(appUrl);
		
	}
	
}
