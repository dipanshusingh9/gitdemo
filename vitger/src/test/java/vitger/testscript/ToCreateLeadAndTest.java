package vitger.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import CreateLeadRepository.CreateLeadrepo;
import CreateLeadRepository.Leadsverification;
import CreateLeadRepository.leadsdetialsrepo;
import generic_utility.BaseClass;
import generic_utility.IPathConstant;
import vitger.PomRepo.HomePage;

public class ToCreateLeadAndTest extends BaseClass {
	@Test
	public void toCreateLeadandToVerifytheLead() throws EncryptedDocumentException ,IOException 
	{
		String salutation = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 17, 2);
		String firstname =  eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 18, 2);
		String lastname  =  eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 19, 2);
		String companyname = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 20, 2);
		String Industrytype = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 21, 2);
		String AssignedTo  = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 23, 2);		
	
	HomePage home = new HomePage(driver);
	home.ClickonLeadsModules();
	
	CreateLeadrepo leads = new CreateLeadrepo(driver);
	leads.createleads();
	
	leadsdetialsrepo CreateLeads = new leadsdetialsrepo();
	CreateLeads.selectsalutation(salutation);
	CreateLeads.enterfirstname(firstname);
	CreateLeads.enterlastname(lastname);
	CreateLeads.entercompany(companyname);
	CreateLeads.selectcompany(Industrytype);
	CreateLeads.assignedgroup(AssignedTo);
	
	Leadsverification verify = new Leadsverification(driver);
	String Leadinfo = verify.verifyinfo(firstname);
	
	Assert.assertTrue(Leadinfo.contains(firstname));
	System.out.println("LEADS  HAS BEEN CREATED");
	System.out.println("FAILED");
	}
	

}
