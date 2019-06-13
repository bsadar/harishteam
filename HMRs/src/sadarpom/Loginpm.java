package sadarpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpm {
	
   WebDriver bo;

   
   By uname=By.xpath("//td[2]/input");
   By pd=By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input");
   void ue_txt(String ss){
	   bo.findElement(uname).sendKeys(ss);
   }
   
   void pd_txt(String bb){
	   bo.findElement(pd).sendKeys(bb);
   }
   Loginpm(WebDriver bro){
	 this.bo=bro;
   }
   

}
