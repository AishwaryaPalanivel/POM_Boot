package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002CreateIndividuals extends BaseClass {
	@Test
	public void run_CreateIndividuals() throws InterruptedException {
//System.out.println("@Test :" +driver);
//		LoginPage lp=new LoginPage();
//		lp.enterUsername();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		
//		HomePage hp=new HomePage();
//		hp.verifySetupHome();
new LoginPage(driver)
.enterUsername()
.enterPassword()
.clickLoginButton()
.verifySetupHome()
.clicktogglebutton()
.clickviewall()
.clickIndividuals()
.clickRecentlyViewed_or_Individuals()
.click_New()
.enter_Last_Name()
.click_save()
.verify_Individual_page();





	
	}
}
