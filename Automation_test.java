package forTestingPurpose;

import org.testng.annotations.Test;

import com.qa.baseclass.TestBase;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Automation_test extends TestBase {
 //here i have used TESTng class and  hybrid framewrok 
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver() ;
	  System.getProperty("path of the chromedriver");
      driver.manage().window().maximize();
	  driver.get("https://accounts.datoms.io/login");
	  
	  
	  
  }

  
  @Test(priority = 1)
  public void Login() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ankit@04");
	  driver.findElement(By.xpath("//*[@id='form_submit_btn']")).click();
	  System.out.println("User successfully logged in ");
  }
  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("closing browser");
	  driver.close();
	  
  }
}
