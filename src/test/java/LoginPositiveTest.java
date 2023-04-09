import models.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPositiveTest extends TestBase {
	@BeforeMethod
	public void precondition () {
		if(app.getUser().isLogged()){
			app.getUser().logout();
		}
		app.getUser().goHome();
	}

	@Test
	public void loginPositiveTest () {
		app.getUser().pauseThreadSleep(1000);
		app.getUser().clickLoginMenuButton();
		User user = User.builder()
				.email("romn.shnitser@gmail.com")
				.password("$Qwerty12345")
				.build();
		app.getUser().pauseThreadSleep(2000);
		app.getUser().fillUserForm(user);
		app.getUser().clickLogin();
	}

	@Test
	public void loginPositiveTest2 () {
		app.getUser().pauseThreadSleep(1000);
		app.getUser().clickLoginMenuButton();
		User user = User.builder()
				.email("romn.shnitser@gmail.com")
				.password("$Qwerty12345")
				.build();
		app.getUser().pauseThreadSleep(2000);
		app.getUser().fillUserForm(user);
		app.getUser().clickLogin();
	}


}
