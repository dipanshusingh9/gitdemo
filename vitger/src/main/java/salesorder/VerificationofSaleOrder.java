package salesorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationofSaleOrder {
	
	WebDriver driver;
	public  VerificationofSaleOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	@FindBy(xpath = "//img[@src ='themes/images/btnL3Search-Faded.gif']")
	private WebElement clickonSearchButton;
	
	@FindBy(xpath = "//input[@class ='txtBox']")
	private WebElement EnterVerifySalesname;
	
	@FindBy(xpath = "/input[@name ='submit']")
	private WebElement SearchButton;
	
	public WebElement getEnterVerifySalesname() {
		return EnterVerifySalesname;
	}
	public void setEnterVerifySalesname(WebElement enterVerifySalesname) {
		EnterVerifySalesname = enterVerifySalesname;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		SearchButton = searchButton;
	}
	
	public WebElement getClickonsearchButton() {
		return clickonSearchButton;
	}
	
	public void setClickonsearchButton(WebElement clickonsearchButton) {
		this.clickonSearchButton = clickonsearchButton;
	} 
	
	public void ClickOperation() {
		clickonSearchButton.click();
	}
	public void SaleSearchName(String SalesName) {
		EnterVerifySalesname.sendKeys(SalesName);
		 
	}
	public void ClickSearchButton() {
		SearchButton.clear();
	}

}
