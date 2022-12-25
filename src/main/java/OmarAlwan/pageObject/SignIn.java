package OmarAlwan.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponent.AbstractComponent;

public class SignIn extends AbstractComponent {
	
	WebDriver driver;
	public SignIn(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement emailId;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(id = "btn-signin")
	WebElement getSigninButton;
	
	@FindBy(xpath = "//div/form/button")
	WebElement loginButton;
	

	public void getSignInButton()
	{
		moveToElement();
		getSigninButton.click();
	}
	
	public void signIn(String email, String pass)
	{
		emailId.sendKeys(email);
		password.sendKeys(pass);
		loginButton.click();
		
	}
}

//SignIn
//a.click(driver.findElement(By.className("w-100"))).build().perform();
//driver.findElement(By.id("btn-signin")).click();
//driver.findElement(By.id("email")).sendKeys("jyotsana@yopmail.com");
//driver.findElement(By.id("pass")).sendKeys("Test@123");
//driver.findElement(By.xpath("//div/form/button")).click();