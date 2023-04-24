package vitger.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	@FindBy(linkText ="Calendar")
	private WebElement calendarlink;
	
	@FindBy(linkText ="Leads")
	private WebElement Leadsmodules;
	
	@FindBy(linkText ="Organizations")
	private WebElement organizationsclink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactlink;
	
	@FindBy(linkText = "Opportunities")
	private WebElement Opportunitieslink;
	
	@FindBy(linkText = "Products")
	private WebElement Productslink;
	
	@FindBy(linkText ="Documents")
	private WebElement Documentslink;
	
	@FindBy(linkText ="Email")
	private WebElement Emaillink ;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTicketslink;
	
	@FindBy(linkText= "Dashboard")
	private WebElement Dashboardlink;
	
	@FindBy(linkText = "More")
	private WebElement Morelink;
	
	@FindBy(xpath ="//a[@name ='Sales Order']")
	private WebElement salesorderoption;
	
	@FindBy(xpath ="//a[@name ='Purchase Order']")
	private WebElement PurchaseOrderlink;
	
	@FindBy(xpath ="//a[@name ='Campaigns']")
	private WebElement Campaignsoption;
	
	@FindBy(linkText = "Invoice")
	private WebElement invoicelink;
	
	@FindBy(linkText ="Project Tasks")
	private WebElement projecttasklink;
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutlink;
	
	@FindBy(xpath ="//*[@id=\"ondemand_sub\"]/table/tbody/tr[2]/td/a")
	private WebElement signoutoption ;
	
	@FindBy(linkText = "More")
	private WebElement morelink;
	
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getOrganizationsclink() {
		return organizationsclink;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCalendarlink() {
		return calendarlink;
	}

	public WebElement getLeadslink() {
		return Leadsmodules;
	}

	public WebElement getOrganizationsclick() {
		return organizationsclink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getOpportunitieslink() {
		return Opportunitieslink;
	}

	public WebElement getProductslink() {
		return Productslink;
	}

	public WebElement getDocumentslink() {
		return Documentslink;
	}

	public WebElement getEmaillink() {
		return Emaillink;
	}

	public WebElement getTroubleTicketslink() {
		return TroubleTicketslink;
	}

	public WebElement getDashboardlink() {
		return Dashboardlink;
	}

	public WebElement getMorelink() {
		return Morelink;
	}

	public WebElement getSalesorderlink() {
		return salesorderoption;
	}

	public WebElement getPurchaseOrderlink() {
		return PurchaseOrderlink;
	}

	public WebElement getCampaignslink() {
		return Campaignsoption;
	}

	public WebElement getInvoicelink() {
		return invoicelink;
	}

	public WebElement getProjecttasklink() {
		return projecttasklink;
	}
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getSignoutlink() {
		return signoutoption;
	}
	
	//Business Logic
	public void calendarlinkModule() {
		calendarlink.click();
	}
	public void ClickonLeadsModules() {
		Leadsmodules.click();
	}
	public void clickonorganizationsModule() {
		organizationsclink.click();
	}
	
	public void clickonProductsModule() {
		Productslink.click();
	}
	public void clickonDocumentsModule() {
		Documentslink.click();
	}
	public void clickonEmailModule() {
		Emaillink.click();
	}
	public void clickonTroubleTicketsModule() {
		TroubleTicketslink.click();
	}
	public void clickonDashboardModule() {
		Dashboardlink.click();
	}
	public void clickonMore() {
		Morelink.click();
	}
	public void clickonsalesorderModule() {
		salesorderoption.click();
	}
	public void clickonPurchaseOrderModule() {
		PurchaseOrderlink.click();
	}
	public void clickonCampaignsModule() {
		Campaignsoption.click();
	}
	public void clickoninvoiceModule() {
		invoicelink.click();
	}
	public void clickonlogoutModule() {
		logoutlink.click();
	}
	public void clickonsignoutModule() {
		signoutoption.click();
	}
	public void clickonvendor() {
		Actions action =new Actions(driver);
		action.moveToElement(Morelink).click(salesorderoption).perform();
	}
	public void clickoncampaign() {
	 Actions action = new Actions(driver);
	 action.moveToElement(Morelink).click(Campaignsoption).perform();
	}
	public void signout() {
		Actions action = new Actions(driver);
		action.moveToElement(logoutlink);
		action.click(signoutoption).perform();
	}

	

}
