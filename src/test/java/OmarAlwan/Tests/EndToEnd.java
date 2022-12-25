package OmarAlwan.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OmarAlwan.TestComponent.BaseTest;
import OmarAlwan.pageObject.SignIn;
import OmarAlwan.pageObject.SignUp;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEnd extends BaseTest {
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
	@Test
	public void endToEnd() throws InterruptedException
	{

		SignUp signup = new SignUp(driver);
		signup.getSignUpPage();
		signup.getRegisterd("jyotsana", "pandey", "jp10@yopmail.com", "Test@123", "Test@123");
		SignIn si = signup.signOut();
		si.getSignInButton();
		si.signIn("jp4@yopmail.com", "Test@123");
	}

}
