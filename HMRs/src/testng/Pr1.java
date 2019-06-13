package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pr1 {
  @Test
  @BeforeTest 
  @AfterTest
  @BeforeMethod
  @AfterMethod
  @BeforeClass
  @AfterClass
 @BeforeSuite
 @AfterSuite
 @DataProvider
 
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
    dd.findElement(By.name("txtPassword")).sendKeys("lab1");
    dd.findElement(By.name("Submit")).click();
Assert.assertEquals(dd.getTitle(), "OrangeHRM");

dd.close();
}
}
