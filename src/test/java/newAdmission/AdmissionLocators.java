package newAdmission;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdmissionLocators extends LoginLocaters {
	
	public AdmissionLocators(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		super(driver);
		PageFactory.initElements(driver, this);
	}



	
	@FindBy(linkText = "ADT") WebElement Adsd;
	@FindBy(linkText="Admission") WebElement  Adm;
	@FindBy(name="PNT_ID") WebElement PId;
	@FindBy(name="BOOKING_ID") WebElement Pname;
	@FindBy(name="ADM_TPYE")WebElement AdmType;
	@FindBy(name="PNT_CLASS")WebElement PatClass;
	@FindBy(name="INSU_PLAN") WebElement InsPlan;
	@FindBy(name="ADM_SOURSE") WebElement AdmSource;
	@FindBy(name="HOSPITAL_SERVICES")WebElement Hospservices;
	@FindBy(name="HOSPITAL_SUB_SERVICES")WebElement subServices;
	@FindBy(name="SC_PROOF") WebElement ScProof;
	@FindBy(name="BED_CLASS") WebElement BBClass;
	@FindBy(name="BED_NUM")WebElement BedNo;
	@FindBy(name="NURSING_STATION") WebElement NurStation;
	@FindBy(name="WARD_NUM")WebElement WardNo;
	@FindBy(name="AMBULATORY_STATUS")WebElement Astatus;
	@FindBy(name="MODE_ARRIVAL")WebElement Arrival;
	@FindBy(name="CAPTURED_BY") WebElement CapturedBy;
	@FindBy(name="CAPTURED_DATE") WebElement CDate;
	
	
	@FindBy(name="MR_NO") WebElement  Mrno;
	@FindBy(name="REQ_ID") WebElement Requestedno;
	@FindBy(name="EXP_DATE") WebElement Admissiondate;
	@FindBy(name="EXP_STAY_DATE")WebElement LOS1;
	@FindBy(name="EXP_STAY_FORMAT") WebElement LOS2;
	@FindBy(name="EXP_DISCHARGE_DATE") WebElement  Expdischarge;
    @FindBy(name="DOC_NAME") WebElement Dname;
	@FindBy(name="DOC_SPL")WebElement Specility;
	@FindBy(name="PRMRY_CONSULT")WebElement PrimaryConsultant;
	@FindBy(name="ADD_DOC_SPL") WebElement specliast;
	@FindBy(name="ADM_BED_CLASS")WebElement bedclass;
	@FindBy(name="submit") WebElement save;

	public void AdmissionExecutedMethods1(String Id,String name,String admtype,String Parentclass,String Insuranceplan,String Admsource,String Hospitalservices,
			String subservices,String citizenproof,String BedClass1,String bdno,String Nursingstation,String ward,String Ambstatus,
			String arrival,String CpbBy,String CpDate) {
		Adsd.click();
		Adm.click();
		PId.sendKeys(Id);
		Pname.sendKeys(name);
		Select A=new Select(AdmType);
		A.selectByVisibleText(admtype);
		Select B=new Select(PatClass);
		B.selectByVisibleText(Parentclass);
		Select D=new Select(InsPlan);
		D.selectByVisibleText(Insuranceplan);
		Select E=new Select(AdmSource);
		E.selectByVisibleText(Admsource);
		Select F=new Select(Hospservices);
		F.selectByVisibleText(Hospitalservices);
		Select G=new Select(subServices);
		G.selectByVisibleText(subservices);
		Select I=new Select(ScProof);
		I.selectByVisibleText(citizenproof);
	    Select J=new Select(BBClass);
		J.selectByVisibleText(BedClass1);
		Select K=new Select(BedNo);
		K.selectByVisibleText(bdno);
		Select L=new Select(NurStation);
		L.selectByVisibleText(Nursingstation);
		Select M=new Select(WardNo);
		M.selectByVisibleText(ward);
		Select N=new Select(Astatus);
		N.selectByVisibleText(Ambstatus);
		Select O=new Select(Arrival);
		O.selectByVisibleText(arrival);
		Select P=new Select(CapturedBy);
		P.selectByVisibleText(CpbBy);
		CDate.sendKeys(CpDate);
	}
		
		public void AdmissionDetails2(String MRNO,String ReqNo,String AdmLate,String los1,String Los2,String Disdate,String AdmDoctor,
				String Spc1,String PrimConstluant,String spc2,String BedClass) {
			Mrno.sendKeys(MRNO);
			Requestedno.sendKeys(ReqNo);
			Admissiondate.sendKeys(AdmLate);
			LOS1.sendKeys(los1);
			
			Select A=new Select(LOS2);
			A.selectByVisibleText(Los2);
			
			Expdischarge.sendKeys(Disdate);
			 Select B=new Select(Dname);
			 B.selectByVisibleText(AdmDoctor);
			 
			 Select C=new Select(Specility);
			 C.selectByVisibleText(Spc1);
			 
			
			 
			 PrimaryConsultant.sendKeys(PrimConstluant);
			 
			 Select E=new Select(specliast);
			 E.selectByVisibleText(spc2);
			 
			 Select F=new Select(bedclass);
			 F.selectByVisibleText(BedClass);
			 
		
			 }
		public void savedetails() {
			save.click();
			
			
		}
			
			
			
			
		
		
	}



