package DatakonnectTest.Datakonnect;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HelloAnandTest {
	@Test
	public void Login() {
		System.out.println("Loggin into the application");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ci.datakonnect.com/");
				
	}

}
