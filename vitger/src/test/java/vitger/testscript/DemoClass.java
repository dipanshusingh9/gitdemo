package vitger.testscript;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vitger.PomRepo.HomePage;
import vitger.PomRepo.LoginPage;

public class DemoClass {
	@Test

	public void  Demo() {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		LoginPage Login = new LoginPage(driver);
		Login.loginaction("admin", "admin");
		
		HomePage home = new HomePage(driver);
		home.ClickonLeadsModules();
	
	}

}
