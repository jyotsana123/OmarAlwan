package OmarAlwan.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponent.AbstractComponent;

public class SignUp extends AbstractComponent {
	
	WebDriver driver;
	public SignUp(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id = "btn-createaccount")
WebElement createAccount;

	@FindBy(css = "#firstname")
	WebElement firstName;
	
	@FindBy(id = "lastname")
	WebElement lastName;
	
	@FindBy(id = "email_address")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "password-confirmation")
	WebElement cnfPassword;
	
	@FindBy(xpath = "//div/form/button")
	WebElement signUp;
	
	@FindBy(css = "#btn-createaccount")
	WebElement clickSignout;
	
	@FindBy(id = "btn-signin")
	WebElement getSigninButton;
	
	//Actions a = new Actions(driver);
	
	public void goTo()
	{
		driver.get("https://omarstage.iworklab.com/");
	}
	
	public void getSignUpPage()
	{
		moveToElement();
		createAccount.click();
	}
	public void getRegisterd(String Firstname, String Lastname, String email, String password, String cnfrmpswd)
	{
		firstName.sendKeys(Firstname);
		lastName.sendKeys(Lastname);
		Email.sendKeys(email);
		Password.sendKeys(password);
		cnfPassword.sendKeys(cnfrmpswd);
		signUp.click();	
	}
	
	public SignIn signOut() throws InterruptedException
	{
		moveToElement();
		clickSignout.click();
		Thread.sleep(7000);
		SignIn si = new SignIn(driver);
		return si;
	}
	
//	public void getSignInButton()
//	{
//		moveToElement();
//		getSigninButton.click();
//	}
}
//Actions a = new Actions(driver);
//a.click(driver.findElement(By.className("w-100"))).build().perform();
//driver.findElement(By.id("btn-createaccount")).click();
//driver.findElement(By.id("firstname")).sendKeys("jyotsana");
//driver.findElement(By.id("lastname")).sendKeys("pandey");
//driver.findElement(By.id("email_address")).sendKeys("jyotsana@yopmail.com");
//driver.findElement(By.id("password")).sendKeys("Test@123");
//driver.findElement(By.id("password-confirmation")).sendKeys("Test@123");
//driver.findElement(By.xpath("//div/form/button")).click();

//Signout
//		a.click(driver.findElement(By.className("w-100"))).build().perform();
//		driver.findElement(By.cssSelector("#btn-createaccount")).click();