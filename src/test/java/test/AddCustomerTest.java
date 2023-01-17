package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.Loginpage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	@Test
	public void validCustomerShouldBeAbleToCreatCustomer() {
		driver=BrowserFactory.init();
		
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		loginpage.login("demo@techfios.com ", "abc123");
		DashboardPage dashboardPage =PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage("Dashboard");
		dashboardPage.clickOnCustomer();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);

		addCustomerPage.verifyAddContactPage("Add Contact");
		addCustomerPage.insertFullName("Selenium");
		addCustomerPage.selectCompany("Techfios");
		addCustomerPage.selectCountry("Albania");
		addCustomerPage.insertEmail("abc123@gmail.com");
		addCustomerPage.insertPhoneNum("1234567");
	}
	

}
