package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import Utilites.ExtentReport;

public class PatientRegistrationTestCase extends LogInTestCase{

	@Test(dataProvider = "PatientDetails")
	public void Registration(String Categoy,String title,String fname,String lname,String photoPath,String DateOfBirth,String age,String PatientGender,
			String Ms,String Rg,String PL,String Adress1,String Phn,String email,String cn,String rel,String PI,String identity,String Nty,
			String Vip,String Edu,String Job,String BdG,String CTz,String ProofSub,String pin) throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.Registration();
		h.PatientCateGoryType(Categoy);
		h.PatientTitle(title);
		h.Pfname(fname);
		h.Plname(lname);
		h.setPatientphoto(photoPath);
		h.PDateOfBirth(DateOfBirth);
		h.Age(age);
		h.gender(PatientGender);
		h.Remainingdetails1(Ms,Rg,PL,Adress1,Phn,email,cn);
		h.Remainingdetails2(rel,PI,identity,Nty,Vip,Edu,Job,BdG,CTz,ProofSub,pin);
		
	
		h.saveDetails();
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert Message: " + a.getText());
		//System.out.println("Alert Message: " + a.getText());
		a.accept();
		ExtentReport.driver=driver;
	}
	
			
		
	@DataProvider(name="PatientDetails")
	public Object [][] PatientDataDetails(){
		return new Object[][] {
{"Self","Ms.","Sana","Khan",System.getProperty("user.dir") +"\\Patientphotos\\sana khan.jpg","25-09-2000","25","Female","Married","Muslim","Arabbi","Hyderabad","8902234534","sanakhan@gmail.com","India","Wife",
"Voter ID","12345566666","Indian","No","B.Tech","Employee","O+","Indian","No","123456"},
{"Self","Ms.","Anjali","Misra",System.getProperty("user.dir") +"\\Patientphotos\\Anjali.jpg","12-03-2002","23","Female","Single","Hindu","Telugu","Manikonda","7658907658","Anjali@gmail.com","India","Wife",
"PAN Card", "34567890","Indian","No","MCA","Self Employeed","B+","Indian","No","2345987"},
{"Self","Mr.","Mohit","Pharmar",System.getProperty("user.dir") +"\\Patientphotos\\boy1.jpg","15-04-2004","21","Male","Single","Hindu","Telugu","Mumbai","8756453678","MohitPharmar@gmail.com","India","Brother","Voter ID","456789345","Indian","No","B.Sc","Self Employeed",
	"O+","Indian","No","400001",},




		};
		
		

		
	}
}
