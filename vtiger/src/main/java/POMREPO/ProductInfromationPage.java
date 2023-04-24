package POMREPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductInfromationPage {
	
	WebDriver driver;
	public ProductInfromationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String verifyProduct(String productName) {
		return driver.findElement(By.xpath("(//span[contains(text(), '"+productName+"')])[1]")).getText();
	}


}
