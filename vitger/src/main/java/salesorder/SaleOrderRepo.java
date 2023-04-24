package salesorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaleOrderRepo {
	WebDriver driver;
	public SaleOrderRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath = "//input[@name= 'subject']")
	private WebElement SubjectName ;
		
	@FindBy(id ="customerno")
	private WebElement CustomerNumber;
	
	@FindBy(id = "vtiger_purchaseorder")
	private WebElement PurchaseOrder;
	
	@FindBy(id ="exciseduty")
	private WebElement ExciseDutytextarea;
	
	@FindBy(id ="salescommission")
	private WebElement SalesCommission;
	
	@FindBy(xpath ="//select[@name ='carrier']")
	private WebElement selectCarrierDropdown;
	
	@FindBy(xpath ="//select[@name ='sostatus']")
	private WebElement SelectSalesStatus;
	
	@FindBy(xpath = "//input[@name ='assigntype']")
	private WebElement UserRadioButton;
	
	@FindBy(xpath ="//input[@value ='T']")
	private WebElement GroupRadioButton;
	
	@FindBy(xpath ="//select [@name='assigned_group_id']")
	private WebElement aasignedgroup;
	
	@FindBy(id ="pending")
	private WebElement PendingTextArea;
	
	@FindBy(xpath = "//*[contains(text() ,'Copy Shipping address')]")
	private WebElement CopyShippingRadioButton;
	
	@FindBy(xpath = "//*[contains(text() ,'Copy Billing address')]")
	private WebElement CopyBillingRadioButton;
	
	@FindBy(xpath ="//select[@name ='invoicestatus']")
	private WebElement selectInvoiceStatus;
	
	@FindBy(xpath ="//textarea[@name ='bill_street']")
	private WebElement billingadresstextarea;
	
	@FindBy(xpath = "//input[@id ='bill_pobox']")
	private WebElement billingpoarea;
	
	@FindBy(xpath ="//input[@id ='bill_state']")
	private WebElement billingstatearea;
	
	@FindBy(xpath = "//input[@id ='bill_code']")
	private WebElement postalcodearea;
	 
	@FindBy(xpath ="//input[@id ='bill_country']")
	private WebElement countryarea;
	
	@FindBy(xpath = "//input[@class ='crmbutton small save']")
	private WebElement ClickonSaveButton;
	
	@FindBy(xpath ="//input[@class ='crmbutton small cancel']")
	private WebElement ClickonCancelButton;
	
	@FindBy(xpath ="//*[contains(@onclick ,'specific_account_address')]")
	private  WebElement organizationlookup;
	
	@FindBy(xpath ="//img[@id ='searchIcon1']")
	private WebElement productslookup;
	
	public WebElement getSubjectName() {
		return SubjectName;
	}
	
	public WebElement getProductslookup() {
		return productslookup;
	}

	public WebElement getCustomerNumber() {
		return CustomerNumber;
	}

	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}

	public WebElement getExciseDutytextarea() {
		return ExciseDutytextarea;
	}

	public WebElement getSalesCommission() {
		return SalesCommission;
	}

	public WebElement getSelectCarrierDropdown() {
		return selectCarrierDropdown;
	}

	public WebElement getSelectSalesStatus() {
		return SelectSalesStatus;
	}

	public WebElement getUserRadioButton() {
		return UserRadioButton;
	}

	public WebElement getGroupRadioButton() {
		return GroupRadioButton;
	}

	public WebElement getAasignedgroup() {
		return aasignedgroup;
	}

	public WebElement getPendingTextArea() {
		return PendingTextArea;
	}

	public WebElement getCopyShippingRadioButton() {
		return CopyShippingRadioButton;
	}

	public WebElement getCopyBillingRadioButton() {
		return CopyBillingRadioButton;
	}

	public WebElement getSelectInvoiceStatus() {
		return selectInvoiceStatus;
	}

	public WebElement getBillingadresstextarea() {
		return billingadresstextarea;
	}

	public WebElement getBillingpoarea() {
		return billingpoarea;
	}

	public WebElement getBillingstatearea() {
		return billingstatearea;
	}

	public WebElement getPostalcodearea() {
		return postalcodearea;
	}

	public WebElement getCountryarea() {
		return countryarea;
	}

	public WebElement getClickonSaveButton() {
		return ClickonSaveButton;
	}

	public WebElement getClickonCancelButton() {
		return ClickonCancelButton;
	}

	public WebElement getOrganizationlookup() {
		return organizationlookup;
	}
	

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(WebElement subjectName) {
		SubjectName = subjectName;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(WebElement customerNumber) {
		CustomerNumber = customerNumber;
	}

	/**
	 * @param purchaseOrder the purchaseOrder to set
	 */
	public void setPurchaseOrder(WebElement purchaseOrder) {
		PurchaseOrder = purchaseOrder;
	}

	/**
	 * @param exciseDutytextarea the exciseDutytextarea to set
	 */
	public void setExciseDutytextarea(WebElement exciseDutytextarea) {
		ExciseDutytextarea = exciseDutytextarea;
	}

	/**
	 * @param salesCommission the salesCommission to set
	 */
	public void setSalesCommission(WebElement salesCommission) {
		SalesCommission = salesCommission;
	}

	/**
	 * @param selectCarrierDropdown the selectCarrierDropdown to set
	 */
	public void setSelectCarrierDropdown(WebElement selectCarrierDropdown) {
		this.selectCarrierDropdown = selectCarrierDropdown;
	}

	/**
	 * @param selectSalesStatus the selectSalesStatus to set
	 */
	public void setSelectSalesStatus(WebElement selectSalesStatus) {
		SelectSalesStatus = selectSalesStatus;
	}

	/**
	 * @param userRadioButton the userRadioButton to set
	 */
	public void setUserRadioButton(WebElement userRadioButton) {
		UserRadioButton = userRadioButton;
	}

	/**
	 * @param groupRadioButton the groupRadioButton to set
	 */
	public void setGroupRadioButton(WebElement groupRadioButton) {
		GroupRadioButton = groupRadioButton;
	}

	/**
	 * @param aasignedgroup the aasignedgroup to set
	 */
	public void setAasignedgroup(WebElement aasignedgroup) {
		this.aasignedgroup = aasignedgroup;
	}

	/**
	 * @param pendingTextArea the pendingTextArea to set
	 */
	public void setPendingTextArea(WebElement pendingTextArea) {
		PendingTextArea = pendingTextArea;
	}

	/**
	 * @param copyShippingRadioButton the copyShippingRadioButton to set
	 */
	public void setCopyShippingRadioButton(WebElement copyShippingRadioButton) {
		CopyShippingRadioButton = copyShippingRadioButton;
	}

	/**
	 * @param copyBillingRadioButton the copyBillingRadioButton to set
	 */
	public void setCopyBillingRadioButton(WebElement copyBillingRadioButton) {
		CopyBillingRadioButton = copyBillingRadioButton;
	}

	/**
	 * @param selectInvoiceStatus the selectInvoiceStatus to set
	 */
	public void setSelectInvoiceStatus(WebElement selectInvoiceStatus) {
		this.selectInvoiceStatus = selectInvoiceStatus;
	}

	/**
	 * @param billingadresstextarea the billingadresstextarea to set
	 */
	public void setBillingadresstextarea(WebElement billingadresstextarea) {
		this.billingadresstextarea = billingadresstextarea;
	}

	/**
	 * @param billingpoarea the billingpoarea to set
	 */
	public void setBillingpoarea(WebElement billingpoarea) {
		this.billingpoarea = billingpoarea;
	}

	/**
	 * @param billingstatearea the billingstatearea to set
	 */
	public void setBillingstatearea(WebElement billingstatearea) {
		this.billingstatearea = billingstatearea;
	}

	/**
	 * @param postalcodearea the postalcodearea to set
	 */
	public void setPostalcodearea(WebElement postalcodearea) {
		this.postalcodearea = postalcodearea;
	}

	/**
	 * @param countryarea the countryarea to set
	 */
	public void setCountryarea(WebElement countryarea) {
		this.countryarea = countryarea;
	}

	/**
	 * @param clickonSaveButton the clickonSaveButton to set
	 */
	public void setClickonSaveButton(WebElement clickonSaveButton) {
		ClickonSaveButton = clickonSaveButton;
	}

	/**
	 * @param clickonCancelButton the clickonCancelButton to set
	 */
	public void setClickonCancelButton(WebElement clickonCancelButton) {
		ClickonCancelButton = clickonCancelButton;
	}

	/**
	 * @param organizationlookup the organizationlookup to set
	 */
	public void setOrganizationlookup(WebElement organizationlookup) {
		this.organizationlookup = organizationlookup;
	}

	/**
	 * @param productslookup the productslookup to set
	 */
	public void setProductslookup(WebElement productslookup) {
		this.productslookup = productslookup;
	}
	
	public void EnterSubjectName(String Subject) {
		SubjectName.sendKeys(Subject);
	}
	
	public void EnterCustomerNumber(CharSequence[] Serialno) {
		CustomerNumber.sendKeys(Serialno);
	}
	

}
