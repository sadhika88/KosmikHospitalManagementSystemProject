package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends SignIn {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(linkText="Registration") WebElement PatientRegister;
@FindBy(linkText="Perminent Registration") WebElement PerminentRegister;
@FindBy(name="PATIENT_CAT") WebElement PatientCategory;
@FindBy(name="TITLE") WebElement Title;
@FindBy(name="PNT_NAME") WebElement Fname;
@FindBy(name="LAST_NAME") WebElement Lname;
@FindBy(name="DOB") WebElement PDOB;
@FindBy(xpath="//input[@title='Please Enter Numbers only']") WebElement PAge;
@FindBy(xpath="//select[@name='SEX']") WebElement PGender;
@FindBy(name="MTRL_STATUS") WebElement PMartialStatus;
@FindBy(name="RELIGION") WebElement PReligion;
@FindBy(name="PLANGUAGE") WebElement Language;
@FindBy(name="ADDRESS1") WebElement PAddress;
@FindBy(name="MOBILE_NO") WebElement PatientPhno;
@FindBy(name="EMAIL_ID") WebElement PEmail;
@FindBy(name="COUNTRY_CODE")WebElement PCountry;
@FindBy(name="RELATION") WebElement PRelation;
@FindBy(name="PAT_IDENTITY") WebElement PIdentity;
@FindBy(name="PAT_IDENTITY_PROOF") WebElement PProof;
@FindBy(name="NATIONALITY") WebElement PNationality;
@FindBy(name="IS_MLC") WebElement PVIP;
@FindBy(xpath= "//select[@name='EDUCATION']") WebElement PEducation;
@FindBy(name="OCCUPATION")WebElement POccupation;
@FindBy(name="BLOOD_GRP_CODE") WebElement PBloodGroup;
@FindBy(name="CITIZENSHIP")WebElement PCitizen;
@FindBy(name="SC_PROOF")WebElement PCitizenProof;
@FindBy(name="ZIP") WebElement PZipCode;

@FindBy(name="image")WebElement Uploadphoto;
@FindBy(name="submit")WebElement PSavedetails;
//@FindBy(xpath="//*[@type='reset']") WebElement ClearData;


public void Registration() {
	PatientRegister.click();
	PerminentRegister.click();
}

public void PatientCateGoryType(String Category) {
	Select A=new Select(PatientCategory);
	A.selectByVisibleText(Category);
}	

public void PatientTitle(String PTitle) {
	Select B=new Select(Title);
	B.selectByVisibleText(PTitle);

}
public void Pfname(String fname) {
	Fname.sendKeys(fname);
}
public void Plname(String lname) {
	Lname.sendKeys(lname);
}
public void setPatientphoto(String photopath) {
	Uploadphoto.sendKeys(photopath);
}
	
public void PDateOfBirth(String DateOfBirth) {
	PDOB.sendKeys(DateOfBirth);
}

public void Age(String age) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='" +age+ "'; ",PAge);
}
public void gender(String PatientGender) {
	Select c=new Select(PGender);
	c.selectByVisibleText(PatientGender);
	
}
public void Remainingdetails1 (String Ms,String Rg,String PL,String Adress1,String Phn,String email,String cn) 
{
	Select  d=new Select(PMartialStatus);
	d.selectByVisibleText(Ms);
	Select e=new Select(PReligion);
	e.selectByVisibleText(Rg);
	Select f=new Select(Language);
	f.selectByVisibleText(PL);
	PAddress.sendKeys(Adress1);
	PatientPhno.sendKeys(Phn);
	PEmail.sendKeys(email);
	Select g=new Select(PCountry);
	g.selectByVisibleText(cn);
}
public void Remainingdetails2(String rel,String PI,String identity,String Nty,String Vip,String Edu,String Job,String BdG,String CTz,String ProofSub,
		String pin) {
	Select  d=new Select(PRelation);
	d.selectByVisibleText(rel);
	Select e=new Select(PIdentity);
	e.selectByVisibleText(PI);
	PProof.sendKeys(identity);
	Select f=new Select(PNationality);
	f.selectByVisibleText(Nty);
	Select g=new Select(PVIP);
	g.selectByVisibleText(Vip);
	//Select h=new Select(PEducation);
	//g.selectByVisibleText(Edu);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].value = arguments[1];", PEducation, Edu);
	//Select i=new Select(POccupation);
	//g.selectByVisibleText(Job);
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].value = arguments[1];", POccupation, Job);
	//Select j=new Select(PBloodGroup);
	//g.selectByVisibleText(BdG);
      JavascriptExecutor js2 = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].value = arguments[1];", PBloodGroup, BdG);
	//Select k=new Select(PCitizen);
	//g.selectByVisibleText(CTz);
      JavascriptExecutor js3 = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].value = arguments[1];", PCitizen, CTz);
	Select l=new Select(PCitizenProof);
	//g.selectByVisibleText(ProofSub);
	//Select m=new Select(PZipCode);
	 JavascriptExecutor js4 = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].value = arguments[1];", PCitizenProof,ProofSub );
	PZipCode.sendKeys(pin);
	//PSavedetails.click();
	
}
public void saveDetails() {
	PSavedetails.click();
}

}
