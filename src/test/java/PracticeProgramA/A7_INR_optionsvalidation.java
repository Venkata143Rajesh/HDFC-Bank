package PracticeProgramA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_INR_optionsvalidation {
	public WebDriver driver;
  @Test
  public void options() {
	  List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();

	  System.out.println(allvalues.get(5).getText()); //it is for single value selected one will get in output
	  //in this syntax get(5) is index value here index value 5 means 6 will be consider because index values are start with 0,1,2,3,4..
	  

	  //Print all values from A to Z(Starting to ending)
	  for (int i = 0; i < allvalues.size(); i++) {
	    
	    System.out.println(allvalues.get(i).getText()); //in this syntax get(i) is index value here in this program full.
	    
	    
	    //Checking comparison with equalIgnoreCase or Contains(ValidationProspective) 
	  if (allvalues.get(i).getText().contains("13")) {
	    
	    System.out.println(allvalues.get(i).getText());
	    System.out.println("Its passed 13");
	    
	   
	    }

	  	
	  	/*
	  	 * else {
	  	 * 
	  	 * System.out.println("Not Matces");
	  	 * 
	  	 * }
	  	 */
	  	 



	    }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "G:\\System.setproperty concept\\geckodriver.exe");
	  driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
	driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
