package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Login lg=new Login();
          lg.tc21();
		
		
		
	}

}
class Login{
	  WebDriver bo;
	  String   bpath =" ";
	
	void tc21(){
		System.setProperty("", "");
		bo =new FirefoxDriver();
		bo.get(bpath);
		
	}
	
}