package PracticeProgramA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class A3_Popupwindow {
	public WebDriver driver;
	
	
  @Test
  public void Windowpopup() throws Exception {
	// Clicks on Separate windows
			driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
			Thread.sleep(3000);

			// Click_button
			driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
			Thread.sleep(3000);
			/*Interview QA: How to handle windowspopup?
			 * There two way to handle windowspopup, We are going to handle windowspopup by getWindowHandle and getWindowHandles
			 * if it is a singlewindow we use driver.getWindowHandle(); // sir given ex: it like a single tabulate for each symptoms.[fever ki one,headake ki one like that we need to understand].
			 * if it is a multiplewindow we use driver.getWindowHandles(); //sir given ex: it like a single universal tabulate for multiple symptoms. [For all symptoms we use single universal tabulate.
			 * So we use driver.getWindowHandles(); for everything only because we no need to use  driver.getWindowHandle(); [all are includes in driver.getWindowHandles();only].
			 * if use this we use driver.getWindowHandles(); automatically it includes driver.getWindowHandle();.So we use always driver.getWindowHandles(); 
			 */
			// comeback to Parent window handle
			String backtoParentwinow = driver.getWindowHandle();
			
		


			      //handling Child window 
				  for(String childwindowhandle : driver.getWindowHandles()) {
					  
						/*String backtoParentwinow = driver.getWindowHandle(); //Here = is used because it is single window.
						 * Here String backtoParentwinow variable.Stores the driver.getWindowHandle();
						 * for(String childwindowhandle : driver.getWindowHandles()) // Here :(column) is used because it is Multiple Window.
						 * Here String childwindowhandle variable.Stores the driver.getWindowHandles();
						 */
				  
				  //Switch to Child window 
				  driver.switchTo().window(childwindowhandle); //application is moved to childwindowhandle
				  
				  }
				 
			  driver.manage().window().maximize(); //childwindowhandle is maximized
			 
	         Thread.sleep(5000);

			// Clicks on Blog_Button
			driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click(); //In childwindowhandle is maximized after that it clicked on Blog
	        Thread.sleep(3000);

			driver.close(); //last opened window closes //In childwindowhandle is maximized after that it clicked on Blog and it closed here.
           // driver.quit();//entire window closes
			Thread.sleep(3000);

			// Again Switch focus back to Parent window
			driver.switchTo().window(backtoParentwinow); // Here from Childwindowhandle moved to parentwindowhandle
	        Thread.sleep(10000);

			// Clicks on Home_Button
			driver.findElement(By.linkText("Home")).click(); // Here after moved to parentwindowhandle click operation is done on Home option
			Thread.sleep(3000);
			// driver.quit();//entire window closes
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
/*interview QA:How to handle windowspopup?
 *We are going to handle popup windows by using: if it is a single window driver.getWindowHandle();
 *if there are multiple windows driver.getWindowHandles();
 *After we created that a particular driver.getWindowHandles(); in a variable we are going to write a variable here.
 *driver.switchTo().window(childwindowandle);
 *driver.switchTo().window(backtoParentwinow);
 */

/*What is difference between driver.close(); and driver.quit();?
 * driver.close(); : It is nothing but current focused window means last focused window.
 * Ex: Main window ki last focused window child window here in this program.
 * driver.quit();: Entire Application is Closed.
 */

