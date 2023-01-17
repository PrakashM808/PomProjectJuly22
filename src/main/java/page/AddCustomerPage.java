package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how = How.XPATH, using ="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"account\"]")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"cid\"]")WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"country\"]")WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"phone\"]")WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
	
	public void verifyAddContactPage(String addContactHeaderText) {
		
//		WebDriverWait wait =new WebDriverWait(driver , 10);
//		wait.until(ExpectedConditions.invisibilityOf(ADD_CONTACT_HEADER_ELEMENT));
//		
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContactHeaderText , "Wrong Page!!");
		
	}
	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName +generateRandomNum(999) );
		
	}
	
	
	public void selectCompany(String company) {
		selectFromDrowdown(COMPANY_ELEMENT,company);	 
		
	}
	public void selectCountry(String country) {
		selectFromDrowdown(COUNTRY_ELEMENT,country);
	}
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(999)+email );
		
	}
	public void insertPhoneNum(String phone) {
		PHONE_ELEMENT.sendKeys(phone+generateRandomNum(999) );
	}
		
	
	
}
