package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.SignIn;
import Utilites.ExtentReport;

public class LogInTestCase  {
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/index.php");
		 driver.manage().window().maximize();
		 ExtentReport.driver = driver;
		 }
		 @Test
		 
		 public void UserLogIn() {
			 SignIn s=new SignIn(driver);
			 s.UserLoginDetails("kosmik", "kosmik");
		 }
		
	}

