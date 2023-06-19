package PracticeProgramA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_Firstselectedoption {
	public WebDriver driver;
	
	@Test
	public void options() throws Exception {

	WebElement ele = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
		System.out.println(ele.getText());
		// after storing new Select(driver.findElement(By.id("day"))).getFirstSelectedOption(); 
		//this value in webElement Variable ele we can write ele.getText(); because previous concept as we studied getText is used only for outside of the tag. 
        //Container or equalsIgnoreCase both we can use here both are same.
		//equalsIgnoreCase --> means may be you can take caps letter or small letter it's fine.it will compare positively.
		//Here we cannot take getText directly but after keeping it in variable ele we can have right to question with getText being a software test engineer.
	
		/*
		 * if (ele.getText().equalsIgnoreCase("16")) {
		 * 
		 * System.out.println("Passed default value is 16");
		 * 
		 * } else {
		 * 
		 * System.out.println("Doent missed its fail");
		 * 
		 * 
		 * }
		 */
	
		
	//	if (ele.getText().contains("5")) {
	//		 System.out.println("5 is tere its passs");
				
	//	} else {
			
	//		System.out.println("5 is not  tere its Fail");

	//	}

		
		 
		 if (ele.getText().equalsIgnoreCase("5")) {
			 
			 System.out.println("5 is there its passs");
			
		} else {
			
			System.out.println("5 is not  there its Fail");

		}

	}

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
