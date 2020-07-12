package discoverDollors;
import org.testng.annotations.Test;

import discoverDollors.discoverDollor_pages.BaseTest;
import discoverDollors.discoverDollor_pages.PageRepo;
import discoverDollors.discoverDollor_pages.WebDriverCommonLib;
@Test
public class CareerOption extends BaseTest {
	public void career() throws Throwable
	{
		
		PageRepo p=new PageRepo(driver);
		p.setcareers();
		WebDriverCommonLib w = new WebDriverCommonLib();
		w.implicitwait();
		w.verifyElement(p.getverifycareers(), "Careers", "career page");
		}
}
