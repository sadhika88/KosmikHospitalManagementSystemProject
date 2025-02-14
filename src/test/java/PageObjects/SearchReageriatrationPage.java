package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchReageriatrationPage extends SignIn{

	public SearchReageriatrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText="Registration") WebElement PatientRegister;
	@FindBy(linkText="Search Registration") WebElement Regno;
	@FindBy(name="search") WebElement SearchElement;
	@FindBy(name="submit") WebElement searchButton;
	@FindBy(linkText="Registration List") WebElement Registerlist;
	@FindBy(xpath=" //body[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[1]/td[10]/a[1]") WebElement Editclick;

	
	
	
	public void RegNo() {
		PatientRegister.click();
		Regno.click();
	}
	
	
	public void Searchkeyword(String KeyNo1) {
		SearchElement.sendKeys(KeyNo1);
	
	}
	
	public void SearchDetails() {
		searchButton.click();
	}
	public void EditPatientList() {
		
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", PatientRegister);
	        
		Registerlist.click();
		Editclick.click();
	}

}
