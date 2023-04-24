package vitger.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "user_name")
	private WebElement usernametextfield;
	
	@FindBy(name = "user_password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "submitButton")
	private WebElement LoginButton;

	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void loginaction(String username ,String password) {
		usernametextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		LoginButton.click();
	}

}
