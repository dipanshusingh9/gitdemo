package CreateLeadRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leadsverification {
	WebDriver driver;
	
	public Leadsverification(WebDriver driver) {
		this.driver = driver;
	}
	public String verifyinfo(String leadName ) {
		return driver.findElement(By.xpath("//span[contains(text(), '"+leadName+"')]")).getText();
	}

}
