package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver){
		this.driver=driver;
	}
	
	public LoginPage enterUsername() {
		 System.out.println("LoginPage:" +driver);
		driver.findElement(By.id("username")).sendKeys("bootcamp_2024@testleaf.com");
	
		//LoginPage lp=new LoginPage();
		//return lp;
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		return this;
	}
	public HomePage clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		//HomePage hp=new HomePage();
		//return hp;
		return new HomePage(driver);
	}
	 
}
