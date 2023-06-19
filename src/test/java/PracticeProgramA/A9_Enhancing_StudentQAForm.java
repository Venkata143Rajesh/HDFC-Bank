package PracticeProgramA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A9_Enhancing_StudentQAForm {
	public WebDriver driver;
	
 
@Test
public void StudentForm() throws Exception {
			
			
//First Name
driver.findElement(By.id("firstName")).sendKeys("Venkata Rajesh");
			
//Last Name
driver.findElement(By.id("lastName")).sendKeys("Chappa");
			  
//Email
driver.findElement(By.id("userEmail")).sendKeys("rajesh52@gmail.com");
			  Thread.sleep(3000);

//Gender
driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
			  Thread.sleep(3000);
			  
//mobile
driver.findElement(By.id("userNumber")).sendKeys("9912345678");
			  Thread.sleep(3000);
			  
//Calendar 
driver.findElement(By.id("dateOfBirthInput")).click();
			  Thread.sleep(3000);
			  
//Selecting July
new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("July");
			  Thread.sleep(3000);
			  
//Selecting year 1994		  
new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1994");
			  Thread.sleep(3000);
			  
//Click on July 27 Date.
driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, July 27th, 1994']")).click();
			  Thread.sleep(5000);
			  
//Enter Subjects As Maths click on textbox
driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).click();
			  Thread.sleep(3000);
//Enter Subjects As Maths //id="subjectsContainer" - changed to id="subjectsInput" in order to get output. all xpaths didn't work here.
driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
			  Thread.sleep(3000);
			  
//Hitting wit Keyboard command
//driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
//			  Thread.sleep(3000); 
//Shift to Next as "TAB" works
 driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
			  Thread.sleep(3000);
			  
//Enter Subjects As English
driver.findElement(By.id("subjectsInput")).sendKeys("English");
			  Thread.sleep(3000);
			  
//Hitting wit Keyboard command
driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
			  Thread.sleep(3000);
			  
			  
//hobbies Sports rel xpath Selectorhub
driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
			  Thread.sleep(3000);
			  
//hobbies Reading abs xpath Selectorhub
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/label[1]")).click();
			  Thread.sleep(3000);
			  
//hobbies Music Abs xpath Selectorhub
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]")).click();
			  Thread.sleep(3000);
			  
			  driver.switchTo().activeElement().sendKeys(Keys.TAB);
//Select picture
//driver.findElement(By.id("uploadPicture")).sendKeys("D:\\james\\locators.PNG"); //this pic taken from D folder
driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\locators.PNG"); //this pic taken from desktop
  		  
//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[8]/div[2]/div[1]/input[1]")).sendKeys("D:\\james.PNG");
				 // Thread.sleep(3000);
			  
			  //CurrentAddress
			  driver.findElement(By.id("currentAddress")).sendKeys("Vizag City Views");
			  Thread.sleep(3000);

				  //Shift to Next as "TAB" works
				 driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
				  
				  
				 
				  //Selecting state 
				  driver.switchTo().activeElement().sendKeys("NCR");
				  driver.switchTo().activeElement().sendKeys(Keys.TAB);
				  driver.switchTo().activeElement().sendKeys(Keys.TAB);
				  Thread.sleep(5000);
				 
				//Selecting State - id
				// driver.findElement(By.id("state")).sendKeys("NCR");
				// driver.findElement(By.id("stateinput")).sendKeys(Keys.TAB);
				// driver.findElement(By.id("stateinput")).sendKeys(Keys.TAB);
				//driver.findElement(By.id("state")).sendKeys(Keys.ENTER);
				// Thread.sleep(5000);
				 
				//Selecting State - using xpath // it will not work here
				 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")).sendKeys("NCR");
				 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")).sendKeys(Keys.TAB);
				 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")).sendKeys(Keys.TAB);
				  //driver.findElement(By.xpath("//div[@id='state']")).sendKeys(Keys.ENTER);
				  //Thread.sleep(5000);
				 
				  //Selecting City - driver.switchTo().activeElement()
				 driver.switchTo().activeElement().sendKeys("Noida");
				 driver.switchTo().activeElement().sendKeys(Keys.TAB);
				 driver.switchTo().activeElement().sendKeys(Keys.TAB);
				  Thread.sleep(5000);
				  
				//Selecting City - id // it will not work here
				// driver.findElement(By.id("city")).sendKeys("Noida");
				// driver.findElement(By.id("cityinput")).sendKeys(Keys.TAB);
				// driver.findElement(By.id("cityinput")).sendKeys(Keys.TAB);
				//driver.findElement(By.id("city")).sendKeys(Keys.ENTER);
				//  Thread.sleep(5000);
				  
				//Selecting City - using xpath // it will not work here
				 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]")).sendKeys("Noida");
				 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]")).sendKeys(Keys.TAB);
				 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]")).sendKeys(Keys.TAB);
					//  driver.findElement(By.xpath("//div[@id='city']")).sendKeys(Keys.ENTER);
					//  Thread.sleep(5000);
				  
				  
				  
				  
				  
				  //Click on Submit button
				  driver.findElement(By.id("submit")).click();
				  Thread.sleep(3000);
				  
				  //Finally click on Close button
				  driver.findElement(By.id("closeLargeModal")).click();
				 Thread.sleep(4000);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriverManager.firefoxdriver().setup(); 
      driver = new FirefoxDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
		  Thread.sleep(5000); 
  }

  @AfterTest
  public void afterTest() {
  }

}
