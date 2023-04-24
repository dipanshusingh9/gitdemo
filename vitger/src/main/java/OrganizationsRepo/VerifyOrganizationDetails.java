package OrganizationsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VerifyOrganizationDetails {
	
	WebDriver driver;
	public void ClickonOrganizationModule(WebDriver driver) {
		this.driver = driver;	
	}
	
	public String OrganizationName(String name) {
		return driver.findElement(By.xpath("//*[contains(@class ,'"+name+"')]")).getText();
	}
	
	

	
	


	

}
