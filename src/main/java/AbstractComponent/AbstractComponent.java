package AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponent {

	WebDriver driver;
	public AbstractComponent(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "w-100")
	WebElement accountHover;
	
	public void moveToElement()
	{
		Actions a = new Actions(driver);
		a.moveToElement(accountHover).build().perform();
	}
}
