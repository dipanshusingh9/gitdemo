package OrganizationsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationRepoistory {
	WebDriver driver;
	public OrganizationRepoistory(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;	
	}
	@FindBy(xpath = "//input[@name = 'accountname']")
	private WebElement Accountname;
	
	@FindBy(xpath = "//select[@name ='industry']")
	private WebElement SelectIndustry;
	
	@FindBy(xpath = "//select[@name ='accounttype']")
	private WebElement SelectAccounttype;
	
	@FindBy(xpath = "//input[@name ='assigntype']")
	private WebElement SelectAssignRadio;
	
	@FindBy(xpath ="//input[@value ='T']")
	private WebElement SelectAssignGroupradio;
	
	@FindBy(xpath = "//select[@name ='assigned_group_id']")
	private WebElement selectAssignedGroupId;
	
	@FindBy(xpath ="//input[@value ='  Save  ']")
	private WebElement SaveButton;
	
	@FindBy(xpath ="//input[contains(@value ,'Cancel')]")
	private WebElement CancelButton;
	
	/**
	 * @return the accountname
	 */
	public WebElement getAccountname() {
		return Accountname;
	}

	/**
	 * @return the selectIndustry
	 */
	public WebElement getSelectIndustry() {
		return SelectIndustry;
	}

	/**
	 * @return the selectAccounttype
	 */
	public WebElement getSelectAccounttype() {
		return SelectAccounttype;
	}

	/**
	 * @return the selectAssignRadio
	 */
	public WebElement getSelectAssignRadio() {
		return SelectAssignRadio;
	}

	/**
	 * @return the selectAssignGroupradio
	 */
	public WebElement getSelectAssignGroupradio() {
		return SelectAssignGroupradio;
	}

	/**
	 * @return the selectAssignedGroupId
	 */
	public WebElement getSelectAssignedGroupId() {
		return selectAssignedGroupId;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return SaveButton;
	}

	/**
	 * @return the cancelButton
	 */
	public WebElement getCancelButton() {
		return CancelButton;
	}

	/**
	 * @param accountname the accountname to set
	 */
	public void setAccountname(WebElement accountname) {
		Accountname = accountname;
	}

	/**
	 * @param selectIndustry the selectIndustry to set
	 */
	public void setSelectIndustry(WebElement selectIndustry) {
		SelectIndustry = selectIndustry;
	}

	/**
	 * @param selectAccounttype the selectAccounttype to set
	 */
	public void setSelectAccounttype(WebElement selectAccounttype) {
		SelectAccounttype = selectAccounttype;
	}

	/**
	 * @param selectAssignRadio the selectAssignRadio to set
	 */
	public void setSelectAssignRadio(WebElement selectAssignRadio) {
		SelectAssignRadio = selectAssignRadio;
	}

	/**
	 * @param selectAssignGroupradio the selectAssignGroupradio to set
	 */
	public void setSelectAssignGroupradio(WebElement selectAssignGroupradio) {
		SelectAssignGroupradio = selectAssignGroupradio;
	}

	/**
	 * @param selectAssignedGroupId the selectAssignedGroupId to set
	 */
	public void setSelectAssignedGroupId(WebElement selectAssignedGroupId) {
		this.selectAssignedGroupId = selectAssignedGroupId;
	}

	/**
	 * @param saveButton the saveButton to set
	 */
	public void setSaveButton(WebElement saveButton) {
		SaveButton = saveButton;
	}

	/**
	 * @param cancelButton the cancelButton to set
	 */
	public void setCancelButton(WebElement cancelButton) {
		CancelButton = cancelButton;
	}
	
	public void EnterAccountName(String AccountName) {
		Accountname.sendKeys(AccountName);		
	}
	public void SelectIndustryType(String option) {
		Select select =new Select(SelectIndustry);
		select.selectByVisibleText(option);
	}	
	public void selectAccountType(String option) {
		Select select = new Select(Accountname);
		select.selectByVisibleText(option);	
	}
	
	public void SelectAssignGroupradio() {
		SelectAssignGroupradio.click();
	}
	public void assignedgroup(String assigned) {
		Select select = new Select(selectAssignedGroupId);
		select.selectByVisibleText(assigned);
	}
	
	
	public void ClickonSaveButton() {
		SaveButton.click();
	}
	
	public void ClickoncCancelButton() {
		CancelButton.click();
	}
		

}
