package OmarAlwan.TestComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import OmarAlwan.pageObject.SignUp;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public SignUp signup;

	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\OmarAlwan\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "firefox.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.chrome.driver", "edge.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
		@BeforeMethod
		public SignUp lauchApplication() throws IOException
		{
			driver = initializeDriver();
			signup = new SignUp(driver);
			signup.goTo();
			return signup;
		}
		
		@AfterMethod
		public void closeApp()
		{
			driver.close();
		}
	

	
		
	}

