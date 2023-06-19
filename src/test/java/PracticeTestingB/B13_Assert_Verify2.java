package PracticeTestingB;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B13_Assert_Verify2 {
	public WebDriver driver;
  @Test
  public void Assert_Verify2() {

		String Actualvalue = "$3";
		String Expectedvalue = driver.findElement(By.xpath("//b[contains(text(),'$398')]")).getText();
		System.out.println(Expectedvalue);
		
	
	
		  try{
				
			  // 1st statement
				System.out.println("Assertion starts here...");
				
				Assert.assertEquals(Actualvalue, Expectedvalue); //Actualvalue is $3 and Expectedvalue is $398 from above statement.here Assert.assertEquals means comparision of two values are same or not like example: Assert.assertEquals("False","True")
				//when we give these value it compares and tells that pass or fail it it fails the statement breaks there it self.
				
					
		  }
		  
		  catch (Throwable t){	
			  

				// 3rd statement
				System.out.println("Apple");

				// 4t statement
				System.out.println("A blog for Software Testers"); 
		  
		  }
		  
		

		driver.quit();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
