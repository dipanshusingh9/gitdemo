package CreateLeadRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class leadsdetialsrepo {
	
	public void Leadrepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getSelectsalutation() {
		return selectsalutation;
	}

	public void setSelectsalutation(WebElement selectsalutation) {
		this.selectsalutation = selectsalutation;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public void setFirstnametextfield(WebElement firstnametextfield) {
		this.firstnametextfield = firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public void setLastnametextfield(WebElement lastnametextfield) {
		this.lastnametextfield = lastnametextfield;
	}

	public WebElement getCompanynametextfield() {
		return companynametextfield;
	}

	public void setCompanynametextfield(WebElement companynametextfield) {
		this.companynametextfield = companynametextfield;
	}

	public WebElement getDesignationname() {
		return designationname;
	}

	public void setDesignationname(WebElement designationname) {
		this.designationname = designationname;
	}

	public WebElement getSelectleadsource() {
		return selectleadsource;
	}

	public void setSelectleadsource(WebElement selectleadsource) {
		this.selectleadsource = selectleadsource;
	}

	public WebElement getSelectindustrytype() {
		return selectindustrytype;
	}

	public void setSelectindustrytype(WebElement selectindustrytype) {
		this.selectindustrytype = selectindustrytype;
	}

	public WebElement getSelectleadstatus() {
		return selectleadstatus;
	}

	public void setSelectleadstatus(WebElement selectleadstatus) {
		this.selectleadstatus = selectleadstatus;
	}

	public WebElement getCompanyannualrevenue() {
		return companyannualrevenue;
	}

	public void setCompanyannualrevenue(WebElement companyannualrevenue) {
		this.companyannualrevenue = companyannualrevenue;
	}

	public WebElement getUserradiobutton() {
		return userradiobutton;
	}

	public void setUserradiobutton(WebElement userradiobutton) {
		this.userradiobutton = userradiobutton;
	}

	public WebElement getGroupradiobutton() {
		return groupradiobutton;
	}

	public void setGroupradiobutton(WebElement groupradiobutton) {
		this.groupradiobutton = groupradiobutton;
	}

	public WebElement getSelectassigned_group_id() {
		return selectassigned_group_id;
	}

	public void setSelectassigned_group_id(WebElement selectassigned_group_id) {
		this.selectassigned_group_id = selectassigned_group_id;
	}

	public WebElement getEnter_phone_textarea() {
		return enter_phone_textarea;
	}

	public void setEnter_phone_textarea(WebElement enter_phone_textarea) {
		this.enter_phone_textarea = enter_phone_textarea;
	}

	public WebElement getLeadswebsite() {
		return leadswebsite;
	}

	public void setLeadswebsite(WebElement leadswebsite) {
		this.leadswebsite = leadswebsite;
	}

	public WebElement getLaneaddressnox() {
		return laneaddressnox;
	}

	public void setLaneaddressnox(WebElement laneaddressnox) {
		this.laneaddressnox = laneaddressnox;
	}

	public WebElement getCityaddressbox() {
		return cityaddressbox;
	}

	public void setCityaddressbox(WebElement cityaddressbox) {
		this.cityaddressbox = cityaddressbox;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(WebElement postalcode) {
		this.postalcode = postalcode;
	}

	public WebElement getStatenamebox() {
		return statenamebox;
	}

	public void setStatenamebox(WebElement statenamebox) {
		this.statenamebox = statenamebox;
	}

	public WebElement getDescriptionbox() {
		return descriptionbox;
	}

	public void setDescriptionbox(WebElement descriptionbox) {
		this.descriptionbox = descriptionbox;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public void setSavebutton(WebElement savebutton) {
		this.savebutton = savebutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public void setCancelbutton(WebElement cancelbutton) {
		this.cancelbutton = cancelbutton;
	}
	@FindBy(xpath ="//select[@name ='salutationtype']")
	private WebElement selectsalutation;

	@FindBy(xpath ="//input[@name ='firstname']")
	private WebElement firstnametextfield;
	
	@FindBy(xpath ="//input[@name ='lastname']")
	private WebElement lastnametextfield;
	
	@FindBy(xpath ="//input[@name ='company']")
	private WebElement companynametextfield;
	
	@FindBy(xpath ="//input[@name ='designation']")
	private WebElement designationname;
	
	@FindBy(xpath="//select[@name ='leadsource']")
	private WebElement selectleadsource;
	
	@FindBy(xpath ="//select[@name ='industry']")
	private WebElement selectindustrytype;
	
	@FindBy(xpath ="//select[@name ='leadstatus']")
	private WebElement selectleadstatus;
	
	@FindBy(xpath ="//input[@name ='annualrevenue']")
	private WebElement companyannualrevenue;
	 
	@FindBy(xpath ="//input[@value ='U']")
	private WebElement userradiobutton;
	
	@FindBy(xpath ="//input[@value ='U']")
	private WebElement groupradiobutton;
	
	@FindBy(name ="assigned_group_id")
	private WebElement selectassigned_group_id;
	
	@FindBy(id ="phone")
	private WebElement enter_phone_textarea;
	
	@FindBy(name ="website")
	private WebElement leadswebsite;
	
	@FindBy(xpath = "//textarea[@name ='lane']")
	private WebElement laneaddressnox;
	
	@FindBy(xpath ="//input[@name ='city']")
	private WebElement cityaddressbox;
	
	@FindBy(xpath ="//input[@id ='code']")
	private WebElement postalcode;
	
	@FindBy(xpath ="//input[@id ='state']")
	private WebElement statenamebox;
	
	@FindBy(xpath ="//textarea[@name ='description']")
	private WebElement descriptionbox;
	
	@FindBy(xpath ="//input[@name ='button']")
	private WebElement savebutton;
	
	@FindBy(xpath = "//input[@class ='crmbutton small cancel']")
	private WebElement cancelbutton;
	
	public void selectsalutation(String option) {
		Select select =new Select(selectsalutation);
		select.selectByVisibleText(option);
	}
	public void enterfirstname(String firstname) {
		firstnametextfield.sendKeys(firstname);
		
	}
	public void enterlastname(String lastname) {
		lastnametextfield.sendKeys(lastname);
	}
	public void entercompany(String companyname) {
		companynametextfield.sendKeys(companyname);
	}
	public void selectcompany(String companyfield) {
		Select select = new Select(selectindustrytype);
		select.selectByVisibleText(companyfield);
	}
	public void desginationname(String title ) {
		designationname.sendKeys(title);
	}
	
	public void leadsource(String leadsource) {
		Select select = new Select(selectleadstatus);
		select.selectByVisibleText(leadsource);
	}
	
	public void Annualrevenue(String revenue) {
		companyannualrevenue.sendKeys(revenue);
	}
	public void selectradiobutton() {
		groupradiobutton.click();		
	}
	public void assignedgroup(String assigned) {
		Select select = new Select(selectassigned_group_id);
		select.selectByVisibleText(assigned);		
	}
	public void enterphoneno(String number) {
		enter_phone_textarea.sendKeys(number);
		
	}
	public void enterwebsite(String website) {
		leadswebsite.sendKeys(website);
		
	}
	public void Leadsaddress(String address) {
		laneaddressnox.sendKeys(address);
		
	}
	public void postolcode(String postal) {
		postalcode.sendKeys(postal);
	}
	public void state(String state) {
		statenamebox.sendKeys(state);
	}
	public void LeadsDescription(String description) {
		descriptionbox.sendKeys(description);
	}
	public void savebutton() {
		savebutton.click();
		
	}
	public void cancelbutton() {
		cancelbutton.click();	
	}
	

}
