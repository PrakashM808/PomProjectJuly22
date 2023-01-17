package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage() {
		
	}
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	//element list
	//WebElement USER_NAME_ELEMENT1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"username\"]")WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"password\"]")WebElement PASSWORD_ELEMENT ;
	@FindBy(how=How.XPATH, using ="/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//corresponding method
	
	public void insertUserName(String username) {
		
		USER_NAME_ELEMENT.sendKeys(username);
	}
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickOnSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
	
	public void login(String username ,String password ) {
		USER_NAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
		
	}

}
