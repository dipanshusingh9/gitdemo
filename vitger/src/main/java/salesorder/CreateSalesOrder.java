package salesorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesOrder {
	WebDriver driver;
	
	public CreateSalesOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath = "//img[@src ='themes/softed/images/btnL3Add.gif']")
	private WebElement createsaleorder;

	public WebElement getCreatesaleorder() {
		return createsaleorder;
	}
	public void setCreatesaleorder(WebElement createsaleorder) {
		this.createsaleorder = createsaleorder;
	}
	
	public void createSale() {
		createsaleorder.click();
	}

}
