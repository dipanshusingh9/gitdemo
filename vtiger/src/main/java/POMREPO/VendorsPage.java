package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {
	
	public VendorsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Vendor...']")
	private WebElement vendorPlusButton;

	public WebElement getVendorPlusButton() {
		return vendorPlusButton;
	}
	
	public void clickOnVendorPlusButton() {
		vendorPlusButton.click();
	}

}
