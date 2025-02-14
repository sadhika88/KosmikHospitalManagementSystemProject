package newAdmission;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocaters {

	 protected WebDriver driver;
		@FindBy(name = "username") WebElement txtUsername;
		@FindBy(name = "password") WebElement txtPassword;
		@FindBy(name = "submit") WebElement txtlogin;

		
		public LoginLocaters(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}


		
		
		public void UserLoginDetails(String user,String pwd) {
			txtUsername.sendKeys(user);
			txtPassword.sendKeys(pwd);
			txtlogin.click();
		}
}
