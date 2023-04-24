package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath ="//*[contains(@alt,'Create Product...')]")
	private WebElement ClickonPlusButton;
	/**
	 * @return the clickonPlusButton
	 */
	public WebElement getClickonPlusButton() {
		return ClickonPlusButton;
	}
	/**
	 * @param clickonPlusButton the clickonPlusButton to set
	 */
	public void setClickonPlusButton(WebElement clickonPlusButton) {
		ClickonPlusButton = clickonPlusButton;
	}
	public void ClickonProductModule() {
		ClickonPlusButton.click();
	}

}
