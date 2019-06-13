package list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class listh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("file:///C:/Users/qaplanet/Desktop/pract.html");
		
		Select lf= new Select(bo.findElement(By.id("programming-languages")));
		//lf.selectByIndex(1);
		//lf.selectByValue("sadar");
		lf.selectByVisibleText("C++");
		
		
		
		//Multilist
		Select ml= new Select(bo.findElement(By.id("selenium_suite")));
		
		ml.selectByIndex(1);
	
		ml.selectByIndex(3);
		
	
		
		
		
		;
	}

}
