package CreateLeadRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadrepo {
	WebDriver driver;

	public  CreateLeadrepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath ="//img[@src ='themes/softed/images/btnL3Add.gif']")
	private WebElement clickoncreateLeadicon;
	
	public WebElement getClickoncreateLeadicon() {
		return clickoncreateLeadicon;
	}

	public void setClickoncreateLeadicon(WebElement clickoncreateLeadicon) {
		this.clickoncreateLeadicon = clickoncreateLeadicon;
	}
	
	public void createleads() {
		clickoncreateLeadicon.click();
	}
	
	

}
