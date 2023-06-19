package PracticeProgramA;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_Screenshot {
	public WebDriver driver;
	
	@Test
	public void alertscreen() throws Exception {

		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		 
		
   String ATM ="Mango";
		
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    org.openqa.selenium.io.FileHandler.copy(scrFile, new File("F:\\screensort\\"+ATM+".png"));
    
    String STR = "Apple";
    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(scrFile1, new File("F:\\screensort\\"+STR+".png"));
		
	
			}

  @BeforeTest
   public void beforeTest() throws Exception {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("https://demoqa.com/alerts");
			
			
		    String ATM ="Grape";
				
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    org.openqa.selenium.io.FileHandler.copy(scrFile, new File("F:\\screensort\\"+ATM+".png"));
				
			
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
