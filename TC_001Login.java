package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC_001Login extends BaseClass {
	@Test
	public void run_Login() {
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
	.clicktogglebutton();
	
	
	}
}
