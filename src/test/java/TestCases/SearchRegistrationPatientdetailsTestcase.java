package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.SearchReageriatrationPage;

public class SearchRegistrationPatientdetailsTestcase extends LogInTestCase{
	@Test(dataProvider = "SearchdetailsWithNo")
	public void SearchPatientDetails(String KeyNo) throws InterruptedException {
		SearchReageriatrationPage s=new SearchReageriatrationPage(driver);
		s.RegNo();
		s.Searchkeyword(KeyNo);
		System.out.println("Seacrch Keyword : " +KeyNo);
		Thread.sleep(3000);
		s.SearchDetails();
		
		
	}
	  @DataProvider(name="SearchdetailsWithNo")
	  public Object[][] PatientDetailsSearchWithKeyword(){
		  return new Object[][] {
			  {"sanakhan@gmail.com"},
			
			  {"deva"},
			  {"Anjali"}
			  
		  };
	  }
	
	

}
