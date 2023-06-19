package PracticeProgramA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A1_Alerts {
	
	public WebDriver driver;
	
	
 @Test
  public void HandlingAlerts() throws Exception {
	  driver.findElement(By.id("alertButton")).click();
		/* Alerts means there is not possible of finding inspect element.
		 * In Alerts two types of dialog boxs are there confirmation box consists of
		 * "OK" button and dialog box consists of "OK" and "cancel" buttons.
		 */
	 //driver.switchTo().alert().accept(); // To click OK button.
	 // driver.switchTo().alert().dismiss();//To click Cancel button.
	 // driver.switchTo().alert().getText();//To getText which is in the dialog box.
	
		/*
		 * String str1 = driver.switchTo().alert().getText();
		 * System.out.println(str1);
		 * Thread.sleep(3000); 
		 * driver.switchTo().alert().accept();
		 * driver.switchTo().alert().dismiss();
		 */
	  
	  
	String str = driver.switchTo().alert().getText();
	System.out.println(str);
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
