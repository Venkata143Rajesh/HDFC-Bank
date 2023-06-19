package PracticeProgramA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B10_Autoit {
	public WebDriver driver;
	

	@Test
	public void fun() throws Exception {
		
	
		
		
		
		 // WebElement ele1 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));//When we have indirect Operations there then we use this WebElement procedure taking ele1 as WebElement example here.
		  
		 //     ele1.sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\locators.PNG");
		  
		//  Thread.sleep(2000);
		 
		 

		
		
	     driver.findElement(By.id("uploadPicture")).click();
	   //driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		  Thread.sleep(2000);
		 
		  
		  //Autoit command.
		  
		   //Runtime.getRuntime().exec("C:\\Users\\Charvik\\Desktop\\Raj Raj.exe"); // sir code
		 Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\LocatorsAutoit.exe");
		 // Runtime.getRuntime().exec("");//Syntex for Auto it code.
		 
	}
  @BeforeTest
  public void beforeTest() throws Exception{
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

		driver.get("https://demoqa.com/automation-practice-form");
   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
