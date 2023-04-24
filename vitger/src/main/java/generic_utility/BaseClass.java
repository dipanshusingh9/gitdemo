package generic_utility;

import java.io.IOException;
import java.sql.Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import vitger.PomRepo.HomePage;
import vitger.PomRepo.LoginPage;

public class BaseClass {

	public static WebDriver sDriver;
	public WebDriver driver;
	public WebDriverUtilityfile wUtils = new WebDriverUtilityfile();
	public FileUtility fUtils=new FileUtility();
	public ExcelUtility eUtils=new ExcelUtility();

	public Connection connection;
	
	/*@BeforeSuite
	public void bsConfig() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
		System.out.println("Data base connection has been established");
	}
*/
	@BeforeClass
	public void bcConfig() throws IOException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		wUtils.MaximiztheBrowser(driver);
		wUtils.ImplicitWait(driver);
		System.out.println("The browser has been launched");
		String url = fUtils.FetchDatafrompropertyfile("url");
		driver.get(url);
		System.out.println("The URL has been navigated");
		sDriver = driver;
	}

	@BeforeMethod
	public void bmConfig() throws IOException {
		String username = fUtils.FetchDatafrompropertyfile("username");
		String password = fUtils.FetchDatafrompropertyfile("password");
		
		LoginPage login=new LoginPage(driver);
		login.loginaction(username, password);
		System.out.println("Logged in to the application");
	}

	@AfterMethod
	public void amConfig() {
		HomePage home=new HomePage(driver);
		home.signout();
		System.out.println("Logged out from the application");
	}

	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("The browser has been closed");
	}

/*	@AfterSuite
	public void asConfig() throws SQLException {
		connection.close();
		System.out.println("The Data base connection has been closed");
	}
*/
}
