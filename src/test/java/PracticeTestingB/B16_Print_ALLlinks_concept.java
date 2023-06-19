package PracticeTestingB;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class B16_Print_ALLlinks_concept {
	public WebDriver driver;
	@Test
	public void clickable() {

		List<WebElement> str = driver.findElements(By.tagName("a")); //To find number total tags found in the website or any url That is Alllinks_concept
		//here in above Statement the number of a's tags that a is assigned in list<WebElement> and entire statement stored in str variable.
		System.out.println(str.size());
			

		for (int i = 0; i <= str.size(); i++) { // Here str.size is contains hole size of the tags total present in website or url
			
			
			
			  if (str.get(i).getText().equalsIgnoreCase("")) { // here get(i) is index value list inspects start's with tag (<a> ends with </a>).
			  //here in the above statement  str.get(i).getText() is the value when does not match with equalsIgnoreCase("") means nothing then it will print in O/P as this statement "Maintaining some gaps in Application" then we can understand that there is no link provided in that gap only this statement prints. 
			  System.out.println("Maintaining some gaps in Application");
			  
			  }
			 
			 
			System.out.println(str.get(i).getText()); 
			 
			

		}

	}
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}

//interview Question?
//if you find single element then we use findElement 
//if you find multiple combination elements then we use findElements
