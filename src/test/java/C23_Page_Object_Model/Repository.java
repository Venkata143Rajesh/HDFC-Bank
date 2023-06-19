package C23_Page_Object_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repository {
	
public static WebDriver driver;
	//here every we will not take @Test but we will write here in normal java functionality methods only in p
	//login 
	public static void login() throws Exception {
		driver.findElement(Locators.username1).sendKeys(TestData.username1);
		driver.findElement(Locators.Password).sendKeys(TestData.Password);
		driver.findElement(Locators.Login).click();
		Thread.sleep(3000);
	}
		public static void alerts() {
			driver.switchTo().alert().accept();
		}
		
		public static void popupwindows() {
			String winhandle = driver.getWindowHandle();
			driver.switchTo().window("winhandle");
		}
	
  @BeforeTest
  public static void setup() {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
			driver.get(TestData.url); //It is written from TestData.java
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
  }
  @AfterTest
  public void afterTest() {
	  
  }

}
