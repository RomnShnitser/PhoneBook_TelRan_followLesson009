package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

	public HelperUser (WebDriver driver) {
		super(driver);
	}

	public boolean isLogged () {
		return isElementPresent(By.xpath("//button[.='Sign Out']"));
	}

	public void logout () {
		mouseClick(By.xpath("//button[.='Sign Out']"));
	}

	public void clickLoginMenuButton () {
		mouseClick(By.xpath("//a[normalize-space()='LOGIN']"));
	}

	public void fillUserForm (User user) {
		type(By.xpath("//input[@placeholder='Email']"), user.getEmail());
		type(By.xpath("//input[@placeholder='Password']"), user.getPassword());
	}

	public void clickLogin () {
		mouseClick(By.cssSelector("button[name='login']"));
	}

	public void goHome () {
		mouseClick(By.xpath("//a[.='HOME']"));
	}

	//===========================================================================================

}
