package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Act1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("https://www.hdfcbank.com/");
		Actions acr=new Actions(dd);
		Thread.sleep(6000);
		acr.moveToElement(dd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a"))).perform();
		Thread.sleep(6000);
		acr.moveToElement(dd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		
		//dd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a")).click();
	}

}
