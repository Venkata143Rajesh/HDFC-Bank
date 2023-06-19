package PracticeProgramA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class A8_Boolean_Oneway {
	public WebDriver driver;
  @SuppressWarnings("unused")
@Test
  public void options() throws Exception{
	//Switching to Roundtrip (this is one type to show Roundtrip)
	  driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).click();
	  Thread.sleep(3000);
	  
	  
	//Print Condition True or False (this is one type to show Roundtrip using boolean expression)
	  boolean printcondition = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).isDisplayed();
		  
		  System.out.println(printcondition);
		  
			/*
			 * //Print Condition True or False (this is one type to show Roundtrip using boolean expression) 
			 * boolean printcondition1 = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).isEnabled();
			 * System.out.println(printcondition1);
			  
			 * //Print Condition True or False (this is one type to show Roundtrip using boolean expression) 
			 * boolean printcondition2= driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).isSelected();
			 * System.out.println(printcondition2);
			 */
		  //This is one type to show Roundtrip in practical way using If else condition
		  WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]"));
			
			if (ele1.isEnabled()) {
				
				System.out.println("Round trip is there passed");
				
			} else {
				
				System.out.println("No Not available");

			}		  
			
//WebElement ele2 = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]"));
			
			//if (ele1.isDisplayed()) {
				
			//	System.out.println("Round trip is tere passed");
				
			//} else {
				
			//	System.out.println("No Not available");

			//}		  
			
//WebElement ele3 = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]"));
			
	//		if (ele1.isSelected()) {
				
	//			System.out.println("Round trip is tere passed");
				
		//	} else {
				
		//		System.out.println("No Not available");

		//	}		  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://savaari.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
