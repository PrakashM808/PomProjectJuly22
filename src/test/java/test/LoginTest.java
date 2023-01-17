package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.Loginpage;
import util.BrowserFactory;

public class LoginTest {
	
	
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
		Loginpage loginpage =PageFactory.initElements(driver, Loginpage.class);
		loginpage.insertUserName("demo@techfios.com ");
		loginpage.insertPassword("abc123");
		loginpage.clickOnSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage("Dashboard");
		BrowserFactory.tearDown();
	}

}
