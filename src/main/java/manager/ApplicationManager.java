package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	//===========================================================================================
	WebDriver driver;
	HelperUser user;

	/*#########################################################################################*/
	public void initialization () {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");

		//- - - - - - - - - - - - - - - - -
		driver = new ChromeDriver();
		user = new HelperUser(driver);
		//- - - - - - - - - - - - - - - - -
		driver.manage().window().maximize();
		driver.navigate().to("https://telranedu.web.app/home");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	/*#########################################################################################*/

	public void stop () {
		driver.quit();
	}

	//- - - - - - - - - - - - - - - - - - - - - - -

	public HelperUser getUser () {
		return user;
	}
}



