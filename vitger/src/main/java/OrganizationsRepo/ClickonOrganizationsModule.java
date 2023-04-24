package OrganizationsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickonOrganizationsModule {
	WebDriver driver;
	public void ClickonOrganizationModule(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;	
	}
	
	@FindBy(xpath ="//*[contains(text() ,'Organizations')]")
	private WebElement OrganizationModule;
	
	/**
	 * @return the organizationModule
	 */
	public WebElement getOrganizationModule() {
		return OrganizationModule;
	}
	
	public void ClickonOrganizationModule() {
		OrganizationModule.click();
	}
	
	

}
