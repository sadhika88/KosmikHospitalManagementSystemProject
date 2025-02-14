package DeleteAdmissionofpatient;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilites.ExtentReport;

public class CancelAdmission {
	public static WebDriver driver;

	@Test
	public void Execution() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/admission.php");
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		ExtentReport.driver=driver;
		
		
		
		
		driver.findElement(By.linkText("ADT")).click();
		driver.findElement(By.linkText("Admission List")).click();
		driver.findElement(By.xpath("  //body[1]/div[2]/div[1]/div[2]/table[108]/tbody[1]/tr[1]/td[10]/a[2]")).click();
		
		
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		a.accept();
			
			
		
	}



}
