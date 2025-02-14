package TestCasesExecution;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ArrayStack;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;
import newAdmission.AdmissionLocators;

public class NewAdmissionTestCaseExecutionn extends LogIn {
	
	
	@Test(dataProvider = "PatientAdmissionDetails")
public void AdmissionMethods(String Id,String name,String admtype,String Parentclass,String Insuranceplan,String Admsource,String Hospitalservices,
		String subservices,String citizenproof,String bcla,String bdno,String Nursingstation,String ward,String Ambstatus,
		String arrival,String CpbBy,String CpDate,String MRNO,String ReqNo,String AdmLate,String los1,String Los2,String Disdate,String AdmDoctor,
		String Spc1,String PrimConstluant,String spc2,String BedClass) throws InterruptedException	{
		
		
		AdmissionLocators A=new AdmissionLocators(driver);
		A.AdmissionExecutedMethods1(Id, name, admtype, Parentclass, Insuranceplan, Admsource, Hospitalservices, subservices, citizenproof, bcla, bdno, Nursingstation, ward, Ambstatus, arrival, CpbBy, CpDate);
		A.AdmissionDetails2(MRNO, ReqNo, AdmLate, los1, Los2, Disdate, AdmDoctor, Spc1, PrimConstluant, spc2, BedClass);
		A.savedetails();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
		    try {
		        Alert alert = wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert
		        System.out.println("The message is : " + alert.getText());
		        alert.accept();
		    } catch (NoAlertPresentException e) {
		        System.out.println("No alert present.");
		    }
		
	}
	
	
	
		 @DataProvider(name="PatientAdmissionDetails")
		   public Object[][] AdmissionDetailValues(){
			 
					 return new Object[][] {
					 {"329561","Anjali","Illness","General","No","General","X-Ray","Scanning", "No", "General","BED-2","Rani","9","Ambulance",
							 "With Family Members","Doctor","12-02-2025","PR4998643839","123445","17-02-2025","3","Days","20-02-2025",
							 "Dr Vishnu","Cordialagist","Dr Vishnu","Cordialagist","General"},
					 
					 
					{"329462","Sana" ,"Accident","ICU","No","1st Class","Diagnastic Services","Surgery","No","1ST","BED-2","Jhansi Laxmi","9","Wheelchair","Ambulance","Admin",
							"14-02-2025","PR1180673296","123559","20-02-2025","10","Weeks","28-02-2025","Sai","cordialagist","Dr Vishnu","cordialagist","General"}
							 
									 
				
					           
					  	
					 };
			
		 }
}
