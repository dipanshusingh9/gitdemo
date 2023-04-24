package vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMREPO.CreateNewLeadPage;
import POMREPO.HomePage;
import POMREPO.LeadInformationPage;
import POMREPO.LeadsPage;
import genericUtility.BaseClass;
import genericUtility.IPATHCONSTANT;

public class ToCreateALeadTest extends BaseClass{
	@Test
	public void toCreateALeadAndToVerifyTheLead() throws EncryptedDocumentException, IOException {
		
		String salutation = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 17, 2);
		String firstName = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 18, 2);
		String lastName = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 19, 2);
		String companyName = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 20, 2);
		String industryName = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 21, 2);
		String assignedTo = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 23, 2);
		
		HomePage home=new HomePage(driver);
		home.clickOnLeads();
		LeadsPage leads = new LeadsPage(driver);
		leads.clickOnLeadsPlusButton();
		
		CreateNewLeadPage createLead = new CreateNewLeadPage(driver);
		createLead.selectSalutationType(salutation);
		createLead.enterFirstName(firstName);
		createLead.enterLastName(lastName);
		createLead.enterCompanyName(companyName);
		createLead.selelctFromIndustryDropdown(industryName);
		createLead.clickOnGroupRadioButton();
		createLead.selelctFromAssignToDropdown(assignedTo);
		createLead.clickOnSaveButton();
		
		LeadInformationPage leadInfo = new LeadInformationPage(driver);
		String actualLeadName = leadInfo.verifyLeadInfo(firstName);
		
		Assert.assertTrue(actualLeadName.contains(firstName));
		System.out.println("The Lead has been created");
		System.out.println("The Lead has been created");	

	}

}
