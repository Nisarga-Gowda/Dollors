package discoverDollors.discoverDollor_pages;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class WebDriverCommonLib extends BaseTest{
	
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void explicitlyWait(String title)
	{
		WebDriverWait  wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains(title));
	}
	public String getpagetitle()
	{
		return driver.getTitle();
	}
	public void verify(String expected,String actual,String pagename)
	{
		Assert.assertEquals(expected, actual);
		Reporter.log(pagename+" got displayed",true);
	}
	public void verifyElement(WebElement  expected,String actual,String element)
	{
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual,  expected);
		Reporter.log(element +" got displayed",true);
	}
	
		
	}


