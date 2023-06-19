package PracticeTestingB;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12_Assert1 {
	public WebDriver driver;
	
  @Test
  public void Assert1() {
	//Correct title is "Welcome: Mercury Tours" 
	  
		//We taking title as "Mercury Tours" to make the test fail
		  
		  
		
		  String Actualtitle = "Mercury Tours";
		  String Expectedtitle = driver.getTitle(); // here inspect in white space in website find ctrl+f search 
		  System.out.println(Expectedtitle);
		  
		 
		  
		  //1st Statement 
			System.out.println("Welcome to Selenium");
		  
			
			//2nd statement
			//Assert.assertEquals(Actualtitle, Expectedtitle);
		Assert.assertEquals(Actualtitle, Expectedtitle);

		  
		  //3nd Statement
		  System.out.println("Assertion starts here...");
		  
		  //4t Statement
		  System.out.println("A blog for Software Testers");
		  
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
