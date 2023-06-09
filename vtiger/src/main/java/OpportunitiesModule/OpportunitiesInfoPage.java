package OpportunitiesModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesInfoPage {
	WebDriver driver;
	public OpportunitiesInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public String verifyOpportunity(String OpportunitiesName) {
		return driver.findElement(By.xpath("(//span[contains(text(), '"+OpportunitiesName+"')])[1]")).getText();
	}
	

}
