package PracticeTestingB;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class B15_Frames {
	public WebDriver driver;
    public Actions action;
	
	  @Test
	  public void clickable() throws InterruptedException {
		  
			
			  // iframe concept
			 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); // Entering into the iframe
			 
			 
			 
			// Element which needs to drag.
			WebElement DragFrom = driver.findElement(By.id("draggable"));

			// Element on which need to drop.
			WebElement DropTo = driver.findElement(By.id("droppable"));

			// Using Action class for drag and drop.
			action = new Actions(driver);

			// Dragged and dropped.
			action.dragAndDrop(DragFrom, DropTo).build().perform();
			

			//Back to Out of the iframe
			driver.switchTo().parentFrame(); // These are two methods to come out from the iframe // without implementing these two methods we cannot do any actions.
			//driver.switchTo().defaultContent();
			
	        Thread.sleep(3000);
			
			driver.findElement(By.linkText("Demos")).click();
		
			
		  
	  }
	  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
