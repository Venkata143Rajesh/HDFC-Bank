package PracticeProgramA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_MouseOverActions {
	public WebDriver driver; // Global variable.
	public Actions action;   // Global variable.

	
  @Test
  public void MouseOver() throws Exception {
	  action = new Actions(driver);//Here the action variable is associate with driver variable.
	 // driver.findElement(By.linkText("SwitchTo")); //While inspecting MouseOver Element this linkTest start (<a href ...>SwitchTo</a>)

	  WebElement	ele  = driver.findElement(By.linkText("SwitchTo")); //here "SwitchTo" is the WebElement so we Store that in ele as WebElement variable. Allway WebElements are stored in WebElement only WebElement means Internet element.
 // we are taking from Internet the locator element from linkText Internet element means we should write it as WebElement(WebElement variable is ele here).
 // we are taking from getText then we will be type in String(String variable example Str).
 
 //Action Command
action.moveToElement(ele).build().perform(); // here this statement says that asking ele WebElement variable to switchTo the window Option in webpage. Here ele variable consists of this statement [WebElement	ele  = driver.findElement(By.linkText("SwitchTo"));] to understand.
  
Thread.sleep(3000); // It stops the program for 3 seconds while running the output.Then we can clearly observe the values.
  
 driver.findElement(By.linkText("Windows")).click();
 Thread.sleep(3000);
 
	/* example if we want to add more that one mouse over actions then we should write like this sir told.
	 * we can give different WebElement variables like ele1 and ele2 like shown in the below examples 
	 * WebElement ele1 = driver.findElement(By.linkText("AAAA"));
	 * action.moveToElement(ele1).build().perform(); 
	 * WebElement ele2 = driver.findElement(By.linkText("BBBB"));
	 * action.moveToElement(ele2).build().perform();
	 */
  
  }
  @BeforeTest
  public void beforeTest() {
	WebDriverManager.chromedriver().setup(); // While using mavan dependencies pom.xml only we can able to use WebDriverManager.Chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize(); // To maximize window
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
