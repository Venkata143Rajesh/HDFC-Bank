package C23_Page_Object_Model;

import org.testng.annotations.Test;

public class TestCasesExecution extends Repository {
  @Test
  public void alltestexecution() throws java.lang.Exception {
	  
	  Repository.login();
	  Repository.alerts();
	  Repository.popupwindows();
	  Thread.sleep(3000);
	  
  }
 
}
