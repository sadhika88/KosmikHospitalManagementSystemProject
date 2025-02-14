package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	 WebDriver driver;
	@FindBy(name = "username") WebElement txtUsername;
	@FindBy(name = "password") WebElement txtPassword;
	@FindBy(name = "submit") WebElement txtlogin;

	
	public SignIn(WebDriver  driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void UserLoginDetails(String user,String pwd) {
		txtUsername.sendKeys(user);
		txtPassword.sendKeys(pwd);
		txtlogin.click();
	}
	
	
	
	

}
